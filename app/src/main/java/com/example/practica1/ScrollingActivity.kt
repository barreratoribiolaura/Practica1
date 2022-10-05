package com.example.practica1

import  android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    val openURL = Intent(Intent.ACTION_VIEW)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage("https://esports.as.com/2022/01/14/league-of-legends/Diana_1537956204_895415_1440x600.jpg", binding.content.img1)
        loadImage("https://pbs.twimg.com/media/ECBTmgrWsAEpSWJ?format=jpg&name=900x900",binding.content.img2)
        loadImage("https://nexus.leagueoflegends.com/wp-content/uploads/2018/04/LOL_CMS_198_Article_01_ifsox5gchrv42f65its8.jpg",binding.content.img3)
        loadImage("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/9/9e/Skin_Splash_Classic_Kennen.jpg/revision/latest/scale-to-width-down/350?cb=20191212182720",binding.content.img4)

        onClick("https://www.leagueoflegends.com/es-es/champions/diana/",binding.content.btnEnlace)
        onClick("https://www.leagueoflegends.com/es-es/champions/pantheon/",binding.content.btnEnlace2)
        onClick("https://www.leagueoflegends.com/es-es/champions/kai-sa/",binding.content.btnEnlace3)
        onClick("https://www.leagueoflegends.com/es-es/champions/kennen/",binding.content.btnEnlace4)



    }

    //Enlaces
    private fun onClick(url:String,btn: Button){
        btn.setOnClickListener{
            openURL.data= Uri.parse(url)
            startActivity(openURL)
        }

    }
    //Glide
    private fun loadImage(
        url:String,
        iv: ImageView){
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(iv)
    }


}