package com.example.counterappwithdi

import android.os.Bundle
import com.example.counterappwithdi.databinding.ActivityMainBinding
import com.example.counterappwithdi.viewmodel.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.countBtn.setOnClickListener {
            binding.countTv.text = viewModel.count.toString()
            viewModel.updateCount()
        }
    }
}