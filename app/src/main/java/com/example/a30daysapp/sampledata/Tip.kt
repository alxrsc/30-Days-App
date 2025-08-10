package com.example.a30daysapp.sampledata

import androidx.annotation.DrawableRes
import androidx.annotation.StringDef
import androidx.annotation.StringRes
import com.example.a30daysapp.R


data class Tip (
    @DrawableRes val imageResourceId: Int,
    @StringRes val dayNum: Int,
    @StringRes val titleRes: Int,
    @StringRes val bodyRes: Int,
    @StringRes val contentDescription: Int? = null //small description of the image if provided, else null
)

val tips = listOf(
    Tip(R.drawable.img_0, R.string.day_1, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_1, R.string.day_2, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_2, R.string.day_3, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_3, R.string.day_4, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_4, R.string.day_5, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_5, R.string.day_6, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_6, R.string.day_7, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_7, R.string.day_8, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_8, R.string.day_9, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_9, R.string.day_10, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_10, R.string.day_11, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_11, R.string.day_12, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_12, R.string.day_13, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_13, R.string.day_14, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_14, R.string.day_15, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_15, R.string.day_16, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_16, R.string.day_17, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_17, R.string.day_18, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_18, R.string.day_19, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_19, R.string.day_20, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_20, R.string.day_21, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_21, R.string.day_22, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_22, R.string.day_23, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_23, R.string.day_24, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_24, R.string.day_25, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_25, R.string.day_26, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_26, R.string.day_27, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_27, R.string.day_28, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_28, R.string.day_29, R.string.app_description, R.string.app_name),
    Tip(R.drawable.img_29, R.string.day_30, R.string.app_description, R.string.app_name),
)
