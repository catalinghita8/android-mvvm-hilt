package com.inspiringteam.mvvmdagger.ui.message

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.inspiringteam.mvvmdagger.BaseView
import com.inspiringteam.mvvmdagger.R
import com.inspiringteam.mvvmdagger.di.scopes.ActivityScoped
import dagger.android.support.DaggerFragment
import javax.inject.Inject

@ActivityScoped
class MessageFragment @Inject constructor() : DaggerFragment(), BaseView {
    private var mMessageTextView: TextView? = null
    private var mViewModel: MessageViewModel? = null

    @JvmField
    @Inject
    var viewModelFactory: ViewModelProvider.Factory? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // get ViewModel
        mViewModel = ViewModelProvider(this)[MessageViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_message, container, false)
        mMessageTextView = root.findViewById(R.id.message_tv)
        return root
    }

    override fun bindViewModel() {
        updateView(mViewModel!!.uiModel)
    }

    private fun updateView(uiModel: MessageUiModel) {
        mMessageTextView!!.text = uiModel.messageText
    }

    override fun onResume() {
        super.onResume()
        bindViewModel()
    }

    override fun onPause() {
        super.onPause()
        unbindViewModel()
    }

    override fun unbindViewModel() {}
}