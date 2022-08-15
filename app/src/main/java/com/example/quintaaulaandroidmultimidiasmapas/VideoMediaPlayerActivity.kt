package com.example.quintaaulaandroidmultimidiasmapas


import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivityVideoMediaPlayerBinding


class VideoMediaPlayerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVideoMediaPlayerBinding
    private var uri: Uri? = null
    private var isContinuously = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityVideoMediaPlayerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.vv)
        val uriPath = "https://ia600209.us.archive.org/24/items/WildlifeSampleVideo/Wildlife.mp4"
        uri = Uri.parse(uriPath)
        binding.vv.setOnCompletionListener{
            if(isContinuously) {
                binding.vv.start()
            }
        }
        binding.btnstop.setOnClickListener { binding.vv.pause() }
        binding.btnplay.setOnClickListener { binding.vv.start() }
        binding.btnonce.setOnClickListener {
            isContinuously = false
            binding.progrss.visibility = View.VISIBLE
            binding.vv.setMediaController(mediaController)
            binding.vv.setVideoURI(uri)
            binding.vv.requestFocus()
            binding.vv.start()
        }
        binding.btnconti.setOnClickListener {
            isContinuously = true
            binding.progrss.visibility = View.VISIBLE
            binding.vv.setMediaController(mediaController)
            binding.vv.setVideoURI(uri)
            binding.vv.requestFocus()
            binding.vv.start()
        }

        binding.vv.setOnPreparedListener { binding.progrss.visibility = View.GONE }


    }


}