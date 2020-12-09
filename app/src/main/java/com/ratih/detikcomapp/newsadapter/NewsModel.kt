package com.ratih.detikcomapp.newsadapter

import com.ratih.detikcomapp.R

data class news(var title: String, var desc:String, var photo : Int)

object NewsModel {
    val newslits = listOf<news>(
        news("Mendagri Tito gelar rapat kordinasi kesiapan pilkada serentak 2020 ",
        "detikcom | 1 jam yang lalu",
            R.drawable.img_news1),
        news("Seruan ancaman mati di bansos corona tak serta merta diamini KPK ",
            "detikcom | 2 jam yang lalu",
            R.drawable.img_news2),
        news("Bantah tudingan eks komnas perempuan tim Benpilar nilai Bawasli tak Fair",
            "detikcom | 1 jam yang lalu",
            R.drawable.img_news3),
        news("Geger penemuan mayat Wanita kaki terikat - mulit terlakban di Bandung ",
            "detikcom | 1 jam yang lalu",
            R.drawable.img_news4),
        news("Geger penemuan mayat Wanita kaki terikat - mulit terlakban di Bandung ",
            "detikcom |  3 yang lalu",
            R.drawable.img_news4),
        news("Biden tunjuk pensiunan Jenderal jadi Menhan berkulit hitam pertama di AS ",
            "detikcom |  4 menit yang lalu",
            R.drawable.img_news5),
        news("Pelabuhan di Sutera dipadati warga jelang Pilkada, ada yang tidak pakai masker ",
            "detikcom | 5 jam yang lalu",
            R.drawable.img_news6),
        news("Polda Jabar minta HRS tak bawa massa saat diperiksa kasus Megamendung  ",
            "detikcom | 8 menit yang lalu",
            R.drawable.img_news7),
        news("Kejati DKI kembalikan berkas kasus video syur mirip gisel ",
            "detikcom | 10 yang lalu",
            R.drawable.img_news8),
        news("Korser teken kesepakatan pembelian vaksin cororna untuk 44 juta orang",
            "detikcom | 2 yang lalu",
            R.drawable.img_news9)


    )
}