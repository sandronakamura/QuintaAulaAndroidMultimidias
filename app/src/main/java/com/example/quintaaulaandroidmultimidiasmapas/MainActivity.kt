package com.example.quintaaulaandroidmultimidiasmapas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.recuperandoFotos.setOnClickListener (View.OnClickListener{
            acessarRecuperarFotos()
        })

        binding.audioManager.setOnClickListener (View.OnClickListener{
            acessarSonsAudios()
        })

        binding.usandoWebView.setOnClickListener (View.OnClickListener{

            acessarWebView()
        })
        binding.mediaPlayer.setOnClickListener (View.OnClickListener{

            acessarMediaPlayer()
        })
        binding.animacaoView.setOnClickListener (View.OnClickListener{

            acessarAnimacao()
        })


    }

    private fun acessarRecuperarFotos(){
        val intent = Intent(this, RecuperaFotosActivity::class.java)
        startActivity(intent)
    }

    private fun acessarSonsAudios(){
        val intent = Intent(this, SonsAudiosActivity::class.java)
        startActivity(intent)
    }

    private fun acessarWebView(){
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }
    private fun acessarMediaPlayer(){
        val intent = Intent(this, VideoMediaPlayerActivity::class.java)
        startActivity(intent)
    }
    private fun acessarAnimacao(){
        val intent = Intent(this, AnimacaoActivity::class.java)
        startActivity(intent)
    }
}