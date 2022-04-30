package com.lee989898.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.lee989898.mvp.R
import com.lee989898.mvp.databinding.ActivityMainBinding
import com.lee989898.mvp.interfaces.MVPInterface
import com.lee989898.mvp.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), MVPInterface.DataView {

    private lateinit var binding : ActivityMainBinding
    private var presenter : MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        binding.friendNum.text = presenter?.getCounter()
        binding.btn.setOnClickListener {
            presenter?.incrementValue()
        }
    }

    override fun updateView() {
        binding.friendNum.text = presenter?.getCounter()
    }
}