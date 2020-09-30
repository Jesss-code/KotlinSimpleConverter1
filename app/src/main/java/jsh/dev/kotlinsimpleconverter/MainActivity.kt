package jsh.dev.kotlinsimpleconverter

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_convert_weight.*

class MainActivity : AppCompatActivity() {
    private var inputActive = 1
    var convertFrom: String = ""
    var convertTo: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_weight)
        var input :String = input1.text as String

        seeSelected.setOnClickListener {
            Toast.makeText(this, "From  $convertFrom to $convertTo" , Toast.LENGTH_SHORT).show()
        }

        input1.setOnClickListener {
            setInputActive(1)
        }

        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }


            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int,id: Long) {
                convertFrom = adapterView?.getItemAtPosition(position).toString()
                convertTo = spinner2.selectedItem.toString()
                Toast.makeText(this@MainActivity,
                    " you selected $convertFrom to $convertTo ", Toast.LENGTH_SHORT).show()

                }
            }

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }


            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int,id: Long) {
                convertTo = adapterView?.getItemAtPosition(position).toString()
                convertFrom = spinner1.selectedItem.toString()
                Toast.makeText(this@MainActivity,
                    " you selected $convertFrom to $convertTo ", Toast.LENGTH_SHORT).show()

            }
        }
    }


    private fun setInputActive(i: Int) {
        if (i == 1) {
            input1.setTypeface(null, Typeface.BOLD)
            input2.setTypeface(null, Typeface.NORMAL)
            this.inputActive = 1
            this.convertFrom = spinner1.selectedItem.toString()
            this.convertTo = spinner2.selectedItem.toString()
        } else{
            input2.setTypeface(null, Typeface.BOLD)
            input1.setTypeface(null, Typeface.NORMAL)
            this.inputActive = 2
            this.convertFrom = spinner2.selectedItem.toString()
            this.convertTo = spinner1.selectedItem.toString()
        }
    }

}