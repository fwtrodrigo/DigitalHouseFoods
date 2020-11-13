package br.com.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        callLogin()
    }


    private fun splashScreen() {
        val runnable = Runnable {
            callLogin()
            finish()
        }

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(runnable, SPLASH_TIME_OUT)
    }

    private fun callLogin() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}