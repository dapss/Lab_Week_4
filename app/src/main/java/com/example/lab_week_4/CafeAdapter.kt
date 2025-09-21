package com.example.lab_week_4

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CafeDetailFragment.newInstance("Starbucks", "Coffee")
            1 -> CafeDetailFragment.newInstance("Janji Jiwa", "Kopi Susu")
            2 -> CafeDetailFragment.newInstance("Kopi Kenangan", "Es Kopi")
            else -> CafeDetailFragment.newInstance("Unknown", "Unknown")
        }
    }
}
