package com.example.jet_nav_databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count =0
    var countdata = MutableLiveData<Int>()



    fun increase(){
        count++
        countdata.value = count
    }

    fun decrease(){
        count--
        countdata.value = count

    }
}