package com.example.quintaaulaandroidmultimidiasmapas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivityRecuperaFotosBinding

class RecuperaFotosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecuperaFotosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recupera_fotos)

        binding = ActivityRecuperaFotosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val equipes = arrayOf("Leão", "Pinguim", "Urso", "Girafa", "Tigre", "Rato")

        binding.textView1.text = equipes[0]
        binding.textView2.text = equipes[1]
        binding.textView3.text = equipes[2]
        binding.textView4.text = equipes[3]
        binding.textView5.text = equipes[4]
        binding.textView6.text = equipes[5]

        val i1 = "https://upload.wikimedia.org/wikipedia/commons/7/73/Lion_waiting_in_Namibia.jpg"
        val i2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Pygoscelis_adeliae.jpg/776px-Pygoscelis_adeliae.jpg"
        val i3 = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Ursus_arctos_-_Norway.jpg/800px-Ursus_arctos_-_Norway.jpg"
        val i4 = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Giraffe_Mikumi_National_Park.jpg/948px-Giraffe_Mikumi_National_Park.jpg"
        val i5 = "https://upload.wikimedia.org/wikipedia/commons/2/2e/Tigerramki.jpg"
        val i6 = "https://upload.wikimedia.org/wikipedia/commons/c/c3/Rattus_rattus_01_reframed.JPG"

        Glide.with(this).load(i1).into(binding.imageView1)
        Glide.with(this).load(i2).into(binding.imageView2)
        Glide.with(this).load(i3).into(binding.imageView3)
        Glide.with(this).load(i4).into(binding.imageView4)
        Glide.with(this).load(i5).into(binding.imageView5)
        Glide.with(this).load(i6).into(binding.imageView6)


    }
}