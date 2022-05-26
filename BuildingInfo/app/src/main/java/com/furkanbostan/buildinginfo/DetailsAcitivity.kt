package com.furkanbostan.buildinginfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.furkanbostan.buildinginfo.databinding.ActivityDetailsAcitivityBinding
import com.furkanbostan.buildinginfo.databinding.ActivityMainBinding

class DetailsAcitivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsAcitivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsAcitivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent =intent

        val selectedLandMark = intent.getSerializableExtra("landmark")as LandMark

        binding.countryText.text=selectedLandMark.country
        binding.nameText.text=selectedLandMark.name
        binding.imageView.setImageResource(selectedLandMark.image)
    }
}