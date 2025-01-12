package com.example.zikri_cafe.datamenu

import com.example.zikri_cafe.model.ItemKategori

object DataMenu {
    val dataMakananImage = arrayListOf<String>(
        "https://assets-pergikuliner.com/Qf_ji_Rqwgu_g4Wdatw0SFp1GTE=/fit-in/1366x768/smart/filters:no_upscale()/https://assets-pergikuliner.com/uploads/image/picture/1234901/picture-1548388995.jpg",
        "https://blog.anteraja.id/wp-content/uploads/2020/12/Bisnis-Roti-Bakar-Jajanan-Legendaris-yang-Masih-Menguntungkan.jpg",
        "https://akcdn.detik.net.id/api/wm/2022/02/03/cara-praktis-membuat-resep-batagor-bandung-ala-abang-kaki-limainstagramendro_169.jpeg",
        "https://asset.kompas.com/crops/cCrQENqzDisGGBW4kXcRpZQIf6g=/0x0:849x566/750x500/data/photo/2021/07/09/60e7fa13d4bea.jpg",
        "https://asset.kompas.com/crops/s72RSAiLNOcS5MFdlr6B8pyLquo=/0x0:1000x667/750x500/data/photo/2021/09/28/6152ae21da928.jpg",
        "https://thumbs.dreamstime.com/b/spaghetti-bolognese-black-serving-platter-fresh-basil-parmesan-44237816.jpg",
        "https://selerasa.com/wp-content/uploads/2015/12/images_daging_ayam-goreng-1200x720.jpg",
        "https://img-global.cpcdn.com/recipes/3df4b7a9cecaf11d/680x482cq70/sate-kelinci-bumbu-kacang-foto-resep-utama.jpg"
    )

    val dataMakananNama = arrayListOf<String>(
        "Seblak",
        "Roti Bakar Susu Keju",
        "Batagor",
        "Cireng",
        "Nasi Goreng",
        "Spagetti",
        "Ayam Goreng",
        "Sate Ayam"
    )

    val dataMakananDeskripsi = arrayListOf<String>(
        "Makanan khas bandung yang sangat nikmat jika dimakan atau diberikan pacar",
        "Roti bakar dengan dengan toping susu, keju, dan coklat",
        "Terlahir dari Inovasi Baso dan Tahu Goreng untuk disajikan H. Ihsan Bandung",
        "Sebuah Camilan dengan bentuk dan cita rasanya yang khas sudah terkenal serta disukai oleh hampir seluruh masyarakat",
        "Tanpa Nasi, hanya akan ada onalisme tak ada Nasionalisme",
        "Spagetti lembut dan enak dengan kaldu",
        "Ayam goreng garing gurih dan krispi",
        "Sate ayam dengan bumbu pilihan"
    )

    val dataMakananHarga = arrayListOf<String>(
        "10000",
        "9000",
        "15000",
        "15000",
        "35000",
        "29000",
        "25000",
        "45000"
    )

    val dataMakanan: ArrayList<ItemKategori>
    get() {
        val list = arrayListOf<ItemKategori>()
        for (item in dataMakananNama.indices) {
            list.add(ItemKategori(dataMakananImage[item], dataMakananNama[item], dataMakananDeskripsi[item], dataMakananHarga[item]))
        }
        return list
    }

    val dataMinumanImage = arrayListOf<String>(
        "https://i.gojekapi.com/darkroom/gofood-indonesia/v2/images/uploads/9d1619df-6393-4fa9-bb0f-1d41cf630d13_41c02b6d-8a4e-4c27-9d2e-4eace92ecf12_Go-Biz_20191210_145643.jpeg",
        "https://statics.indozone.news/content/2019/10/07/ers0M9/t_5d9ae209ae934_700.jpg",
        "https://w7.pngwing.com/pngs/988/949/png-transparent-orange-juice-orange-drink-lemon-lime-drink-green-tea-glass-cocktail-non-alcoholic-beverage.png",
        "https://www.jagel.id/api/listimage/v/Es-Boba-0-334610b4c01cf39a.jpg",
        "https://media-cdn.tripadvisor.com/media/photo-s/16/88/29/ef/jus-alpukat.jpg",
        "https://th.bing.com/th/id/OIP.r6hFv5teQOPOyVgw_2-Q3wHaFj?pid=ImgDet&w=600&h=450&rs=1"
    )

