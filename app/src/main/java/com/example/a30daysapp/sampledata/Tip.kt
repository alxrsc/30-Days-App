package com.example.a30daysapp.sampledata

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysapp.R


data class Tip (
    @DrawableRes val imageResourceId: Int,
    @StringRes val titleRes: Int,
    @StringRes val bodyRes: Int,
    @StringRes val contentDescription: Int? = null //small description of the image if provided, else null
)

val tips = listOf(
    Tip(R.drawable.img_0, R.string.app_description, R.string.app_name)
)