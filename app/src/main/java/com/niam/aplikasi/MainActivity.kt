package com.niam.aplikasi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindahActivityExplisit.setOnClickListener{
            startActivity(Intent(this, Explis_Inten::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener{
            startActivity(Intent(this, Implis_Inten::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent: Intent = Intent(this, inten_bundle::class.java)
            intent.putExtra("NAMA", "Ahmad rofi'i Ni'am")
            intent.putExtra("ALAMAT", "Purwodadi,Grobogan")
            intent.putExtra("HOBI", "Ghibah")
            intent.putExtra("CITACITA", "Presiden Keluarga")
            intent.putExtra("E-MAIL", "ahmadrofiiniam@gmail.com")
            startActivity(intent)
        }

    }
}
