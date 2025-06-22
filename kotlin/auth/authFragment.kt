package com.example.luxoraapp.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.luxoraapp.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_auth)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, WelcomeFragment())
                .commit()
        }
    }
}
