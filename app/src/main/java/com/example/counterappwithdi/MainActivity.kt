package com.example.counterappwithdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counterappwithdi.databinding.ActivityMainBinding
import com.example.counterappwithdi.viewmodel.MainViewModel
import com.example.counterappwithdi.viewmodel.ViewModelFactory
import java.time.chrono.Chronology.of
import java.util.EnumSet.of
import java.util.Map.of
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.countBtn.setOnClickListener {
            binding.countTv.text = viewModel?.count.toString()
            viewModel?.updateCount()
        }
    }
}