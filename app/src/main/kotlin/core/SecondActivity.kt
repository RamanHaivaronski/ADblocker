package core

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.license_activity.*
import org.blokada.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.license_activity)
    }

    val THIEF = "License"

    fun onCheckLicense(view: View){

        val c = editText.text.toString()
        val myToastSuccess = Toast.makeText(this, "Activated", Toast.LENGTH_SHORT)
        val myToastFail = Toast.makeText(this, "sosat", Toast.LENGTH_SHORT)
        //val successIntent = Intent(this, MainActivity::class.java)
        val answerIntent = Intent(this, MainActivity::class.java)

        if (c == "true") {

            myToastSuccess.show()

            //startActivity(successIntent)
            //answerIntent.putExtra(MainActivity.LICENSE,"Activated")
            startActivity(answerIntent)
        }
        else {
            myToastFail.show()
            //answerIntent.putExtra(MainActivity.LICENSE,"Activation failed")
            //startActivity(answerIntent)

        }
        //finish()
    }
}
