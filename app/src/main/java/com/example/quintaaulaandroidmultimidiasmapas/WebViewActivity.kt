package com.example.quintaaulaandroidmultimidiasmapas


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.quintaaulaandroidmultimidiasmapas.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    // Vinculando a Activity na variável binding
    private lateinit var binding: ActivityWebViewBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Variável binding recebe o layout aberto e em seguida
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Adiciona nas propriedades da Webview as propriedades view e url
        binding.webview.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        // Habilita o javaScript da webview
        binding.webview.settings.javaScriptEnabled = true
        // Adiciona a url na propriedade loadUrl do Webview
        binding.webview.loadUrl("https://www.fiap.com.br")
    }
}