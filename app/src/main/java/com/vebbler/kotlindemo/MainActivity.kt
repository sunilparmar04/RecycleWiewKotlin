package com.vebbler.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: RecyclerAdapter
    private var userList: MutableList<UserModel> = ArrayList<UserModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init(){
        var userModel:UserModel?=UserModel()
        userModel!!.setName("suni")

        var userModel1:UserModel?=UserModel()
        userModel1!!.setName("demo")
        userList.add(userModel)

        userList.add(userModel1)

        linearLayoutManager = LinearLayoutManager(this)
        chatRecyclerView.layoutManager = linearLayoutManager
        adapter = RecyclerAdapter(userList)
        chatRecyclerView.adapter = adapter

    }
}
