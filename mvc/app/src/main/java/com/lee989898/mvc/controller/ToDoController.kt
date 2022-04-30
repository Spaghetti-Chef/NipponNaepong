package com.lee989898.mvc.controller

import com.lee989898.mvc.model.ToDo
import com.lee989898.mvc.view.MainActivity

class ToDoController(var model: ToDo, var view: MainActivity) {

    fun getToDo(): String {
        return model.todo
    }

    fun getTime(): String{
        return model.time
    }

    fun setToDo(todo: String){
        model.todo = todo
    }

    fun setTime(time: String){
        model.time = time
    }

    fun updateView(){
        view.printDetails(model.todo, model.time)
    }

}