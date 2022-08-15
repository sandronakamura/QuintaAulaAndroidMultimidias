package com.example.quintaaulaandroidmultimidiasmapas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivityAnimacaoBinding

class AnimacaoActivity : AppCompatActivity() {
    // Vinculando a Activity na variável binding
    private lateinit var binding: ActivityAnimacaoBinding
    // Adicionando um array com os efeitos
    internal var animations = arrayOf(
        "Fade Id",
        "Fade Out",
        "Zoom In",
        "Zoom Out",
        "Blink",
        "Rotate",
        "Move",
        "Slide Up",
        "Slide Down",
        "Bouce"
    )
    // adicionando um array de inteiros com as animaçõeds em XML
    internal var animationIDs = intArrayOf(
        R.anim.fade_in,
        R.anim.fade_out,
        R.anim.zoom_in,
        R.anim.zoom_out,
        R.anim.blink,
        R.anim.rotate,
        R.anim.move,
        R.anim.slide_up,
        R.anim.slide_down,
        R.anim.bounce
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Variável binding recebe o layout aberto e em seguida
        binding = ActivityAnimacaoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //  Adiciona os valores do array de animacações na lista
        binding.lv.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animations)
        // Adiciona as animações refentes aos arquivos xml na animação do textView
        binding.lv.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            val animation = AnimationUtils.loadAnimation( this, animationIDs[position])
            binding.tv.startAnimation(animation)
        }

    }
}