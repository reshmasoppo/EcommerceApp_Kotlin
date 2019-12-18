package com.example.ecommerceapp_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlashSaleRecommended_Adapter(val Flashsales_Rec_list:ArrayList<FlashRecommendedContent>): RecyclerView.Adapter<FlashSaleRecommended_Adapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):FlashSaleRecommended_Adapter.ViewHolder {

        val v= LayoutInflater.from(parent.context).inflate(R.layout.recommended_layout,parent,false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return Flashsales_Rec_list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val user3:FlashRecommendedContent= Flashsales_Rec_list[position]

        holder.product_name.text=user3.product_name
        holder.image.setImageResource(user3.Image)
        holder.product_rate.text=user3.product_rate
        holder.no_sale.text=user3.productsales_no
        holder.product_rating.text=user3.product_rating
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