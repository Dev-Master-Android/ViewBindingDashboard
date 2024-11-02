package com.example.viewbindingdashboard

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingdashboard.databinding.ActivityMainBinding
import com.example.viewbindingdashboard.fragments.ChatFragment
import com.example.viewbindingdashboard.fragments.HomeFragment
import com.example.viewbindingdashboard.fragments.LogoutFragment
import com.example.viewbindingdashboard.fragments.MainFragment
import com.example.viewbindingdashboard.fragments.ProfileFragment
import com.example.viewbindingdashboard.fragments.SettingFragment
import com.example.viewbindingdashboard.fragments.WidgetFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainFragment())
            .commit()
    }
}

