package com.dev.home.mylibrarysonda

import android.annotation.SuppressLint
import android.util.Log
import java.text.SimpleDateFormat
import java.time.Clock
import java.util.Calendar
import java.util.Date

class LodDebugUtil {
    var txtLog:String = ""
    var tag:String="SUPER_APP_KOTLIN"

    @SuppressLint("SimpleDateFormat")
    fun printLog(mensaje:String){
        var fecha:String = ""
        val currentDateTime: java.util.Date = java.util.Date()
        val currentTimestamp: Long = currentDateTime.time

        val time = Calendar.getInstance().time
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val current = formatter.format(time)

        println(txtLog)
        Log.d(tag, "[$current] - $mensaje")
    }

}