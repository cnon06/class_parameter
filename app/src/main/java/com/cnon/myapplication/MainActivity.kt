package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var par = parametre(5,6);
        par.sonuc()

        var par2 = parametre(boy=6,en=5);
        par2.sonuc()

        var par3 = parametre();
        par3.sonuc()

        var par4 = parametre(5);
        par4.sonuc()

    }
}