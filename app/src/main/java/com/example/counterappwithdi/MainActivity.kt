package com.example.counterappwithdi

import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.annotation.GlideModule
import com.example.counterappwithdi.databinding.ActivityMainBinding
import com.example.counterappwithdi.viewmodel.MainViewModel
import dagger.android.support.AndroidSupportInjection
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var requestManager: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Use requestManager to load images with Glide
        requestManager
            .load("https://thumbs.dreamstime.com/z/venus-planet-hand-close-hand-venus-planet-palm-116439025.jpg")
            .into(binding.imageView)

        binding.countBtn.setOnClickListener {
            binding.countTv.text = viewModel.count.toString()
            viewModel.updateCount()
        }
    }
}