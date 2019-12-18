package com.example.ecommerceapp_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class Favoritedata_Adapter(val Fav_list:ArrayList<Favorite_datacontent>): RecyclerView.Adapter< Favoritedata_Adapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Favoritedata_Adapter.ViewHolder {

        val v= LayoutInflater.from(parent.context).inflate(R.layout.favlayout,parent,false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return Fav_list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val fav_content:Favorite_datacontent= Fav_list[position]

        holder.product_name.text=fav_content.product_name
        holder.image.setImageResource(fav_content.Image)
        holder.product_rate.text=fav_content.product_rate
        holder.no_sale.text=fav_content.productsales_no
        holder.product_rating.text=fav_content.product_rating


    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {

        val image=itemView.findViewById<ImageView>(R.id.productimage)
        val product_name =itemView.findViewById<TextView>(R.id.text_productname)
        val product_rate =itemView.findViewById<TextView>(R.id.text_productRange)
        val  no_sale=itemView.findViewById<TextView>(R.id.text_sales_amount)
        val  product_rating =itemView.findViewById<TextView>(R.id.rating)




    }

}