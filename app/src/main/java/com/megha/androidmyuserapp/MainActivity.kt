package com.megha.androidmyuserapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mybtnclick(view: View) {
        var getEmailid=findViewById<EditText>(R.id.email);
        var getPassword=findViewById<EditText>(R.id.pass);
        Toast.makeText(this,getEmailid.text.toString() + " " + getPassword.text.toString(),Toast.LENGTH_LONG).show();
    }

    fun mybuttonclick(view: View) {
        intent= Intent(this,RegisterActivity::class.java);
        startActivity(intent);
    }
}