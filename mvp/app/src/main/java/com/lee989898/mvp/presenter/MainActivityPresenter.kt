package com.lee989898.mvp.presenter

import com.lee989898.mvp.interfaces.MVPInterface
import com.lee989898.mvp.model.MainActivityModel

class MainActivityPresenter(view: MVPInterface.DataView) : MVPInterface.Presenter{

    private var view: MVPInterface.DataView = view
    private var model: MVPInterface.DataModel = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateView()
    }

    override fun getCounter(): String {
        return model.getCounter().toString()
    }
}