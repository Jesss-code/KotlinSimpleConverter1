package jsh.dev.kotlinsimpleconverter

import android.os.Bundle

import android.text.InputType
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_convert_weight.*


class ConvertWeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_weight)

        button1.setOnClickListener {
            Toast.makeText(this, "Try", Toast.LENGTH_SHORT).show()
        }
    }
}