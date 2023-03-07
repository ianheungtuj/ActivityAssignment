package com.example.activityassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val images = arrayOf(
            ImageItem(R.drawable.atlantahawks, "Atlanta Hawks"),
            ImageItem(R.drawable.bostonceltics, "Boston Celtics"),
            ImageItem(R.drawable.brooklynnets, "Brooklyn Nets"),
            ImageItem(R.drawable.charlottehornets, "Charlotte Hornets"),
            ImageItem(R.drawable.chicagobulls, "Chicago Bulls"),
            ImageItem(R.drawable.clevelandcavaliers, "Cleveland Cavaliers"),
            ImageItem(R.drawable.dallasmavericks, "Dallas Mavericks"),
            ImageItem(R.drawable.denvernuggets, "Denver Nuggets"),
            ImageItem(R.drawable.detroitpistons, "Detroit Pistons"),
            ImageItem(R.drawable.goldenstatewarriors, "Golden State Warriors"),
            ImageItem(R.drawable.houstonrockets, "Houston Rockets"),
            ImageItem(R.drawable.indianapacers, "Indiana Pacers"),
            ImageItem(R.drawable.losangelesclippers, "Los Angeles Clippers"),
            ImageItem(R.drawable.losangeleslakers, "Los Angeles Lakers"),
            ImageItem(R.drawable.memphisgrizzlies, "Memphis Grizzlies"),
            ImageItem(R.drawable.miamiheat, "Miami Heat"),
            ImageItem(R.drawable.milwaukeebucks, "Milwaukee Bucks"),
            ImageItem(R.drawable.minnesotatimberwolves, "Minnesota Timberwolves"),
            ImageItem(R.drawable.neworleanspelicans, "New Orleans Pelicans"),
            ImageItem(R.drawable.newyorkknicks, "New York Knicks"),
            ImageItem(R.drawable.oklahomacitythunder, "Oklahoma City Thunder"),
            ImageItem(R.drawable.orlandomagic, "Orlando Magic"),
            ImageItem(R.drawable.philadelphia76ers, "Philadelphia 76ers"),
            ImageItem(R.drawable.phoneixsuns, "Phoenix Suns"),
            ImageItem(R.drawable.portlandtrailblazers, "Portland Trailblazers"),
            ImageItem(R.drawable.sacramentokings, "Sacramento Kings"),
            ImageItem(R.drawable.sanantoniospurs, "San Antonio Spurs"),
            ImageItem(R.drawable.torontoraptors, "Toronto Raptors"),
            ImageItem(R.drawable.utahjazz, "Utah Jazz"),
            ImageItem(R.drawable.washingtonwizards, "Washington Wizards"),
        )

    }
}