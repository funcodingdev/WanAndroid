package cn.funcoding.wanandroid.home.fragment.project

import cn.funcoding.wanandroid.base.base.BaseFragment
import cn.funcoding.wanandroid.home.R

/**
 * 项目页面
 */
class ProjectFragment : BaseFragment() {

    companion object{
        fun newInstance() = ProjectFragment()
    }

    override fun getLayResId(): Int = R.layout.home_project_fragment
}