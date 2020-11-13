package br.com.digitalhousefoods.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.digitalhousefoods.R
import kotlinx.android.synthetic.main.activity_login.btnRegister
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {
            onBackPressed()
        }

        toolbarRegister.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}