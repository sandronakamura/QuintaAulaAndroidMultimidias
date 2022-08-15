package com.example.quintaaulaandroidmultimidiasmapas

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivitySonsAudiosBinding


class SonsAudiosActivity : AppCompatActivity() {
    // Vinculando a Activity na variável binding
    private lateinit var binding: ActivitySonsAudiosBinding
    var cow: MediaPlayer? = null
    var dog: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sons_audios)

        // Cria o MediaPlayer com o arquivo de áudio vinculado
        cow = MediaPlayer.create(this, R.raw.cow)
        dog = MediaPlayer.create(this, R.raw.dog)

        // Variável binding recebe o layout aberto e em seguida
        binding = ActivitySonsAudiosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Adiciona um listener que ao clicar na imagem chama a função soundCow
        binding.soundCow.setOnClickListener(View.OnClickListener{
            soundCow()
        })

        // Adiciona um listener que ao clicar na imagem chama a função soundDog
        binding.soundDog.setOnClickListener(View.OnClickListener{
            soundDog()
        })


    }
    // Função que aciona o método start do MediaPlayer
    private fun soundCow(){
        cow!!.start()
    }

    // Função que aciona o método start do MediaPlayer
    private fun soundDog(){
        dog!!.start()
    }
}