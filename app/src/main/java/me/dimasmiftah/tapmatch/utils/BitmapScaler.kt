package me.dimasmiftah.tapmatch.utils

import android.graphics.Bitmap

object BitmapScaler {
    // Scale and maintain aspect ratio given a desired width
    // BitmapScaler.scaleToGitWidth(bitmap, 100);
    fun scaleToFitWidth(b:Bitmap, widhth: Int): Bitmap {
        val factor = widhth/b.width.toFloat()
        return Bitmap.createScaledBitmap(b,widhth,(b.height*factor).toInt(),true)
    }

    // Scale and maintain aspect ratio given a desired height
    fun scaleToFitHeight(b: Bitmap, height:Int): Bitmap{
        val factor = height/b.height.toFloat()
        return Bitmap.createScaledBitmap(b,(b.width*factor).toInt(),height,true)
    }

}
