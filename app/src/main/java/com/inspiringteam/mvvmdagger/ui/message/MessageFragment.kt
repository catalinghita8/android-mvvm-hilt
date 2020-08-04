package com.inspiringteam.mvvmdagger.ui.message


import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.inspiringteam.mvvmdagger.BaseView
import com.inspiringteam.mvvmdagger.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_message.*
import javax.inject.Inject

@AndroidEntryPoint
class MessageFragment @Inject constructor() : Fragment(R.layout.fragment_message), BaseView {

    private val viewModel: MessageViewModel by viewModels()

    override fun bindViewModel() {
        updateView(viewModel.uiModel)
    }

    private fun updateView(uiModel: MessageUiModel) {
        textViewMessage.text = uiModel.messageText
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