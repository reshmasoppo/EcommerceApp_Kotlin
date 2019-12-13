package com.example.ecommerceapp_kotlin

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Notificationfragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_notificationfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        val recyclerview=view.findViewById<RecyclerView>(R.id.recycler_notification)

        recyclerview.layoutManager= LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)

        val notificationlist=ArrayList<Notification_data>()

        notificationlist.add(Notification_data(R.drawable.img_1,
            "its a long established fact that a reader will be distracted","33 min agp"))
        notificationlist.add(Notification_data(R.drawable.img_1,"Loream Lpsum is simply dummy text of the printing and ...","32 min ago"))
        notificationlist.add(Notification_data(R.drawable.img_2,"Loream Lpsum is simply dummy text of the printing and ...","34 min ago"))
        notificationlist.add(Notification_data(R.drawable.img_1,
            "its a long established fact that a reader will be distracted","33 min ago"))
        notificationlist.add(Notification_data(R.drawable.img_1,"Loream Lpsum is simply dummy text of the printing and ...","32 min ago"))
        notificationlist.add(Notification_data(R.drawable.img_2,"Loream Lpsum is simply dummy text of the printing and ...","34 min ago"))
        notificationlist.add(Notification_data(R.drawable.img_1,
            "its a long established fact that a reader will be distracted","33 min ago"))
        notificationlist.add(Notification_data(R.drawable.img_1,"Loream Lpsum is simply dummy text of the printing and ...","32 min ago"))
        notificationlist.add(Notification_data(R.drawable.img_2,"Loream Lpsum is simply dummy text of the printing and ...","34 min ago"))




        val adapter =NotificationViewAdapter(notificationlist)

        recyclerview.setHasFixedSize(true)
        recyclerview.adapter=adapter
        super.onViewCreated(view, savedInstanceState)


    }



}
