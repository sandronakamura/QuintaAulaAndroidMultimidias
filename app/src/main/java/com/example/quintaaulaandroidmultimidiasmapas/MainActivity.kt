package com.example.quintaaulaandroidmultimidiasmapas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // Vinculando a Activity na variável binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variável binding recebe o layout aberto e em seguida
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Adiciona um listener ao botão recuperar fotos, após clicar chama a funcão acessarRecuperarFotos
        binding.recuperandoFotos.setOnClickListener (View.OnClickListener{
            acessarRecuperarFotos()
        })

        // Adiciona um listener ao botão audio manager, após clicar chama a funcão acessarSonsAudios
        binding.audioManager.setOnClickListener (View.OnClickListener{
            acessarSonsAudios()
        })

        // Adiciona um listener ao botão WebView, após clicar chama a funcão acessarWebView
        binding.usandoWebView.setOnClickListener (View.OnClickListener{

            acessarWebView()
        })

        // Adiciona um listener ao botão Media Player, após clicar chama a funcão acessarMedia Player
        binding.mediaPlayer.setOnClickListener (View.OnClickListener{

            acessarMediaPlayer()
        })

        // Adiciona um listener ao botão  animação, após clicar chama a funcão acessarAnimacao
        binding.animacaoView.setOnClickListener (View.OnClickListener{

            acessarAnimacao()
        })


    }

    // Função que abre a tela RecuperaFotosActivity
    private fun acessarRecuperarFotos(){
        val intent = Intent(this, RecuperaFotosActivity::class.java)
        startActivity(intent)
    }

    // Função que abre a tela SonsAudiosActivity
    private fun acessarSonsAudios(){
        val intent = Intent(this, SonsAudiosActivity::class.java)
        startActivity(intent)
    }

    // Função que abre a tela WebViewActivity
    private fun acessarWebView(){
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }

    // Função que abre a tela VideoMediaPlayerActivity
    private fun acessarMediaPlayer(){
        val intent = Intent(this, VideoMediaPlayerActivity::class.java)
        startActivity(intent)
    }

    // Função que abre a tela AnimacaoActivity
    private fun acessarAnimacao(){
        val intent = Intent(this, AnimacaoActivity::class.java)
        startActivity(intent)
    }
}