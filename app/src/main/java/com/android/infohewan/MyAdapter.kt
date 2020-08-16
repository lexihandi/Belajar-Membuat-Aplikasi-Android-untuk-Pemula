package com.android.infohewan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter (val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(model: Model){
            itemView.titleTv.text = model.title
//            itemView.descTv.text = model.desc
            itemView.imageIv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{

            //get position of selected item (mendapatkan posisi dari item yg dipilih)
            val model = arrayList.get(position)

            //get title and description of selected item with intent (mendapatkan judul dan deskripsi dari item yg dipilih dengan intent)
            var gTitle: String = model.title
            var gDesc: String = model.desc

            //get image with intent, which position is selected (mendapatkan gambar dengan intent, dimana posisi di pilih)
            var gImageView: Int = model.image

            //create intent (membuat intent)
            val intent = Intent(context, DetailActivity::class.java)

            //put all these items with putExtra intent
            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDesc", gDesc)
            intent.putExtra("iImageView", gImageView)

            context.startActivity(intent)
        }
    }
}