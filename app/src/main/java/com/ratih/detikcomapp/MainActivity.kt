 package com.ratih.detikcomapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratih.detikcomapp.newsadapter.NewsAdapter
import com.ratih.detikcomapp.newsadapter.NewsModel
import com.ratih.detikcomapp.newsadapter.news
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.lay_berita.*

 class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var headLinenews : news?
        if (NewsModel.newslits.size>0){
            headLinenews = NewsModel.newslits[NewsModel.newslits.size-1]
            tvw_TitleHeadline.text =headLinenews.title
            tvw_desc.text = headLinenews.desc
            img_new0.setImageResource(headLinenews.photo)

            cdv_newsheadline.setOnClickListener{
                val intent_detail = Intent(this, DatailActivity::class.java)
                    .apply {
                        putExtra(DatailActivity.cont_TitleNews, headLinenews.title)
                        putExtra(DatailActivity.cont_PhotoNews, headLinenews.toString())
                    }
                startActivity(intent_detail)
                finish()
            }
        }

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter = NewsAdapter(this, NewsModel.newslits)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallback(object : NewsAdapter.OnItemClickCallback{
            override fun onItemClick(data: news) {
              val intent = Intent(this@MainActivity, DatailActivity::class.java)
                  .apply {
                      putExtra(DatailActivity.cont_TitleNews, data.title.toString())
                      putExtra(DatailActivity.cont_PhotoNews, data.photo.toString())
                  }
                startActivity(intent)
                finish()
            }

        })
    }
}