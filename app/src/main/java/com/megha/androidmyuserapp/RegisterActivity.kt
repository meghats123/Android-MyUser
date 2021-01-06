package com.megha.androidmyuserapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun mynewclick(view: View) {
        var getName=findViewById<EditText>(R.id.name);
        var getPlace=findViewById<EditText>(R.id.place);
        var getPhone=findViewById<EditText>(R.id.phone);
        var getEmailId=findViewById<EditText>(R.id.emailid);
        var getPass=findViewById<EditText>(R.id.password);
        var getConfirmPass=findViewById<EditText>(R.id.confirmpass);
        Toast.makeText(this,getName.text.toString() + " " + getPlace.text.toString() + " " + getPhone.text.toString() + " " + getEmailId.text.toString() + " " + getPass.text.toString() + " " + getConfirmPass.text.toString(),Toast.LENGTH_LONG).show();

    }

    fun myclick(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}