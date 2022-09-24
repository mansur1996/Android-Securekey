package com.mrmansur.androidsecurekey

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var serverKey = BuildConfig.SERVER_KEY
    var smsKey = BuildConfig.SMS_KEY

    init {
        System.loadLibrary("keys")
    }

    external fun getPublicKey() : String?
    external fun getPrivateKey() : String?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    // TODO: Work hard

    private fun initViews() {
        Log.d("TAG", serverKey)
        Log.d("TAG", smsKey)

        Log.d("TAG", "getPublicKey : ${getPublicKey().toString()}")
        Log.d("TAG", "getPrivateKey : ${getPrivateKey().toString()}")

    }
}