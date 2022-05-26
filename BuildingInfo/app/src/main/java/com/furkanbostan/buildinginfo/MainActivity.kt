package com.furkanbostan.buildinginfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.furkanbostan.buildinginfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList : ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val pisa = LandMark("Pisa Kulesi","İtalya",R.drawable.pisa)
        val efesAntikKent = LandMark("Efes Antik Kent","Türkiye",R.drawable.efes_antik_kent)
        val ayasofya = LandMark("Ayasofya Camii", "Türkiye", R.drawable.ayasofya)
        val eyfel = LandMark("Eyfel Kulesi","Fransa", R.drawable.eyfel)

        landmarkList = ArrayList<LandMark>()
        landmarkList.add(pisa)
        landmarkList.add(efesAntikKent)
        landmarkList.add(ayasofya)
        landmarkList.add(eyfel)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = LandMarkAdapter(landmarkList)
        binding.recyclerView.adapter = landMarkAdapter
    }
}