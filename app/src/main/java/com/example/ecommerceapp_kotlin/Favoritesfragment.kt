package com.example.ecommerceapp_kotlin

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Favoritesfragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_favoritesfragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerviewFav=view.findViewById<RecyclerView>(R.id.fav_recyclerview)
        recyclerviewFav.layoutManager= GridLayoutManager(activity,2, GridLayoutManager.VERTICAL, false)

        val favlist=ArrayList<Favorite_datacontent>()


        favlist.add(
            Favorite_datacontent(R.drawable.cloth1,
            "Mens Polo Shirt1","$3000", "2554","3.1") )

        favlist.add(Favorite_datacontent(R.drawable.cloth2,
            "Mens Polo Shirt2","$4000","2554","4.1" ))

        favlist.add(Favorite_datacontent(R.drawable.cloth3,
            "Mens Polo Shirt1","$3000", "2554","3.1") )

        favlist.add(Favorite_datacontent(R.drawable.cloth4,
            "Mens Polo Shirt2","$4000","2554","4.1" ))

        favlist.add(Favorite_datacontent(R.drawable.cloth5,
            "Mens Polo Shirt1","$3000", "2554","3.1") )

        favlist.add(Favorite_datacontent(R.drawable.cloth1,
            "Mens Polo Shirt2","$4000","2554","4.1" ))


        recyclerviewFav.setHasFixedSize(true)
        val  recycler_flashsale_adapter = Favoritedata_Adapter(favlist)
        //now adding the adapter to recyclerview
        recyclerviewFav.adapter = recycler_flashsale_adapter



        super.onViewCreated(view, savedInstanceState)



    }

}
