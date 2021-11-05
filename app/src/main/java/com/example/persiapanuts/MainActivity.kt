package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.aceh,"Rumah Krong Bade","Aceh","Rumah Krong Bade dari Aceh ini berbentuk memanjang dari timur ke barat menyerupai persegi panjang. " +
                "Di bagian depan rumah dilengkapi dengan tangga untuk masuk ke dalam rumah." +
                "Umumnya, tangga pada rumah adat Aceh ini jumlahnya ganjil, yaitu sekitar 7 hingga 9 anak tangga"))

        data?.add(DataModel(R.drawable.sumatrautara,"Rumah Bolon","Sumatera Utara", "Pada rumah adat Bolon ini, terdapat dua bagian yang berbeda, yaitu Jabu Bolon dan juga Jabu Parsakitan. " +
                "abu Bolon biasa menjadi tempat untuk keluarga besar, sedangkan Jabu Parsakitan adalah tempat untuk membicarakan masalah adat. " +
                "Uniknya dari rumah adat Sumatera Utara ini adalah tidak ada sekatan antara tiap ruangan, sehingga semua anggota keluarga tidur bersama."))

        data?.add(DataModel(R.drawable.rumahgadang,"Rumah Gadang","Sumatera Barat ", "Rumah adat satu ini terlihat mewah bukan ? Berasal dari Sumatera Barat, rumah ini memiliki beberapa atap yang runcing dan menjulang keatas" +
                " Rumah ini terbuat dari ijuk dan bentuknya mirip seperti tanduk kerbau yang melambangkan kemenangan suku Minang dalam perlombaan adu kerbau di Jawa."))

        data?.add(DataModel(R.drawable.selaso,"Rumah Adat Selaso Jatuh Kembar","Riau ", "Nama dari rumah ini memiliki arti yaitu rumah dengan dua selasar" +
                "Masyarakat Riau bukan menjadikan Rumah Selaso Jatuh Kembar sebagai tempat tinggal mereka" +
                "namun hanya menggunakannya untuk acara adat saja."))

        data?.add(DataModel(R.drawable.limaspotong," Rumah Atap Limas Potong","Kepulauan Riau", "Rumah adat dari Kepulauan Riau ini terlihat sangat sederhana" +
                "Bentuknya adalah rumah panggung yang memanjang ke belakang dengan dinding kayu yang di susun vertikal. " +
                "Atap dari rumah adat ini memiliki lima bumbungan dengan seng warna merah."))

        data?.add(DataModel(R.drawable.bubunganlima,"Rumah Bubungan Lima","Bengkulu ", "Rumah adat dari Bengkulu ini memiliki tiang penopang dan menggunakan kayu khusus untuk membuatnya, yaitu kayu Medang Kemuning " +
                "Untuk memasuki rumah ini juga harus menggunakan tangga yang berada pada bagian depan rumah " +
                "Sama seperti rumah adat dari Riau, masyarakat Bengkulu menggunakan rumah ini untuk acara adat saja, bukan untuk mereka tinggali. "))

        data?.add(DataModel(R.drawable.rumahpanggung," Rumah Panggung","Jambi", "Rumah adat dari Jambi ini adalah desain yang tertua di daerah tersebut." +
                "Bentuk dari rumah Panggung ini adalah persegi panjang dengan tangga di depan rumah." +
                "Orang-orang sering menyebutkan bagian atap dari Rumah Panggung ini sebagai “Gajah Mabuk” karena bentuknya yang menyerupai perahu dengan ujung melengkung. Rumah ini digunakan untuk tempat tinggal dan juga tempat bermusyawarah."))


        data?.add(DataModel(R.drawable.nuwosesat,"Rumah Nuwo Sesat","Lampung", "Rumah adat Provinsi Lampung memiliki nama Nuwo Sesat" +
                "Ciri khas dari rumah ini adalah bentuknya panggung dan di sisi-sisinya terdapat ornamen yang khas " +
                "ukuran dari rumah ini sangat besar, namun saat ini banyak yang membuat Rumah Nuwo Sesat ini menjadi lebih kecil. "))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("judul", item?.judul)
                intent.putExtra("provinsi", item?.provinsi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}