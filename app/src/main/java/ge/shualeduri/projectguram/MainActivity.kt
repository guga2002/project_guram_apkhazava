package ge.shualeduri.projectguram

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.teqsti)// mivigebt im teqst rac userma chawera

        val buttoni = findViewById<View>(R.id.meoregverdzegadasvla) as Button
        //onclickze gansazgvra
        buttoni.setOnClickListener {
            //buttonis funqciis gansazgvra
            val meore = Intent(this, meoregverdi::class.java).apply {
                putExtra("monacemi", "")//amshemtxvevashi gadavcet carieli stringi
            }
            startActivity(meore)
        }

    }

    fun onButtonClicked(view: View) {
        val meore = Intent(this, meoregverdi::class.java).apply {
            putExtra(
                "monacemi",
                editText.text.toString()
            )//meore activityshi mivwvdebit  shesabamisi saxelit
        }

        startActivity(meore)//winadadebis gadawodeba
        startActivity(
            Intent(this@MainActivity,meoregverdi::class.java)
        )//meore gverdze gadasvla dazgvevis miznit tu intent ma arimushava
    }





}