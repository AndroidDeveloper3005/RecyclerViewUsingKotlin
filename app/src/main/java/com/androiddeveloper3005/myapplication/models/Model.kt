package com.androiddeveloper3005.myapplication.models

import com.androiddeveloper3005.myapplication.R

data class Test(var name : String , var image : Int)

object Lists{
    val list = listOf<Test>(
        Test(
            "Himel",
            R.drawable.ic_launcher_background
        ),
        Test(
            "Annona",
            R.drawable.ic_launcher_background
        ),
        Test(
            "Shoshi",
            R.drawable.ic_launcher_background
        ),
        Test(
            "Suchona",
            R.drawable.ic_launcher_background
        ),
        Test(
            "Ripa",
            R.drawable.ic_launcher_background
        ),
        Test(
            "Sima",
            R.drawable.ic_launcher_background
        ),
        Test(
            "Arthi",
            R.drawable.ic_launcher_background
        ),
        Test(
            "Simu",
            R.drawable.ic_launcher_background
        )
    )

}