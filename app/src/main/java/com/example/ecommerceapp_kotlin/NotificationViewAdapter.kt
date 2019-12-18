package com.example.ecommerceapp_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotificationViewAdapter(val notifcationlist: ArrayList<Notification_data>): RecyclerView.Adapter<NotificationViewAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.notification_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return notifcationlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val user1: Notification_data=notifcationlist[position]
        holder.textmessage.text=user1.Message
        holder.texttime.text= user1.Time.toString()
        holder.image.setImageResource(user1.Image)

    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val image=itemView.findViewById<ImageView>(R.id.profile_img)
        val textmessage=itemView.findViewById<TextView>(R.id.text_message)
        val texttime=itemView.findViewById<TextView>(R.id.text_time)


    }


}
