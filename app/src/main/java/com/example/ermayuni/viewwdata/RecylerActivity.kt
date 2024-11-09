package com.example.ermayuni.viewwdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ermayuni.viewwdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding

    // Declare arrays for data and images
    private val dataBuah = arrayOf("Alpukat", "Durian", "Jambu Air", "Manggis", "Strawberry")
    private val dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the adapter with data
        val adapter = BuahAdapter(this, dataBuah, dataGambar)

        // Set up the layout manager
        val layoutManager = LinearLayoutManager(applicationContext)

        // Set the adapter and layout manager to RecyclerView
        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}
