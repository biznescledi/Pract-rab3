package dev.artem.olegu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

var list = mutableListOf<Int>() //список куда будут класться элементы


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //с помощью цикла заполняем коллекцию числасми от 1 до 10
        for (i in 1..10) {
            list.add(i)
        }
        printOnScreen() //вызываем метод
    }

    fun printOnScreen(){
        // инициализируем переменную типа TextView
        val textView: TextView = findViewById(R.id.textView)
        // присваиваем текстовое значение коллекции
        textView.text = list.toString()
    }
}