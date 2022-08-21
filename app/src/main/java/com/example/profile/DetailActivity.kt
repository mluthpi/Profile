package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_BIRTH = "extra_birth"
        const val EXTRA_PLACE = "extra_place"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var imgPhoto: ImageView = findViewById(R.id.img_photo)
        var tvName: TextView = findViewById(R.id.tv_name)
        var tvBirth: TextView = findViewById(R.id.tv_birth)
        var tvPlace: TextView = findViewById(R.id.tv_place)

        val name = intent.getStringExtra(EXTRA_NAME)
        val birth = intent.getStringExtra(EXTRA_BIRTH)
        val place = intent.getStringExtra(EXTRA_PLACE)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        imgPhoto.setImageResource(photo)
        tvName.text = name
        tvBirth.text = birth.toString()
        tvPlace.text = place.toString()

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = name

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}