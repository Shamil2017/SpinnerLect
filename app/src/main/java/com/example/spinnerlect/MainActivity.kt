package com.example.spinnerlect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

private lateinit var spinnerColors: Spinner
private lateinit var txtDescription: TextView
private lateinit var btnColor: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinnerColors = findViewById<Spinner> (R.id.spinnerColors)
        btnColor = findViewById<Button> (R.id.btnColor)
        txtDescription = findViewById<TextView>(R.id.txtDescription)
        btnColor.setOnClickListener {
            var color = spinnerColors.selectedItem
            txtDescription.text = getDescriptions(color.toString())
            Toast.makeText(this@MainActivity
                ,
                "Пора покормить кота!", Toast.LENGTH_SHORT).show();
        }
    }
    fun getDescriptions(color: String): String {
        return when (color) {
            "Красный" -> "Красный цвет символизирует безудержное стремление к успеху"
            "Оранжевый" -> "Это цвет людей, обладающих незаурядной интуицией и склонных к мечтательности."
            "Желтый" -> "Желтый цвет воспринимается как светящийся и теплый, так как он сильно ассоциируется с солнечным светом."
            "Зеленый" -> "Зеленый — цвет природы, естества, самой жизни, весны."
            "Голубой" -> "Голубой цвет — это символ впечатлительности, привязанности, верности."
            else -> "Это цвет неизвестный"
        }
    }
}