package com.example.practica1

import android.content.Intent
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding
    val openURL = Intent(View.)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage("https://esports.as.com/2022/01/14/league-of-legends/Diana_1537956204_895415_1440x600.jpg", binding.content.img1)
        loadImage("https://pbs.twimg.com/media/ECBTmgrWsAEpSWJ?format=jpg&name=900x900",binding.content.img2)
        loadImage("https://nexus.leagueoflegends.com/wp-content/uploads/2018/04/LOL_CMS_198_Article_01_ifsox5gchrv42f65its8.jpg",binding.content.img3)
        loadImage("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/9/9e/Skin_Splash_Classic_Kennen.jpg/revision/latest/scale-to-width-down/350?cb=20191212182720",binding.content.img4)
        
    }



    //Glide
    private fun loadImage(
        url:String = "https://esports.as.com/2022/01/14/league-of-legends/Diana_1537956204_895415_1440x600.jpg",
        iv: ImageView){
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(iv)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}