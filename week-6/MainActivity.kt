package com.daelim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var homeBtnName: TextView
    private lateinit var homeName: TextView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeName = findViewById(R.id.home_name)
        homeBtnName = findViewById(R.id.home_btn)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        val userId = intent.getStringExtra("userId")
        homeName.text=userId
        btn1.setOnClickListener {replaceFragment(HomeFragment())}
        btn2.setOnClickListener {replaceFragment(MyFragment())}
    }

    fun setButtonName(text: String) {
        homeBtnName.text = text
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }
    }
}