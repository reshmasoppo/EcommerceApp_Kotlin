package com.example.ecommerceapp_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demoecommerce_kotlin.MessageContent

class MessageViewAdapter  (val messagelist: ArrayList<MessageContent>): RecyclerView.Adapter<MessageViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.message_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return messagelist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user1: MessageContent =messagelist[position]

        holder.profile_name.text=user1.Prof_Name
        holder.textmessage.text=user1.Text_message
        holder.texttime.text= user1.Text_time
        //holder.profile_img.setImageResource(user1.Image)

    }



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        //val profile_img=itemView.findViewById<TextView>(R.id.profile_image)
        val profile_name=itemView.findViewById<TextView>(R.id.prof_name)
        val textmessage =itemView.findViewById<TextView>(R.id.msg_content)
        val texttime=itemView.findViewById<TextView>(R.id.msg_time)


    }


}
