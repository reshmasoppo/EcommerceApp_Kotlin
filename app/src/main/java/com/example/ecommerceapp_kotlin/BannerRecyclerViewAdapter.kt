package com.example.ecommerceapp_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BannerRecyclerViewAdapter (val bannnerlist:ArrayList<BannerContent>): RecyclerView.Adapter<BannerRecyclerViewAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerRecyclerViewAdapter.ViewHolder
    {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.banner_layout,parent,false)
        return ViewHolder(v)
    }


    override fun getItemCount(): Int
    {
        return bannnerlist.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val user1:BannerContent=bannnerlist[position]
        holder.textname.text=user1.Name
        holder.image.setImageResource(user1.Image)
        holder.button.text=user1.buttonText
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val image= itemView.findViewById<ImageView>(R.id.banner_image)
        val textname=itemView.findViewById<TextView>(R.id.banner_content)
        val button = itemView.findViewById<Button>(R.id.banner_button)
    }


}