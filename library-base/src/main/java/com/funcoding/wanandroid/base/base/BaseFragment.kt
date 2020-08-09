package com.funcoding.wanandroid.base.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment(), ScrollTop {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayResId(), container, false)
    }

    abstract fun getLayResId(): Int

    override fun scrollTop() {

    }
}