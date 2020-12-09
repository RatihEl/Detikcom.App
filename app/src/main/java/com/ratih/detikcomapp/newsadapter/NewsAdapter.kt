package com.ratih.detikcomapp.newsadapter

import android.content.ComponentCallbacks
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ratih.detikcomapp.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter(val context: Context, val listnews:List<news>) :
   RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var currentnews : news? = null
        var currentPosition: Int = 0

        fun setData(currnews : news, pos:Int){
            itemView.tvw_title.text = currnews!!.title
            itemView.tvw_desc.text = currnews!!.desc
            itemView.img_news.setImageResource(currnews!!.photo)

            this.currentnews
            this.currentPosition

        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.MyViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent,false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
       var dataNews = listnews[position]
        holder.setData(dataNews,position)

        holder.itemView.setOnClickListener(){onItemClickCallback.onItemClick(listnews[position])}
    }
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onitemClickCallbacks : OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClick(data: news)
    }
}