package com.example.navigationcomponentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.navigationcomponentdemo.basic.BasicActivity
import com.example.navigationcomponentdemo.bottom.BottomBarActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
    }

    fun basicNav(view: View) {
        startActivity(Intent(this, BasicActivity::class.java))
    }
    fun bottomNav(view: View) {
        startActivity(Intent(this, BottomBarActivity::class.java))
    }
    fun drawerNav(view: View) {
        startActivity(Intent(this, DrawerActivity::class.java))
    }
}