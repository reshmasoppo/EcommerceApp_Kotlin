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
import com.example.demoecommerce_kotlin.MessageContent


class Messagefragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messagefragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        val recyclerview=view.findViewById<RecyclerView>(R.id.recycler_message)
        recyclerview.layoutManager= LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        val messagelist= ArrayList<MessageContent>()

        messagelist.add(MessageContent(R.drawable.img_1, "Kelly R.Hart","Accepts one silver as content","63 min ago"))
        messagelist.add(MessageContent(R.drawable.img_1, "Carol R.Hansen","Can scroll in any direction","32 min ago"))
        messagelist.add(MessageContent(R.drawable.img_1, "Kelly R.Hart","Accepts one silver as content","63 min ago"))
        messagelist.add(MessageContent(R.drawable.img_1, "Carol R.Hansen","Can scroll in any direction","32 min ago"))
        messagelist.add(MessageContent(R.drawable.img_1, "Kelly R.Hart","Accepts one silver as content","63 min ago"))
        messagelist.add(MessageContent(R.drawable.img_1, "Carol R.Hansen","Can scroll in any direction","32 min ago"))
        messagelist.add(MessageContent(R.drawable.img_1, "Kelly R.Hart","Accepts one silver as content","63 min ago"))
        messagelist.add(MessageContent(R.drawable.img_1, "Carol R.Hansen","Can scroll in any direction","32 min ago"))

        val adapter =MessageViewAdapter(messagelist)
        recyclerview.setHasFixedSize(true)

        recyclerview.adapter=adapter

        super.onViewCreated(view, savedInstanceState)





    }}

