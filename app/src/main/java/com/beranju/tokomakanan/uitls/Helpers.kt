package com.beranju.tokomakanan.uitls

import android.widget.TextView
import java.text.DecimalFormat

object Helpers {

    fun TextView.format(value: String){
        this.text = getCurrencyIDR(value.toDouble())
    }

    private fun getCurrencyIDR(value: Double): String {
        val format = DecimalFormat("#,###,###")
        return "IDR" + format.format(value).replace(",".toRegex(), ".")
    }
}