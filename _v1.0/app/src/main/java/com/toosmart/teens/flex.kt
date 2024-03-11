package com.toosmart.teens

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class flex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flex)
        val button7 = findViewById<View>(R.id.fab1) as Button
        val button8 = findViewById<View>(R.id.fab2) as Button
        button7.setOnClickListener {
            val url = "tel:988"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button8.setOnClickListener {
            val url = "https://988lifeline.org/chat/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
    }
}
