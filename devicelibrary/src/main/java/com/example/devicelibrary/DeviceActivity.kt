package com.example.devicelibrary

import android.os.Bundle
import android.provider.Settings
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DeviceActivity : ComponentActivity() {
    lateinit var txtDeviceId : TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device);
        txtDeviceId = findViewById(R.id.txt_device_id) as TextView

        // Fetching Android ID and storing it into a constant
        val mId = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
        txtDeviceId.text = "Android Device Id : "+mId;
        // Displaying the Android ID into the TextView

        //enableEdgeToEdge()
      //  Toast.makeText(applicationContext,"Hello",Toast.LENGTH_SHORT).show();
       // setContentView(R.layout.activity_device)
      /*  ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }
}