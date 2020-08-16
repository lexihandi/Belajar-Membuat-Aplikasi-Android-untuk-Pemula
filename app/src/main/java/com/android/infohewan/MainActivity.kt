package com.android.infohewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null
    private var exitTime: Long = 0

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val fragment = HomeFragment.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_account -> {
                val fragment = AccountFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = HomeFragment.newInstance()
        addFragment(fragment)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Cara Merawat Telinga Kucing", "Siapkan terlebih dahulu beberapa peralatan " +
                "berikut: kapas dan cairan pembersih telinga kucing (khusus untuk bagian ini, PetLovers sebaiknya " +
                "konsultasi terlebih dahulu dengan dokter hewan untuk mendapatkan rekomendasi cairan pembersih telinga " +
                "kucing yang tepat). Cari tempat yang terang untuk memudahkan PetLovers saat membersihkan telinga kucing.\n" +
                "\n" +
                "Selanjutnya, PetLovers harus memastikan kucing dalam kondisi tenang. Jika sudah, pijat bagian " +
                "kepalanya terlebih dahulu agar dia rileks, lalu pegang bagian telinganya. Bersihkan kotoran yang " +
                "ada di dalam telinganya dengan hati-hati. " +
                "Cara Mencegah Penyakit Pada Telinga Kucing\n" +
                "\n" +
                "Rajin membersihkan telinga kucing adalah salah satu cara untuk mencegah terjadinya masalah pada telinganya, " +
                "seperti telinga kucing jamuran. Lakukan kebiasaan ini (membersihkan telinga kucing) secara rutin. Normalnya " +
                "membersihkan telinga kucing bisa dilakukan seminggu sekali ya, PetLovers.", R.drawable.ic_044_cat))
        arrayList.add(Model("Anjing Terkena Masalah Pencernaan di Musim Hujan", "Masalah pencernaan pada anjing umumnya " +
                "mengganggu kemampuan anjing dalam mencerna dan menyerap nutrisi dari makanan yang dikonsumsinya. Karena kurang " +
                "maksimalnya proses penyerapan nutrisi tersebut, anjing pun biasanya mengalami masalah kesehatan lainnya.\n" +
                "\n" +
                "Lalu, apa saja sih penyebab masalah pencernaan ini? Bisa jadi karena salah mengkonsumsi makanan, alergi, stres " +
                "berlebihan, proses adaptasi terhadap makanan baru, hingga perubahan musim.\n" + "Khusus untuk masalah stres adalah " +
                "bagian dari respon umum karena kecemasan yang dia alami dan adanya infeksi " +
                "perncernaan seperti akibat cacing, bakteri, virus, maupun protozoa.. Contoh-contoh kecemasan yang memicu diare " +
                "seperti ketika baru pertama kali diadopsi, saat harus berpisah lama dengan pemiliknya, perubahan lingkungan, " +
                "hingga pengenalan terhadap hewan baru yang ada di rumah PetLovers.", R.drawable.ic_011_dog))
        arrayList.add(Model("Jantung Babi Diprediksi Bisa Didonorkan ke Manusia", "Ahli bedah di Inggris memprediksi jantung " +
                "babi akan bisa digunakan untuk dicangkokkan pada manusia dalam tiga tahun mendatang. Cara ini dianggap mampu mengatasi " +
                "masalah dalam kekurangan donor organ.\n" +
                "\n" +
                "Sir Terence English, ilmuwan yang sukses melakukan transplantasi jantung pertama kalinya di Inggris 40 tahun lalu, " +
                "percaya bahwa xenotransplantasi (transplantasi organ atau jaringan dari satu spesies ke spesies lain), bisa menjadi " +
                "langkah besar dalam bidang medis.\n" +
                "\n" +
                "\"Jika hasil xenotransplantasi dengan ginjal babi pada manusia memuaskan, maka kemungkinan jantungnya bisa digunakan " +
                "untuk efek yang lebih baik pada manusia dalam beberapa tahun,\" kata English pada Sunday Telegraph, seperti dikutip " +
                "dari LAD Bible pada Kamis (12/9/2019).\n" +
                "\n" +
                "\"Jika itu bekerja dengan ginjal, itu akan bekerja dengan hati. Ini akan mengubah isu,\" tambahnya.\n" +
                "\n" +
                "English menjelaskan bahwa cara ini bisa membantu mengurangi daftar tunggu donor. Hal tersebut karena selama ini di Inggris, " +
                "permintaan donor organ transplantasi lebih besar daripada persediaan. English tidak menampik jika akan ada aktivis hewan yang " +
                "mengatakan bahwa praktik ini merupakan pelanggaran pada hak-hak hewan.\n" +
                "\n" +
                "\"Namun jika kamu bisa menyelamatkan hidup, bukankah itu sedikit lebih baik?\" ujarnya.\n" +
                "\n" +
                "Penelitian terkait penggunaan organ babi pada manusia juga dilakukan ahli genetika George Church dari Harvard University, " +
                "sekaligus pendiri eGenesis. Dia mengerjakan penelitian agar organ babi bisa beradaptasi dan cocok pada pasien manusia.\n" +
                "\n" +
                "Church dan rekan-rekannya menggunakan teknik penyuntingan gen CRISPR untuk memodifikasi organ babi agar penolakan dari " +
                "tubuh manusia berkurang. Nantinya, sebelum diuji pada manusia, mereka akan lebih dahulu melakukan percobaan pada hewan lain seperti monyet.\n" +
                "\n" +
                "\"Kami akan mendapat kesulitan menempatkan organ modifikasi pada manusia, sampai itu diuji pada hewan yang lebih besar,\" " +
                "kata James Markamnn, penasehat eGenesis.", R.drawable.ic_019_pig))
        arrayList.add(Model("Gajah Sumatera Banyak Terserang Penyakit Herpes", "Diperkirakan sekitar 1.724 ekor gajah yang masih tersisa di " +
                "Sumatera, namun diperkirakan hewan langka berbelalai ini makin terancam dikarenakan 85 persen hidup di luar kawasan habitat. " +
                "Sehubungan adanya alih fungsi habitat gajah di seluruh wilayah Sumatera yang memotong jalur-jalur penting migrasi gajah Sumatera " +
                "dan mengkotak-kotakkan populasi yang tersisa. Selain itu adanya perburuan gajah di wilayah Aceh, Riau, Bengkulu dan Lampung serta " +
                "konflik gajah dan manusia masih terus berlangsung di Sumatera. Di samping itu gajah juga menghadapi ancaman penyakit Elephant " +
                "Endotheliotropic Herpes Virus (EEHV) yang menyebabkan kematian pada anak gajah dalam jumlah banyak.\n" +
                "\n" +
                "Demikian yang mengemuka Workshop Penanganan Medis dan Pengendalian Gajah yang dilaksanakan Fakultas Kedokteran Hewan UGM " +
                "pada akhir pekan lalu. Peserta yang hadir berasal dari para dokter hewan, pawang gajah (mahout) dan  pengelola kebun binatang " +
                "dari berbagai kota seperti dari Sumatera, Jakarta, Solo, Surabaya, Yogyakarta dan Bali.\n" +
                "\n" +
                "Pemerhati gajah dari Veterinary Society for Sumatran Wildlife Conservation (VESSWIC), drh. Muhammad Wahyu, mengatakan kelestarian " +
                "gajah di Lembaga Konservasi (LK) eks-situ maupun di alam liar makin terancam akibat hilangnya habitat dan konflik dan perburuan " +
                "manusia, serta bahya penularan penyakit EEHV. Menurut wahyu kasus EEHV banyak ditemukan di Tangkahan Aceh, Aras Napal Sumatera " +
                "Utara dan di Way Kambas Lampung. Gajah yang terkena penyakit ini menurutnya menunjukkan adanya gejala berupa kelemahan umum " +
                "yang diikuti dengan wajah bengkak dengan lidah membiru. Di sumatera penyakit ini menyebabkan banyak anak gajah yang mati. " +
                "“Selama 3 tahun kasus EEHVdiketahui muncul di Sumatra Utara dan Lampung,” katanya.\n" +
                "\n" +
                "Menurut Wahyu, dalam beberapa literatur menyebutkan virus EEHV memang sudah ada pada populasi gajah asia, karena " +
                "bersifat fatal pada gajah muda, gajah tua, atau gajah yang mengalami imunitas yang menurun. Meski ada juga literatur " +
                "yang menyebutkan EEHV merupakan virus baru pada gajah asia akibat cross infection dari gajah afrika yang dipelihara bersama.\n" +
                "\n" +
                "Mengatasi ancaman Virus Elephant Endotheliotropic Herpes Virus (EEHV), kata Wahyu memerlukan tindakan medik yang lebih " +
                "efektif dengan melibatkan dukungan penelitian-penelitian dari perguruan tinggi di bidang sain veteriner. “Termasuk bidang ilmu " +
                "lain seperti genetika untuk mendukung kelestarian gajah,” tuturnya.\n" +
                "\n" +
                "Tidak hanya itu, kata Wahyu, sinergi antara dokter hewan dan mahout  dinilainya cukup efektif dalam menangani masalah " +
                "kesehatan gajah. “Terutama informasi mengenai metode penanganan gajah, penyakit gajah, metode penanganan penyakit, dan " +
                "kebijakan terkait dengan kelestarian gajah,” ungkapnya.\n" +
                "\n" +
                "Sementara pawang gajah senior, Nazarudin, mengatakan ada  metode khusus dalam  penggunaan perintah-perintah untuk " +
                "mengendalikan gajah bagi mahout dalam menangani gajah jinak maupun gajah liar. “Diperlukan kompetensi khusus bagi mahout " +
                "dalam menangani gajah dengan baik,” pungkasnya. (Humas UGM/Gusti Grehenson)", R.drawable.ic_026_elephant))
        arrayList.add(Model("Cegah Penyakit Umum Sapi", "Masalah penyakit umum sapi mulai dari anthrax, scabies, cacingan, demam, " +
                "ingusan, ngorok, mubeng, kembung, dan kuku busuk merupakan salah satu kendala dalam beternak hewan ini. Pencegahan " +
                "penyakit diperlukan sebagai salah satu usaha dalam peningkatan produktivitas sapi untuk hasil yang sesuai dengan yang Anda telah targetkan.\n" +
                "\n" +
                "Secara umum, untuk sapi yang sehat maka bisa dipastikan seluruh fungsi organ di dalam tubuhnya berkerja dengan baik. " +
                "Aliran cairan di dalam tubuhnya yang berfungsi atau berperan dalam penyusunan sel tubuhnya tersebut bekerja dengan baik. " +
                "Untuk kondisi normal dan sehat ini, maka perhatikan lingkungannya. Jika tanda-tanda dari penyakit umum sapi terlihat, " +
                "maka tanggapi dengan cepat. Gunakan dokter hewan untuk pemeriksaan yang lebih baik dan lebih detail untuk penanganan yang tepat.\n" +
                "\n" +
                "Kesehatan sapi dipengaruhi oleh berbagai faktor mulai dari kebersihan kandang dengan kelembaban, posisi ventilasi, " +
                "aliran udara, jumlah cahaya matahari, serta sapi lain yang satu kandang dengan sapi tersebut. Sebaiknya, sebelum " +
                "memutuskan sapi tersebut dicampurkan dalam satu kandang, Anda cek satu per satu sapi tersebut. Apakah kondisinya " +
                "sehat atau tidak. Jika ada yang menunjukan kondisi tidak sehat maka pisahkan, jangan disatukan. Pakan juga berperan " +
                "dalam terjadinya serangan penyakit pada sapi. Perlu adanya keseimbangan pakan yang diberikan pada sapi sehingga sapi " +
                "tidak kekurangan gizi dan jauh dari serangan penyakit umum sapi tersebut.", R.drawable.ic_037_cow))
        arrayList.add(Model("Burung Merpati, Lebih Dari Sekadar Peliharaan", "Burung merpati (pigeons) dikenal sebagai salah satu unggas yang dekat dengan manusia. Burung ini disebut juga dengan nama burung dara, dimana ia merupakan spesies paling terkenal dalam keluarga Columbidae.\n" +
                "\n" +
                "Keunggulan dari burung merpati tidak hanya dipelihara sebagai satwa kesayangan, burung ini juga telah dimanfaatkan untuk menghasilkan daging, hias, balap dan bahkan untuk keperluan komunikasi (burung merpati pos). Apabila pemeliharaannya dilakukan secara sungguh-sungguh, maka yang awalnya hanya bersifat hobi dapat diubah dan ditingkatkan menjadi hobi menguntungkan yang dapat menambah penghasilan keluarga.\n" +
                "\n" +
                "Harga dari seekor atau sepasang merpati balap bervariasi, burung merpati jantan dewasa yang mempunyai kualitas terbang dan keturunan baik dapat mencapai harga 5 juta rupiah bahkan lebih, sedangkan burung merpati jantan berharga sekitar 500 ribu rupiah.\n" +
                "\n" +
                "Burung merpati dapat digunakan sebagai game atau performing breed. Performing breed ada dua macam, yaitu terbang datar dan terbang tinggi. Burung merpati terbang datar dinikmati penggemar dari atraksi adu kecepatan pejantan dengan jarak tertentu menuju joki yang memegang pasangan (dikutip dalam penelitian Ridwansyah (2011) Fakultas Peternakan, IPB).\n" +
                "\n" +
                "Dalam sekali kawin, pada umumnya burung merpati akan menghasilkan antara 2-4 butir. Sampai saat ini, cara pemeliharaan burung ini masih bersifat tradisional. Burung merpati dipelihara secara ekstensif, yaitu merpati dilepas dan sering berkeliaran mencari makan sendiri. Pakan burung merpati berupa jagung, beras merah dan terkadang sisa makanan yang ada di tanah.\n" +
                "\n" +
                "Burung merpati termasuk hewan bertulang belakang dan berdarah panas. Suhu tubuhnya sekitar 41°C, bentuk tubuhnya sesuai untuk kehidupan udara maupun darat karena memiliki sayap yang panjang untuk terbang dan kaki yang sesuai untuk berjalan dan bertengger tanpa kesulitan. Lehernya panjang dan fleksibel, kepala besar sehingga memberikan kapasitas bagi otak yang besar, tubuhnya kompak, kaku dan bagian vitalnya terlindung dengan baik dari serangan musuh (Levi (1945), dalam Ridwansyah (2011).\n" +
                "\n" +
                "Salah satu ciri yang membedakan burung merpati dengan unggas lainnya karena burung merpati dapat menghasilkan crop milk atau susu tembolok yaitu suatu cairan yang berwarna krem menyerupai air susu yang dikeluarkan dari tembolok induk jantan maupun betina, dimana cairan inilah yang diberikan induk burung merpati kepada piyik (anak burung yang baru menetas) dengan cara meloloh dan memompa ke dalam mulut piyik.\n" +
                "\n" +
                "Di kota London burung merpati digunakan sebagai alat untuk mengawasi kualitas udara kota. Merpati-merpati tersebut dikirimkan untuk terbang di sekeliling London selama tiga hari untuk mengumpulkan informasi. Proyek itu dinamakan ‘Pigeon Air Patrol’, proyek yang bertujuan meningkatkan kesadaran tentang langit London yang penuh polusi. Proyek ini mengandalkan layanan dari Twitter untuk menyambungkan penduduk kota London dengan merpati balap yang dilengkapi dengan tas punggung. Tas punggung ini memiliki fungsi untuk memberitakan kualitas udara secara spesifik di tempat dan waktu tertentu.", R.drawable.ic_013_dove))
        arrayList.add(Model("5 Fakta Angsa, Hewan Berbulu Putih yang Terkenal Setia", "Angsa termasuk salah satu hewan cantik yang juga menjadi simbol kesetiaan. Angsa ini didaulat sebagai hewan paling setia karena hanya memiliki satu pasangan dalam seumur hidupnya. Di balik sifat setia dan tubuh cantiknya angsa ini punya fakta lain yang gak kalah menarik nih buat diketahui bersama. Berikut lima fakta angsa yang menarik!\n" +
                "\n" +
                "1. Angsa bisa membedakan orang baik dan orang jahat \n " +
                "\n" +
                "Angsa memiliki ingatan yang kuat dan itu membuatnya bisa mengenal mana orang yang baik dan tidak. Mereka memang dikenal sebagai hewan yang peka dan pintar di antara hewan sejenisnya. \n" +
                "\n" +
                "2. Terdapat sekitar 25.000 helai bulu dalam tubuh angsa \n " +
                "\n" +
                "Tampil cantik dengan bulu putih yang menutupi sekujur tubuhnya, angsa menjadi salah satu hewan dengan bulu terbanyak. Sepanjang tubuh angsa ditutupi oleh sekitar 25.000 helai bulu. Kalau bulu ini dijadikan bola peluncur untuk bermain badminton, seekor angsa bisa menghasilkan berapa banyak kock ya? \n" +
                "\n" +
                "3. Anak angsa tidak lahir dengan warna putih \n " +
                "\n" +
                "Angsa kecil atau yang punya nama lain cygnets lahir dengan warna keabuan. Namun seiring dengan pertumbuhannya anak angsa akan mengganti bulunya menjadi berwarna putih. Tapi tetap menggemaskan ya sekalipun tidak bewarna putih? \n" +
                "\n" +
                "4. Angsa dapat terbang sejauh 100 km/jam \n " +
                "\n" +
                "Yap, angsa ini termasuk keluarga burung dan ia dapat terbang. Meskipun ukuran tubuhnya tidak kecil tapi seekor angsa dewasa dapat terbang sejauh 100 km per jam. Wow!\n" +
                "\n" +
                "5 Fakta Angsa, Hewan Berbulu Putih yang Terkenal Setia\n" +
                "\n" +
                "Angsa bisa terbang dengan mudah dan gesit karena punya sayap lebar. Sayap mereka bisa berkembang hingga ukuran dua meter. Tak heran jika angsa menjadi burung terkuat dengan profil tubuhnya yang mendukung.\n" +
                "\n" +
                "Angsa yang selama ini terlihat cantik ternyata tak selemah yang kita bayangkan. Hebat banget ya kemampuan angsa ketika terbang? ", R.drawable.ic_002_goose))
        arrayList.add(Model("Lukai 250 Warga dan Bunuh 1 Orang, Monyet Pemabuk India Dikandangkan Seumur Hidup", "Monyet asal Mirzapur, India ini terancam dikandangkan seumur hidup. Primata berusia enam tahun yang memiliki nama Kalua itu menggigit setidaknya 250 orang dan menyebabkan salah satunya meninggal, seperti dikutip dari Business Insider, Jumat (19/6/2020)\n" +
                "\n" +
                "Akibat perilakunya, Kalua memicu ketakutan para warga di Mirzapur, terutama di daerah hutan dan kebun binatang. Mereka pun memanggil pihak berwenang.\n" +
                "\n" +
                "Setelah beberapa kali upaya penangkapan, akhirnya monyet itu berhasil ditangkap dan dimasukan ke kebun binatang Kanpur.\n" +
                "\n" +
                "Menurut laporan, Monyet Kalua ternyata kerap diberi minuman beralkohol oleh sang pemilik yang merupakan seorang okultis -ahli ilmu gaib. Ketika sang majikan meninggal, tak ada lagi yang memberinya minuman beralkohol. Hal itu menyebabkan perilaku primata tersebut menjadi agresif.\n " +
                "\n" +
                "Ada ketakutan tersendiri dari tim bila Kalua dibebaskan ada kemungkinan dirinya akan menyerang orang lagi. \n" +
                "\n" +
                "\"Kita akan mengurungnya selama beberapa bulan, sebelum memindahkannya ke kandang yang terpisah. Tidak ada perubahan prilakunya yang berbeda, monyet tersebut tetap agresif. Sudah tiga tahun dia berada di sini, tapi sudah ditetapkan bahwa Kalua akan tinggal di penangkaran ini seumur hidupnya,\" ujar dokter Mohd Nasir. " +
                "\n" +
                "Ketakutan akan Melukai Orang Bila Dibebaskan" +
                "\n" +
                "Saat ini Kalua sudah berumur enam tahun, tapi dokter khawatir Kalua akan menyerang orang bila dilepas kembali. Meski sudah tiga tahun berada dalam kandang, ia juga bahkan belum akrab dengan penjaganya.", R.drawable.ic_017_monkey))
        arrayList.add(Model("Horor Serbuan Rakun Zombie Bikin Warga Ohio Trauma", "Robert Coggeshall tengah asyik bermain dengan anjing-anjing beagle-nya di halaman belakang rumah yang terletak di kota Youngstown, Ohio. Saat itu Jumat sore pekan lalu, kala ia melihat seekor rakun. \n" +
                "\n" +
                "Pria berusia 72 tahun itu langsung menggiring anjing-anjingnya masuk ke dalam rumah saat rakun tanpa rasa takut berjalan ke pintu kaca. Selama beberapa saat, anjing peliharaannya dan si rakun berhadap-hadapan, saling menatap satu sama lain.\n" +
                "\n" +
                "Coggeshall berpikir ada sesuatu yang salah dengan rakun itu, karena ia keluar pada siang bolong dan matanya tak memancarkan kelucuan seperti biasanya." +
                "\n" + "\n" +
                "Ketika Coggeshall ingin mengusir hewan itu, rakun itu berdiri dengan kaki belakang dan memamerkan gigi-giginya yang tajam, putih, dan merah jambu. Air liur menetes dari mulutnya. Demikian seperti dikutip dari The Washington Post pada Kamis (5/4/2018).\n" +
                "\n" +
                "\"Rakun berdiri dengan dua kaki belakangnya, dan itu sangat tidak biasa. Lalu, rakun itu pingsan. Badannya kaku,  seperti koma,\" kata Coggeshall.\n" +
                "\n" +
                "Namun, tak lama kemudian rakun itu terbangun, berjalan berkeliling sebentar, lalu berdiri dan berjalan dengan kaki belakangnya.\n" +
                "\n" +
                "Selama dua jam Coggeshall, seorang fotografer satwa liar, menyaksikan rakun itu mengulangi pola aneh tersebut berulang kali. Dia kemudian mengambil sekitar 250 foto binatang itu.\n" +
                "\n" +
                "Rupanya, menurut kepolisian Youngstown, rakun yang difoto oleh Coggeshall adalah satu dari puluhan rakun yang dilaporkan berperilaku aneh selama tiga minggu terakhir di kota itu.\n" +
                "\n" +
                "Banyak penduduk melaporkan kepada polisi bahwa perilaku itu aneh. Saksi mata mengatakan sangat tidak biasa bahwa rakun keluar pada siang hari. Hewan itu bahkan tidak takut akan suara keras atau gerakan yang biasanya akan menakut-nakuti mereka, demikian menurut laporan WKBN-TV.\n" +
                "\n" +
                "Perilaku rakun itu sangat mengganggu bagi sebagian penduduk. Sehingga, mereka menyamakan hewan itu dengan zombie dan hal itu membuat mereka trauma ketika bertemu binatang tersebut. \n" +
                "\n" +
                "Hal itu membuat sejumlah media membuat berita utama dengan judul rakun zombi. Contohnya, media Vice menulis headline \"Zombie Raccoons' Are Traumatizing Ohio Town\". Kisah dalam berita itu menggambarkan rakun berperilaku aneh dan mengejutkan.\n" +
                "\n" +
                "Menurut WKBN-TV dari Departemen Sumber Daya Alam Ohio, rakun kemungkinan terinfeksi dengan penyakit yang disebut distemper.\n" +
                "\n" +
                "Penyakit yang disebabkan oleh virus, kadang-kadang fatal, biasanya menginfeksi anjing domestik yang tidak divaksinasi tetapi juga dapat menginfeksi rubah, coyote dan sigung.\n" +
                "\n" +
                "Pada tahun 2003, harimau pertama yang diketahui dilaporkan terinfeksi dengan distemper -- seperti si rakun zombie-- mengembara ke kota Pokrovka, Rusia. Sang kucing besar itu hanya duduk bergeming, tidak terpengaruh oleh rangsangan dan gangguan di sekitarnya, menurut National Geographic.", R.drawable.ic_045_raccoon))
        arrayList.add(Model("5 Fakta Beruang Coklat, Hewan Buas yang Terlihat Lucu", "Beruang coklat merupakan salah satu spesies dari keluarga beruang. Mereka banyak mendiami berbagai wilayah di bumi, hal itu membuat mereka cukup dikenal oleh banyak masyarakat dunia. Beruang coklat juga banyak dijadikan sebagai tokoh kartun maupun mainan anak, sehingga membuat beruang satu ini terlihat lucu dan bukannya menyeramkan. Padahal hewan ini adalah salah satu pemangsa terbesar di dunia. Ia dapat berlari, memanjat pohon, bahkan berenang yang membuat hewan ini cukup ditakuti. Beruang coklat mempunyai 16 subspesies termasuk Beruang Grizzly dan Beruang Kodiak.\n" +
                "\n" +
                "Berikut adalah beberapa fakta unik dan menarik mengenai Beruang Coklat.\n" +
                "\n" +
                "1. Dapat ditemukan di Amerika Utara, Eropa, dan Asia" +
                "\n" +"\n" +
                "Wilayah utama beruang coklat meliputi bagian Rusia, Asia Tengah, Cina, Kanada, Amerika Serikat (sebagian besar Alaska), Skandinavia, dan wilayah Carpathian (terutama Rumania), Anatolia, dan Kaukasus. Beruang coklat dapat ditemukan di banyak habitat, mulai dari hutan, pegunungan, hingga dataran es. \n" +
                "\n" +
                "2. Merupakan hewan yang dapat hidup cukup lama\n" +
                "\n" +
                "Rata-rata usia Beruang Coklat adalah 25 tahun. Di alam liar Beruang tertua yang pernah ditemukan berusia sekitar 37 tahun. Sedangkan di penangkaran bisa mencapai usia yang lebih lama hingga 50 tahun." +
                "\n" + "\n" +
                "3. Beruang Coklat adalah spesies beruang terbesar kedua di dunia" +
                "\n" +"\n" +
                "Beruang Coklat mempunyai berat antara 130-600 kg. Subspesies terbesar dari hewan ini adalah Beruang Kodiak yang dapat mencapai berat 600 kg. Beruang Coklat hanya kalah besar dari saudara jauhnya, yaitu Beruang Kutub." +
                "\n" + "\n" +
                "4. Meskipun besar, mereka adalah pelari yang cepat" +
                "\n" +"\n" +
                "Meskipun berbadan cukup besar hewan ini juga merupakan pelari yang cepat, Beruang Coklat dapat berlari hingga kecepatan 50 kilometer per jam. Hal ini memudahkannya dalam mengejar mangsanya. " +
                "\n" + "\n" +
                "5. Beruang ini ternyata merupakan hewan omnivora" +
                "\n" +"\n" +
                "Beruang Coklat ternyata adalah hewan omnivora, ia bukan hanyak memangsa ikan dan daging melainkan juga kadang-kadang memakan buah apel hingga beri untuk mencukupi kebutuhan makannya.", R.drawable.ic_048_grizzly))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show()
            exitTime = System.currentTimeMillis()
        } else {
            finish()
        }
    }

}