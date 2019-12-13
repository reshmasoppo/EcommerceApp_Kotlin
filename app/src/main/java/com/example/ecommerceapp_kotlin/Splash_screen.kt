package com.example.ecommerceapp_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class Splash_screen : AppCompatActivity()
{



    private var dotscount: Int = 0
    private var currentPage: Int = 0
    lateinit var pager1: ViewPager
    private var imageModelArrayList: ArrayList<Splash_Model>? = null
    lateinit var Buttn_Signup:Button
    lateinit var m_indi: TextView
    private var adapter: PagerAdapter? = null
    private var sliderDotspanel: LinearLayout? = null
    private var dots= ArrayList<ImageView>()


    private val myImageList= intArrayOf(R.drawable.img_1,
    R.drawable.img_2, R.drawable.img_1,R.drawable.img_2)

    private val MyTextList= arrayOf("Travel to the top of the Space Needle's 520 ft",
        "Range of the Pacific Northwest and the highest mountain",
        "The Museum of Flight is a private non-profit air","aaaaa")

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttn_Signup = findViewById(R.id.butn_signup)

        //Hide actionBar
        supportActionBar?.hide()
        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()
        pager1 = findViewById<ViewPager>(R.id.Pager)
        sliderDotspanel=findViewById<LinearLayout>(R.id.indicator)

        adapter=SlidingImage_Adapter(this@Splash_screen, this.imageModelArrayList!!)
        pager1.setAdapter(adapter)
        dotscount=adapter!!.getCount()

        Buttn_Signup.setOnClickListener{

            // Pager.setCurrentItem(0,false)

        var intent: Intent = Intent(this, SigunUp::class.java)
          startActivity(intent)
        }

           Log.e("oppo","dotscount size"+dotscount)
            pager1.setCurrentItem(0, false)

        for (i in 0 until dotscount)
        {
            val img = android.widget.ImageView(this)
            img.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.nonactive_line_indicator))
            dots.add(img)
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
            params.setMargins(8, 0, 8, 0)
            sliderDotspanel!!.addView(dots!![i], params)

        }

        Pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener
        {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int)
            {

            }
            override fun onPageSelected(position: Int)
            {
                Log.e("oppo","onPageSelected position" +position)
                currentPage= position

                for (i in 0 until dotscount)
                {
                    dots.get(i).setImageDrawable(ContextCompat.getDrawable(this@Splash_screen, R.drawable.nonactive_line_indicator))
                }

                if(position != 0)
                    dots.get(position).setImageDrawable(ContextCompat.getDrawable(this@Splash_screen, R.drawable.active_line_indicator))
                else
                    dots.get(position).setImageDrawable(ContextCompat.getDrawable(this@Splash_screen, R.drawable.active_line_indicator))
            }


            override fun onPageScrollStateChanged(state: Int)
            {


            }
        })
       }
    private fun populateList():ArrayList<Splash_Model>
    {
        val list = ArrayList<Splash_Model>()

        for (i in 0..3)
        {
            val imageModel = Splash_Model()

            imageModel.image_drawable = myImageList.get(i)
            imageModel.text_image= MyTextList.get(i)
            list.add(imageModel)
        }
        return list
    }


}













