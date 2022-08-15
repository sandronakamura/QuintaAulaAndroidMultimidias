package com.example.quintaaulaandroidmultimidiasmapas


import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivityVideoMediaPlayerBinding


class VideoMediaPlayerActivity : AppCompatActivity() {
    // Vinculando a Activity na variável binding
    private lateinit var binding: ActivityVideoMediaPlayerBinding
    private var uri: Uri? = null
    private var isContinuously = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Variável binding recebe o layout aberto e em seguida
        binding = ActivityVideoMediaPlayerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Cria uma variável recebendo os atributos de MediaController
        val mediaController = MediaController(this)

        // Adiciona o VideoView como ancora do MediaControler
        mediaController.setAnchorView(binding.vv)

        // Variável que recebe a URL
        val uriPath = "https://ia600209.us.archive.org/24/items/WildlifeSampleVideo/Wildlife.mp4"

        // Converte a URL para URI
        uri = Uri.parse(uriPath)

        // Adiciona um listerner que ao carregar aciona a propriedade start do MediaController
        binding.vv.setOnCompletionListener{
            if(isContinuously) {
                binding.vv.start()
            }
        }

        // Adiciona um listerner que clicar no botão pausar aciona a propriedade pause do MediaController
        binding.btnstop.setOnClickListener { binding.vv.pause() }

        // Adiciona um listerner que clicar no botão continuar aciona a propriedade start do MediaController
        binding.btnplay.setOnClickListener { binding.vv.start() }

        // Adiciona um listerner que clicar no botão retornar inicia o vídeo novamente
        binding.btnonce.setOnClickListener {
            isContinuously = false
            binding.progrss.visibility = View.VISIBLE
            binding.vv.setMediaController(mediaController)
            binding.vv.setVideoURI(uri)
            binding.vv.requestFocus()
            binding.vv.start()
        }

        // Adiciona um listerner que clicar no botão retornar inicia o vídeo novamente
        binding.btnconti.setOnClickListener {
            isContinuously = true
            binding.progrss.visibility = View.VISIBLE
            binding.vv.setMediaController(mediaController)
            binding.vv.setVideoURI(uri)
            binding.vv.requestFocus()
            binding.vv.start()
        }

        // Adiciona um listerner quando o videoView estiver com o estado preparado deixa a barra
        // de progresso do video como visível
        binding.vv.setOnPreparedListener { binding.progrss.visibility = View.GONE }


    }


}