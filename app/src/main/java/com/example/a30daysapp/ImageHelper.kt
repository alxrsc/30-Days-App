package com.example.a30daysapp.ui.components

import android.graphics.BitmapFactory
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun LoadScaledImage(
    @DrawableRes resId: Int,
    modifier: Modifier = Modifier,
    sampleSize: Int = 4 // reduces memory usage
) {
    val context = LocalContext.current
    val imageBitmap = remember(resId) {
        val options = BitmapFactory.Options().apply {
            inJustDecodeBounds = false
            inSampleSize = sampleSize
        }
        BitmapFactory.decodeResource(context.resources, resId, options)?.asImageBitmap()
    }

    imageBitmap?.let {
        Image(
            bitmap = it,
            contentDescription = null,
            modifier = modifier,
            contentScale = ContentScale.Crop // zooms to fill frame
        )
    }
}
