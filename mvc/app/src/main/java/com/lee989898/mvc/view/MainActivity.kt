package com.lee989898.mvc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.lee989898.mvc.R
import com.lee989898.mvc.model.ToDo
import com.lee989898.mvc.controller.ToDoController
import com.lee989898.mvc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val model: ToDo = getDataFromDb()
        val view = MainActivity()

        val controller = ToDoController(model, view)

        binding.todo.text = controller.getToDo()
        binding.time.text = controller.getTime()

        binding.btn.setOnClickListener {
            controller.setToDo("밥먹기")
            controller.setTime("17:00")
            controller.updateView()
            binding.todo.text = controller.getToDo()
            binding.time.text = controller.getTime()
        }
    }

    private fun getDataFromDb(): ToDo {
        return ToDo("잠자기", "19:00")
    }

    fun printDetails(todo: String, time: String) {
        Log.d("ToDo", "todo =$todo")
        Log.d("ToDo", "time =$time")
    }
}