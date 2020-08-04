package com.inspiringteam.mvvmdagger.ui.message

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inspiringteam.mvvmdagger.R
import com.inspiringteam.mvvmdagger.utils.ActivityUtils.addFragmentToActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MessageActivity : AppCompatActivity() {

    @Inject
    lateinit var mInjectedFragment: MessageFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        // Set up fragment
        var fragment = supportFragmentManager.findFragmentById(R.id.contentFrame) as MessageFragment?
        if (fragment == null) {
            fragment = mInjectedFragment
            addFragmentToActivity(supportFragmentManager, fragment, R.id.contentFrame)
        }
    }
}