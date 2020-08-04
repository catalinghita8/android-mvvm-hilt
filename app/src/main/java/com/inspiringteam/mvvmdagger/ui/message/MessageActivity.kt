package com.inspiringteam.mvvmdagger.ui.message

import android.os.Bundle
import com.inspiringteam.mvvmdagger.R
import com.inspiringteam.mvvmdagger.utils.ActivityUtils.addFragmentToActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MessageActivity : DaggerAppCompatActivity() {
    @JvmField
    @Inject
    var mInjectedFragment: MessageFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        // Set up fragment
        var fragment = supportFragmentManager.findFragmentById(R.id.contentFrame) as MessageFragment?
        if (fragment == null) {
            fragment = mInjectedFragment
            addFragmentToActivity(supportFragmentManager, fragment!!, R.id.contentFrame)
        }
    }
}