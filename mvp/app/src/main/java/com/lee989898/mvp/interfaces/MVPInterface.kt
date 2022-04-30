package com.lee989898.mvp.interfaces

interface MVPInterface {

    interface DataView {
        fun initView()
        fun updateView()
    }

    interface Presenter {
        fun incrementValue()
        fun getCounter(): String
    }

    interface DataModel {
        fun incrementCounter()
        fun getCounter(): Int
    }
}