package com.example.zikri_cafe.dapur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zikri_cafe.databinding.ActivityDapurBinding
import com.example.zikri_cafe.db.MappingHelper
import com.example.zikri_cafe.db.PesananHelper
import com.example.zikri_cafe.model.PesananModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class DapurActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDapurBinding
    private lateinit var pesananHelper: PesananHelper
    private lateinit var adapterr: DapurAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDapurBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dapur"

        adapterr = DapurAdapter(object : DapurAdapter.IOnItemClickCallback {
            override fun onItemClicked(data: PesananModel, position: Int) {
                showDialog(data, position)
            }
        })
        showListDapur()
    }

    fun showListDapur() {
        lifecycleScope.launch {
            pesananHelper = PesananHelper.getInstance(applicationContext)
            pesananHelper.open()

            val defferedPesanan = async(Dispatchers.IO) {
                val cursor = pesananHelper.queryAll()
                MappingHelper.mapCursorToArrayList(cursor)
            }

            val dataDapur = defferedPesanan.await()
            if (dataDapur.size >0) {
                adapterr.listDapur = dataDapur
            } else {
                adapterr.listDapur = arrayListOf()
            }
            pesananHelper.close()
            showRvDapur()
        }
    }

    fun showRvDapur() {
        binding.idrvDapur.apply {
            adapter = adapterr
            layoutManager = LinearLayoutManager(this@DapurActivity)
        }
    }

    fun showDialog(data: PesananModel, position: Int) {
        val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Confirmasi")
                .setMessage("Apakah menu sudah siap ?")
                .setPositiveButton("Sudah") { _, _ ->
                    pesananHelper.open()
                    pesananHelper.deleteById(data.id.toString())
                    adapterr.delete(position)
                    Toast.makeText(this, "pesanan  Sudah selesai", Toast.LENGTH_SHORT).show()
                    showRvDapur()
                }
                .setNegativeButton("Batal") { dialog, _ ->
                    dialog.cancel()
                }
                .create()
                .show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}