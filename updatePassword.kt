package com.example.moodyeats

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class updatePassword:AppCompatActivity() {
    lateinit var currentPassword: TextView
    lateinit var newPassword:TextView
    lateinit var renewPassword:TextView
    lateinit var user:FirebaseUser
    lateinit var mAuth: FirebaseAuth
    lateinit var resetPasswordButton: Button
    lateinit var progressbar:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.updatepassword)
        currentPassword=findViewById(R.id.oldPasswordin)
        newPassword=findViewById(R.id.newpasswordin)
        renewPassword=findViewById(R.id.renewpasswordin)
        mAuth= FirebaseAuth.getInstance()
        user= FirebaseAuth.getInstance().currentUser!!
        resetPasswordButton=findViewById(R.id.editPasswordButton)
        progressbar=findViewById(R.id.progressBarupdate)

    resetPasswordButton.setOnClickListener()
    {

    }
}
}