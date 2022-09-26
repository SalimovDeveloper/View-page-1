package uz.programmer710.viewpager1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import uz.programmer710.viewpager1.databinding.ItemViewBinding
import uz.programmer710.viewpager1.models.MyInfo

class ViewPagerAdapter(val context: Context, val list: List<MyInfo>): PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = LayoutInflater.from(context)
        val view = ItemViewBinding.inflate(layoutInflater, container, false)

        view.itemContener.setBackgroundResource(list[position].image)
        view.nameTxt.text = list[position].nametxt
        view.infoTxt.text = list[position].txt

        container.addView(view.root)
        return view.root
    }

    override fun getCount(): Int = list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}