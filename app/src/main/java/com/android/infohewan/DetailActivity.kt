package com.android.infohewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar : ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)

        //get data from putExtra intent
        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDesc = intent.getStringExtra("iDesc")
        val aImageView = intent.getIntExtra("iImageView", 0)

        //set title in another activity
        actionBar?.setTitle(aTitle)
        a_title.text = aTitle
        a_desc.text = aDesc
        imageView.setImageResource(aImageView)
    }
}