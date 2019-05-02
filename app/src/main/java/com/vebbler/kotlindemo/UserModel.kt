package com.vebbler.kotlindemo

class UserModel {
    var userName: String? = null

    fun getName(): String? {
        return userName
    }

    fun setName(name: String?) {
        this.userName = name
    }
}