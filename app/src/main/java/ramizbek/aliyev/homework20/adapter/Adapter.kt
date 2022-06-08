package ramizbek.aliyev.homework20.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ramizbek.aliyev.homework20.FirstFragment

class Adapter(var list: List<String>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return FirstFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return list[position]
    }
}