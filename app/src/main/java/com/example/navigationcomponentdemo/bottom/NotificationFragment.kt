package com.example.navigationcomponentdemo.bottom

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentdemo.R
import com.example.navigationcomponentdemo.staticCounter

class NotificationFragment : Fragment() {

    var myCounter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myCounter = staticCounter++
        Log.d("Tracking", "A new NotificationFragment $myCounter")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Tracking", "Resume NotificationFragment $myCounter")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }
}
