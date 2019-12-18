package com.example.ecommerceapp_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager




class HomeFragment : Fragment()
{


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
        {

             val recycler_banner:RecyclerView=view.findViewById(R.id.recycler_banner)
             recycler_banner.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,true)
             val bannerlist= ArrayList<BannerContent>()

             bannerlist.add(BannerContent(R.drawable.img_1,"So may books so little time ","explore"))
             bannerlist.add(BannerContent(R.drawable.img_2,"Be yourself everyone else is already taken","Visit Store"))
             bannerlist.add(BannerContent(R.drawable.img_2,"So may books so little time ","Collection"))
             val adapter =BannerRecyclerViewAdapter(bannerlist)
             recycler_banner.setHasFixedSize(true)
             recycler_banner.adapter= adapter

            val recycler_flash:RecyclerView=view.findViewById(R.id.recyclerview_flash)
            recycler_flash.layoutManager=LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)
           // recycler_flash.layoutManager= GridLayoutManager(activity,2,GridLayoutManager.HORIZONTAL, false)

           // val layoutManager = GridLayoutManager(activity, 2, GridLayoutManager.HORIZONTAL, false)

            val flashsales_list=ArrayList<FlashSaleContent>()
            flashsales_list.add(FlashSaleContent(R.drawable.cloth1,"20% ","Mens Polo Shirt1","130 ","4.3" ,"25 "))
            flashsales_list.add(FlashSaleContent(R.drawable.cloth2,"20% ","Mens Polo Shirt2","130 ","4.3" ,"25 "))
            flashsales_list.add(FlashSaleContent(R.drawable.cloth4,"20% ","Mens Polo Shirt3","130 ","4.3" ,"25 "))
            flashsales_list.add(FlashSaleContent(R.drawable.cloth1,"20% ","Mens Polo Shirt4","130 ","4.3" ,"25 "))
            recycler_flash.setHasFixedSize(true)
            val flash_adapter = FlashSaleAdapter(flashsales_list)
            //now adding the adapter to recyclerview
            recycler_flash .adapter = flash_adapter



            val recycler_flashsale:RecyclerView=view.findViewById(R.id.recyclerview_sale)
           // recycler_flashsale.layoutManager=LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)
           recycler_flashsale.layoutManager= GridLayoutManager(activity,2,GridLayoutManager.VERTICAL, false)


            val flashRecommended_list=ArrayList<FlashRecommendedContent>()

            flashRecommended_list.add(FlashRecommendedContent(R.drawable.cloth1,"Mens Polo Shirt1","$3000", "2554","3.1") )
            flashRecommended_list.add(FlashRecommendedContent(R.drawable.cloth2,"Mens Polo Shirt2","$4000","2554","4.1" ))
            flashRecommended_list.add(FlashRecommendedContent(R.drawable.cloth3,"Mens Polo Shirt1","$3000", "2554","3.1") )
            flashRecommended_list.add(FlashRecommendedContent(R.drawable.cloth4,"Mens Polo Shirt2","$4000","2554","4.1" ))
            flashRecommended_list.add(FlashRecommendedContent(R.drawable.cloth5,"Mens Polo Shirt1","$3000", "2554","3.1") )
            flashRecommended_list.add(FlashRecommendedContent(R.drawable.cloth1,"Mens Polo Shirt2","$4000","2554","4.1" ))


            recycler_flash.setHasFixedSize(true)

            val  recycler_flashsale_adapter = FlashSaleRecommended_Adapter(flashRecommended_list)
            //now adding the adapter to recyclerview
            recycler_flashsale.adapter = recycler_flashsale_adapter


            val recycler_brand:RecyclerView=view.findViewById(R.id.recyclerview_Brand)
            // recycler_flashsale.layoutManager=LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)
            recycler_brand.layoutManager= GridLayoutManager(activity,2,GridLayoutManager.VERTICAL, false)
            val Brand_list=ArrayList<BrandContent>()


            Brand_list.add(BrandContent(R.drawable.cloth1,"Mens Polo Shirt1","$3000", "2554","3.1") )
            Brand_list.add(BrandContent(R.drawable.cloth2,"Mens Polo Shirt2","$4000","2554","4.1" ))
            Brand_list.add(BrandContent(R.drawable.cloth3,"Mens Polo Shirt1","$3000", "2554","3.1") )
            Brand_list.add(BrandContent(R.drawable.cloth4,"Mens Polo Shirt2","$4000","2554","4.1" ))
            Brand_list.add(BrandContent(R.drawable.cloth5,"Mens Polo Shirt1","$3000", "2554","3.1") )
            Brand_list.add(BrandContent(R.drawable.cloth1,"Mens Polo Shirt2","$4000","2554","4.1" ))


            recycler_flash.setHasFixedSize(true)
            val  recycler_brand_adapter = BrandListAdapter(Brand_list)
            //now adding the adapter to recyclerview
            recycler_brand.adapter = recycler_brand_adapter



            super.onViewCreated(view, savedInstanceState)



    }


            }

