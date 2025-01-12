package com.example.zikri_cafe.pesanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.zikri_cafe.R
import com.example.zikri_cafe.databinding.ActivityPesananBinding
import com.example.zikri_cafe.key.Key

class PesananActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPesananBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPesananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = "Pesanan"

        binding.idbtnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_lanjut -> {
                val noMeja = binding.idedtNomermeja.text.toString()

                if (noMeja.isEmpty()) {
                    binding.idedtNomermeja.error = "Tidak boleh kosong"
                }
                else if (noMeja > 50.toString()){
                    Toast.makeText(this, "masukan nomer meja yang tersedia 1~50", Toast.LENGTH_SHORT).show()
                }
                else {
                    val intent = Intent(this, ListPesananActivity::class.java)
                    intent.putExtra(Key.KEY_NO_MEJA, noMeja)
                    startActivity(intent)
                }

            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}