    val dataMinumanNama = arrayListOf<String>(
        "Kopi Hitam",
        "Cappucino",
        "Sparkling Tea",
        "Thaitea",
        "Alpukat",
        "Susu Coklat"
    )

    val dataMinumanDeskripsi = arrayListOf<String>(
        "Secangkir Kopi Hitam penuh makna yang mengingatkanku bahwa semanis apapun hidup rasa pahit akan selalu ada",
        "Keseimbangan dan Keindahan adalah Syarat Mutlak Keberhasilan",
        "Hidup itu seperti air hangat, gula dan teh di dalam gelas, harus berusaha dengan cara mengaduknya agar menjadi terasa Manis dan Berwarna",
        "Ada Cinta disetiap racikan dan ada doa disetiap tegukannya",
        "Dari Alpukat lambang cinta tertinggi, Energi, Kesehatan dan Kecantikan dalam kehidupan Manusia",
        "Semuanya menjadi baik dengan Susu Coklat"
    )

    val dataMinumanHarga = arrayListOf<String>(
        "5000",
        "6000",
        "7000",
        "8000",
        "10000",
        "9000"
    )

    val dataMinuman: ArrayList<ItemKategori>
    get() {
        val list = arrayListOf<ItemKategori>()
        for (item in dataMinumanNama.indices) {
            list.add(ItemKategori(dataMinumanImage[item], dataMinumanNama[item], dataMinumanDeskripsi[item], dataMinumanHarga[item]))
        }
        return list
    }

    val dataDessertImage = arrayListOf<String>(
        "https://cdn1-production-images-kly.akamaized.net/qEv3oL-PikFRT-zjztt9s09ru7w=/1200x900/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3463710/original/070056200_1621843601-cheese-cake-wooden-table_1150-6592.jpg",
        "https://foolproofliving.com/wp-content/uploads/2021/07/Black-rice-salad-recipe-image.jpg",
        "https://png.pngtree.com/png-clipart/20190515/original/pngtree-mini-macarons-or-macaroons-with-colorful-sweets-foods-french-sweetmeat-french-png-image_3693073.jpg",
        "https://caramembuat.id/wp-content/uploads/2022/06/Cara-Membuat-Dessert-Box-Coklat-Mewah.jpg",
        "https://images.squarespace-cdn.com/content/v1/5dd5b5e9f226644911c4d733/1582303096724-NLWKXFDSN6B9FOFMTKLN/tiramisu-2897900_1280.jpg",
        "https://magnate.id/wp-content/uploads/2022/02/Bisnis-Dessert-Box-930x620.jpg"
    )

    val dataDessertNama = arrayListOf<String>(
        "Cheese Cake",
        "Black Salad",
        "Maccaron",
        "Choco",
        "Tiramisu cake",
        "Redvelvet vanila"
    )

    val dataDessertDeskripsi = arrayListOf<String>(
        "Kue Keju dengan topping coffe dan vanila",
        "Dengan paduan rasa vanila latte",
        "Gurih dan manin di mulut",
        "Dengan coklat asli pilihan",
        "Tiramisu nikmat dan manis",
        "Dengan paduan redvelvet vanila"
    )

    val dataDessertHarga = arrayListOf<String>(
        "30000",
        "35000",
        "20000",
        "45000",
        "40000",
        "38000"
    )

    val dataDessert: ArrayList<ItemKategori>
    get() {
        val list = arrayListOf<ItemKategori>()
        for (item in dataDessertNama.indices) {
            list.add(ItemKategori(dataDessertImage[item], dataDessertNama[item], dataDessertDeskripsi[item], dataDessertHarga[item]))
        }
        return list
    }
}