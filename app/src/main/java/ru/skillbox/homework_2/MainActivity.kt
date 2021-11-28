package ru.skillbox.homework_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag = "poem"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag, "В Академии наук")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "Заседает князь Дундук")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "Говорят, не подобает")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "Дундуку такая честь;")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "Почему ж он заседает?")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "Потому что есть чем сесть.")
    }
}