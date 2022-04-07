package ru.test.kaiprepare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvLogin = findViewById<TextView>(R.id.tv_login)
        val tvAdditionalInfo = findViewById<TextView>(R.id.tv_additional_info)

        val login = intent.extras?.getString("login")
        var additionalInfo = intent.extras?.getString("additionalInfo")

        if (additionalInfo?.length == 0) {
            additionalInfo = "Вы ничего не ввели :_("
        }

        tvLogin.text = login
        tvAdditionalInfo.text = additionalInfo
    }
}
