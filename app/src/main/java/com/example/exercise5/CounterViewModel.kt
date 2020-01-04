package com.example.exercise5



import android.util.Log
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var countDislike: Int = 0
    var countLike: Int = 0

    init {
        Log.d("CounterViewModel", "ViewModel created")
    }
    fun likeCountAdd(){
        countLike++
    }

    fun dislikeCountAdd() {
        countDislike++
    }
    override fun onCleared() {
        Log.d("CounterViewModel", "ViewModel destroyed")
        super.onCleared()
    }
}