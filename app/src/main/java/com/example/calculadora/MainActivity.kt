
package com.example.calculadora
 
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
 
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// TODO
        var opeUno : TextView = findViewById(R.id.operandoUno)
        var opeDos : TextView = findViewById(R.id.operandoDos)
        var resul : TextView = findViewById(R.id.resultado)
 
        fun operate(operador: String) {
            var uno: Double = (opeUno.text.toString()).toDouble();
            var dos: Double = (opeDos.text.toString()).toDouble()
            if (operador.equals("+")) {
                resul.setText((uno + dos).toString())
            }
            else if (operador.equals("-")) {
                resul.setText((uno - dos).toString())
            }
            else if (operador.equals("*")) {
                resul.setText((uno * dos).toString())
            }
            else if (operador.equals("/")) {
                resul.setText((uno / dos).toString())
            }
        }
 
        var  btnS : ImageButton
        btnS = findViewById(R.id.suma)
 
        btnS.setOnClickListener(){
//          btnS.setImageResource(R.drawable.sumaa)
            operate("+")
            Toast.makeText(this, "Suma ejecutada" , Toast.LENGTH_SHORT).show()
        }
 
        var  btnR : ImageButton
        btnR= findViewById(R.id.resta)
 
        btnR.setOnClickListener(){
//            btnR.setImageResource(R.drawable.restaa)
            operate("-")
            Toast.makeText(this, "Resta ejecutada" , Toast.LENGTH_SHORT).show()
        }
                var  btnM : ImageButton
        btnM = findViewById(R.id.multi)
 
        btnM.setOnClickListener(){
//            btnM.setImageResource(R.drawable.multia)
            operate("*")
            Toast.makeText(this, "Multiplicacion ejecutada" , Toast.LENGTH_SHORT).show()
        }
                var  btnD : ImageButton
        btnD = findViewById(R.id.divi)
 
        btnD.setOnClickListener(){
//            btnD.setImageResource(R.drawable.divia)
            operate("/")
            Toast.makeText(this, "Division ejecutada" , Toast.LENGTH_SHORT).show()
        }
    }
}
