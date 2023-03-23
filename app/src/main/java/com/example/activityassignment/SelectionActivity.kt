package com.example.activityassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        val nbaTeams = resources.getStringArray(R.array.nba_teams)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the RecyclerView from the layout
        recyclerView = findViewById(R.id.recyclerView)

        // Set the layout manager for the RecyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Create an adapter with the image data and a callback for item click events
        imageAdapter = ImageAdapter(getImageData(nbaTeams)) { imageItem ->
            // Create an intent to launch the DisplayActivity
            val intent = Intent(this, DisplayActivity::class.java)

            // Put the image data into the intent as extras
            intent.putExtra("imageId", imageItem.id)
            intent.putExtra("imageName", imageItem.name)

            startActivity(intent)
        }

        recyclerView.adapter = imageAdapter
    }

    private fun getImageData(nbaTeams: Array<String>): List<ImageItem> {
        return listOf(
            ImageItem(R.drawable.atlantahawks, nbaTeams[0]),
            ImageItem(R.drawable.bostonceltics, nbaTeams[1]),
            ImageItem(R.drawable.brooklynnets, nbaTeams[2]),
            ImageItem(R.drawable.charlottehornets, nbaTeams[3]),
            ImageItem(R.drawable.chicagobulls, nbaTeams[4]),
            ImageItem(R.drawable.clevelandcavaliers, nbaTeams[5]),
            ImageItem(R.drawable.dallasmavericks, nbaTeams[6]),
            ImageItem(R.drawable.denvernuggets, nbaTeams[7]),
            ImageItem(R.drawable.detroitpistons, nbaTeams[8]),
            ImageItem(R.drawable.goldenstatewarriors, nbaTeams[9]),
            ImageItem(R.drawable.houstonrockets, nbaTeams[10]),
            ImageItem(R.drawable.indianapacers, nbaTeams[11]),
            ImageItem(R.drawable.losangelesclippers, nbaTeams[12]),
            ImageItem(R.drawable.losangeleslakers, nbaTeams[13]),
            ImageItem(R.drawable.memphisgrizzlies, nbaTeams[14]),
            ImageItem(R.drawable.miamiheat, nbaTeams[15]),
            ImageItem(R.drawable.milwaukeebucks, nbaTeams[16]),
            ImageItem(R.drawable.minnesotatimberwolves, nbaTeams[17]),
            ImageItem(R.drawable.neworleanspelicans, nbaTeams[18]),
            ImageItem(R.drawable.newyorkknicks, nbaTeams[19]),
            ImageItem(R.drawable.oklahomacitythunder, nbaTeams[20]),
            ImageItem(R.drawable.orlandomagic, nbaTeams[21]),
            ImageItem(R.drawable.philadelphia76ers, nbaTeams[22]),
            ImageItem(R.drawable.phoneixsuns, nbaTeams[23]),
            ImageItem(R.drawable.portlandtrailblazers, nbaTeams[24]),
            ImageItem(R.drawable.sacramentokings, nbaTeams[25]),
            ImageItem(R.drawable.sanantoniospurs, nbaTeams[26]),
            ImageItem(R.drawable.torontoraptors, nbaTeams[27]),
            ImageItem(R.drawable.utahjazz, nbaTeams[28]),
            ImageItem(R.drawable.washingtonwizards, nbaTeams[29])
        )
    }
}