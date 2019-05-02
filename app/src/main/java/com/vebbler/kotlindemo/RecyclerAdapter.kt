package com.vebbler.kotlindemo

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_user.view.*

class RecyclerAdapter(private val userList: List<UserModel>) : RecyclerView.Adapter<RecyclerAdapter.UserHolder>() {

    override fun onBindViewHolder(holder: RecyclerAdapter.UserHolder, position: Int) {
        holder.bindUser(userList.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.UserHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class UserHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v
        private var user: UserModel? = null


        init {
            v.setOnClickListener(this)
        }


        override fun onClick(v: View) {
            Log.d("RecyclerView", "CLICK!")
        }


        fun bindUser(user: UserModel) {

            view.userNameTextView.text = user.getName()
        }
    }
}

