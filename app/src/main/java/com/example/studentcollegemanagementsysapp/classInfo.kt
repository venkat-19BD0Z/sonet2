package com.example.studentcollegemanagementsysapp

class classInfo(var Branches:String,var classes:String) {
    override fun toString(): String {
        return "${Branches} - ${classes}"
    }
}