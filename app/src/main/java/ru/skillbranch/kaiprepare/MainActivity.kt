package ru.skillbranch.kaiprepare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etLogin = findViewById<EditText>(R.id.et_login)
        val etPass = findViewById<EditText>(R.id.et_password)
        val etAdditionalInfo = findViewById<EditText>(R.id.et_additional_info)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {
            if (etLogin.text.toString() == LOGIN && etPass.text.toString() == PASSWORD) {
                Intent(this, ProfileActivity::class.java).apply {
                    putExtra("login", LOGIN)
                    putExtra("pass", PASSWORD)
                    putExtra("additionalInfo", etAdditionalInfo.text.toString())

                    startActivity(this)
                }
            } else {
                Toast.makeText(this, "Введены неправильные данные", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
