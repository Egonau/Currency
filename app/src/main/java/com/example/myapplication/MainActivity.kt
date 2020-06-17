package com.example.myapplication
import android.os.Bundle
import android.text.InputType
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
   fun convert(v: String): Double {
      return (v.toDouble()*69.67)
   }
    fun convert1(v: String): Double {
        return (v.toDouble()*0.0142)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnRUB.setInputType(InputType.TYPE_CLASS_NUMBER)
        etnUSD.setInputType(InputType.TYPE_CLASS_NUMBER)
                    etnRUB.setOnKeyListener(object : View.OnKeyListener {
                        override fun onKey(v: View?, p1: Int, event: KeyEvent?): Boolean {
                            val RUB: String = etnRUB.getText().toString()
                            if (RUB.isEmpty()) {
                                etnUSD.setText("")
                            } else {
                                val USD: Double = (RUB.toDouble() * 0.0142);
                                etnUSD.setText(String.format("%.3f",USD));
                            }

                        return false
                        }
                    })

                    etnUSD.setOnKeyListener(object : View.OnKeyListener {
                        override fun onKey(v: View?, p1: Int, event: KeyEvent?): Boolean {
                        val USD: String = etnUSD.getText().toString()
                        if (USD.isEmpty()) {
                            etnRUB.setText("")
                        } else {
                            val RUB: Double = (USD.toDouble() * 69.74);
                            etnRUB.setText(String.format("%.3f",RUB));
                        }

                        return false
                        }
                     })
                        button2.setOnClickListener {
                            etnUSD.getText().clear()
                            etnRUB.getText().clear()
                        }


                        }
                }


