package com.example.counterappwithdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counterappwithdi.databinding.ActivityMainBinding
import com.example.counterappwithdi.di.DaggerAppComponent
import com.example.counterappwithdi.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        DaggerAppComponent.create().mainActivityInject(this)


        binding.countBtn.setOnClickListener {
            binding.countTv.text = viewModel.count.toString()
            viewModel.updateCount()
        }
    }
}