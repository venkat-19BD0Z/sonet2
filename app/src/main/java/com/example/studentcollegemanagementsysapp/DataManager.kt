package com.example.studentcollegemanagementsysapp

class DataManager {
    var cse_class = ArrayList<classInfo>()
    var it_class = ArrayList<classInfo>()
    var ece_class = ArrayList<classInfo>()

    init {
        initcse()
        initit()
        initece()
    }
    private fun initcse(){
        var csec = classInfo("cse","class 1")
        cse_class.add(csec)

        csec = classInfo("cse","class 2")
        cse_class.add(csec)

        csec = classInfo("cse","class 3")
        cse_class.add(csec)
    }
    private fun initit(){
        var itc = classInfo("it","class 1")
        it_class.add(itc)

        itc = classInfo("it","class 2")
        it_class.add(itc)

        itc = classInfo("it","class 3")
        it_class.add(itc)
    }
    private fun initece(){
        var ecec = classInfo("ece","class 1")
        ece_class.add(ecec)

        ecec = classInfo("ece","class 2")
        ece_class.add(ecec)

        ecec = classInfo("ece","class 3")
        ece_class.add(ecec)
    }
}


