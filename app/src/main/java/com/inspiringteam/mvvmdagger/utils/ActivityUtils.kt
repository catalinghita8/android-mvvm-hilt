package com.inspiringteam.mvvmdagger.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.common.base.Preconditions

object ActivityUtils {
    /**
     * The fragment is added to the container view with id frameId. The operation is
     * performed by the fragmentManager.
     */
    @JvmStatic
    fun addFragmentToActivity(fragmentManager: FragmentManager,
                              fragment: Fragment, frameId: Int) {
        Preconditions.checkNotNull(fragmentManager)
        Preconditions.checkNotNull(fragment)
        val transaction = fragmentManager.beginTransaction()
        transaction.add(frameId, fragment)
        transaction.commit()
    }
}