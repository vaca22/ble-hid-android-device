package com.vaca.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AbstractBleActivity() {
   lateinit var keyboard: KeyboardPeripheral

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupBlePeripheralProvider() {
        keyboard = KeyboardPeripheral(this)
        keyboard.setDeviceName("fuckyou")
        keyboard.startAdvertising()
        Log.e("fuck","fuckyou")
    }

    override fun onDestroy() {
        keyboard.stopAdvertising()
        super.onDestroy()
    }

    fun fuck(view: View) {
        keyboard.sendKeys("fuckyou")
    }
}