package uz.programmer710.viewpager1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.core.view.get
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import uz.programmer710.viewpager1.adapters.ViewPagerAdapter
import uz.programmer710.viewpager1.databinding.ActivityMainBinding
import uz.programmer710.viewpager1.databinding.ItemTabBinding
import uz.programmer710.viewpager1.databinding.ItemViewBinding
import uz.programmer710.viewpager1.models.MyInfo
import uz.programmer710.viewpager1.models.MyObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyObject.loadTxt()

        var index = 0

        viewPagerAdapter = ViewPagerAdapter(this, MyObject.nameTxtList)
        binding.myViewPager.adapter = viewPagerAdapter

        binding.myTab.setupWithViewPager(binding.myViewPager)

        setTab()

        binding.myViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                index=position
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        binding.cardBtnNext.setOnClickListener {
            when(index){
                0 ->{
                    binding.myViewPager.currentItem=index+1
                }
                1 ->{
                    binding.myViewPager.currentItem=index+1
                }
                2 -> {
                    binding.myViewPager.currentItem=index+1
                    binding.cardBtnNext.visibility=View.GONE
                }
            }
        }

    }

    private fun setTab() {
        val tabCount = binding.myTab.tabCount

        for (i in 0 until tabCount){
            val tabItem = ItemTabBinding.inflate(layoutInflater)
            val tab = binding.myTab.getTabAt(i)
            tab?.customView = tabItem.root

            if (i==0){
                tabItem.myDotRangsiz.setImageResource(R.drawable.item_dot_rangli)
            }else{
                tabItem.myDotRangsiz.setImageResource(R.drawable.dot)
            }
            binding.myTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    val customView=tab?.customView
                    customView?.findViewById<ImageView>(R.id.my_dot_rangsiz)?.setImageResource(R.drawable.item_dot_rangli)
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    val customView=tab?.customView
                    customView?.findViewById<ImageView>(R.id.my_dot_rangsiz)?.setImageResource(R.drawable.dot)
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }
            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        MyObject.loadTxt()
        MyObject.nameTxtList.removeAll(MyObject.nameTxtList)
    }
}