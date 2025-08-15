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
    Tip(R.drawable.img_0, R.string.day_1, R.string.tipTitle_1, R.string.tipBody_1),
    Tip(R.drawable.img_1, R.string.day_2, R.string.tipTitle_2, R.string.tipBody_2),
    Tip(R.drawable.img_2, R.string.day_3, R.string.tipTitle_3, R.string.tipBody_3),
    Tip(R.drawable.img_3, R.string.day_4, R.string.tipTitle_4, R.string.tipBody_4),
    Tip(R.drawable.img_4, R.string.day_5, R.string.tipTitle_5, R.string.tipBody_5),
    Tip(R.drawable.img_5, R.string.day_6, R.string.tipTitle_6, R.string.tipBody_6),
    Tip(R.drawable.img_6, R.string.day_7, R.string.tipTitle_7, R.string.tipBody_7),
    Tip(R.drawable.img_7, R.string.day_8, R.string.tipTitle_8, R.string.tipBody_8),
    Tip(R.drawable.img_8, R.string.day_9, R.string.tipTitle_9, R.string.tipBody_9),
    Tip(R.drawable.img_9, R.string.day_10, R.string.tipTitle_10, R.string.tipBody_10),
    Tip(R.drawable.img_10, R.string.day_11, R.string.tipTitle_11, R.string.tipBody_11),
    Tip(R.drawable.img_11, R.string.day_12, R.string.tipTitle_12, R.string.tipBody_12),
    Tip(R.drawable.img_12, R.string.day_13, R.string.tipTitle_13, R.string.tipBody_13),
    Tip(R.drawable.img_13, R.string.day_14, R.string.tipTitle_14, R.string.tipBody_14),
    Tip(R.drawable.img_14, R.string.day_15, R.string.tipTitle_15, R.string.tipBody_15),
    Tip(R.drawable.img_15, R.string.day_16, R.string.tipTitle_16, R.string.tipBody_16),
    Tip(R.drawable.img_16, R.string.day_17, R.string.tipTitle_17, R.string.tipBody_17),
    Tip(R.drawable.img_17, R.string.day_18, R.string.tipTitle_18, R.string.tipBody_18),
    Tip(R.drawable.img_18, R.string.day_19, R.string.tipTitle_19, R.string.tipBody_19),
    Tip(R.drawable.img_19, R.string.day_20, R.string.tipTitle_20, R.string.tipBody_20),
    Tip(R.drawable.img_20, R.string.day_21, R.string.tipTitle_21, R.string.tipBody_21),
    Tip(R.drawable.img_21, R.string.day_22, R.string.tipTitle_22, R.string.tipBody_22),
    Tip(R.drawable.img_22, R.string.day_23, R.string.tipTitle_23, R.string.tipBody_23),
    Tip(R.drawable.img_23, R.string.day_24, R.string.tipTitle_24, R.string.tipBody_24),
    Tip(R.drawable.img_24, R.string.day_25, R.string.tipTitle_25, R.string.tipBody_25),
    Tip(R.drawable.img_25, R.string.day_26, R.string.tipTitle_26, R.string.tipBody_26),
    Tip(R.drawable.img_26, R.string.day_27, R.string.tipTitle_27, R.string.tipBody_27),
    Tip(R.drawable.img_27, R.string.day_28, R.string.tipTitle_28, R.string.tipBody_28),
    Tip(R.drawable.img_28, R.string.day_29, R.string.tipTitle_29, R.string.tipBody_29),
    Tip(R.drawable.img_29, R.string.day_30, R.string.tipTitle_30, R.string.tipBody_30)
)

