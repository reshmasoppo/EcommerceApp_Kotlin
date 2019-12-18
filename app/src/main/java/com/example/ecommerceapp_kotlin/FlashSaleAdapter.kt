package com.example.ecommerceapp_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class  FlashSaleAdapter(val Flashsaleslist:ArrayList<FlashSaleContent>): RecyclerView.Adapter<FlashSaleAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlashSaleAdapter.ViewHolder {

        val v= LayoutInflater.from(parent.context).inflate(R.layout.flash_layout,parent,false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return Flashsaleslist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val user2:FlashSaleContent=Flashsaleslist[position]
        holder.percentage_discount.text=user2.percentage_discount
        holder.image.setImageResource(user2.Image)
        holder.product_name.text=user2.product_name
        holder.no_sale.text=user2.no_sale
        holder.product_rating.text=user2.product_rating
        holder.available_product_amount.text=user2.available_product_amount
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {

        val image=itemView.findViewById<ImageView>(R.id.product_image)
        val percentage_discount=itemView.findViewById<Button>(R.id.discountPercentageTextView)
        val product_name =itemView.findViewById<TextView>(R.id.product_name)
        val  no_sale=itemView.findViewById<TextView>(R.id.sale_text)
        val  product_rating =itemView.findViewById<TextView>(R.id.product_ratingTV)
        val available_product_amount =itemView.findViewById<TextView>(R.id.available_product_amount)



    }

}