package com.lee989898.mvp.model

import com.lee989898.mvp.interfaces.MVPInterface

class MainActivityModel : MVPInterface.DataModel {

    private var counter = 0

    override fun incrementCounter() {
        counter++
    }

    override fun getCounter(): Int {
        return counter
    }
}