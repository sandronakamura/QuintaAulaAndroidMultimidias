package com.example.quintaaulaandroidmultimidiasmapas

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivitySonsAudiosBinding


class SonsAudiosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySonsAudiosBinding
    var cow: MediaPlayer? = null
    var dog: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sons_audios)

        cow = MediaPlayer.create(this, R.raw.cow)
        dog = MediaPlayer.create(this, R.raw.dog)


        binding = ActivitySonsAudiosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.soundCow.setOnClickListener(View.OnClickListener{
            soundCow()
        })

        binding.soundDog.setOnClickListener(View.OnClickListener{
            soundDog()
        })


    }
    private fun soundCow(){
        cow!!.start()
    }
    private fun soundDog(){
        dog!!.start()
    }
}