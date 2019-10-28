package buivanduc210198.com.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num1:Double = 0.0
    var num2:Double =0.0
    var result: Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        phepToan()
    }
    private fun phepToan(){
        Add.setOnClickListener { cal("+") }

        Sub.setOnClickListener { cal("-") }

        Mul.setOnClickListener { cal("*") }

        Div.setOnClickListener { cal("/") }
    }
    private fun cal(type: String){
        Result.text="Kết Quả: 0"
        if (editText1.text.isEmpty()){
            editText1.requestFocus()
            Toast.makeText(this@MainActivity,"Số Thứ Nhất",Toast.LENGTH_SHORT).show()
            return
        }
        if (editText2.text.isEmpty()){
            editText2.requestFocus()
            Toast.makeText(this,"Số Thứ Hai",Toast.LENGTH_LONG).show()
            return
        }
        num1=editText1.text.toString().toDouble()
        num2 = editText2.text.toString().toDouble()

        result= when(type){
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" ->num1 * num2
            "/" ->num1 / num2
            else -> 0.0        }
        Result.text ="Kết Quả: ${result.toString()}"
    }
}
