package ge.shualeduri.projectguram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class meoregverdi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meoregverdi)

        val dasabechdi = intent.getStringExtra("monacemi")//avigebt im sityvas romelic unda  davbechdot
        findViewById<TextView>(R.id.dasabechdi).apply{
            text = dasabechdi.toString()
        }
        val button = findViewById<View>(R.id.dasabrunebelibutton) as Button
        //handle onClick
        button.setOnClickListener {
            //intent to start NewActivity
            startActivity(Intent(this@meoregverdi, MainActivity::class.java))
        }
    }

}
