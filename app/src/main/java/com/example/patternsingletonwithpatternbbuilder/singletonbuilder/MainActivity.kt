package com.example.patternsingletonwithpatternbbuilder.singletonbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.singletonbuilder.databinding.ActivityMainBinding
import com.example.patternsingletonwithpatternbbuilder.singletonbuilder.kotlin.singleton.Singleton

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvText.text = Singleton.Singleton.getData()
    }
}