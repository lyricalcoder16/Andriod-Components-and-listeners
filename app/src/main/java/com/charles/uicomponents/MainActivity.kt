package com.charles.uicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myImage: ImageView = findViewById(R.id.imghat)
        val checkFootball: CheckBox = findViewById(R.id.checkBoxFootball)
        val checkRugby: CheckBox = findViewById(R.id.checkBoxRugby)
        val switchoff: ToggleButton = findViewById(R.id.Off)
        val switchDisplayMode: Switch = findViewById(R.id.SwitchDarkmode)
        val groupGender : RadioGroup  = findViewById(R.id.groupGender)
        var original = true
        myImage.setOnClickListener {
            if (original) {
                myImage.setImageResource(R.drawable.analytics)
                original = false
            } else {
                myImage.setImageResource(R.drawable.kimmiecla)
            }
        }
        checkFootball.setOnCheckedChangeListener { checkbox, ischecked ->
            if (ischecked) {
                Toast.makeText(this, "Football checked", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Football not selected", Toast.LENGTH_SHORT).show()
            }
        }
        switchoff.setOnCheckedChangeListener{_, isTurnedOn ->
            if(isTurnedOn){
                Toast.makeText(this, "We are onn!!!!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "We are off", Toast.LENGTH_SHORT).show()
            }
        }
        switchDisplayMode.setOnCheckedChangeListener { compoundButton, ischecked ->
            if (ischecked){
                Toast.makeText(this, "Dark mode is on", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Dark mode is off", Toast.LENGTH_SHORT).show()
            }

        }
        groupGender.setOnCheckedChangeListener { _, id ->
            if (id == R.id.radioButtonFemale){
                Toast.makeText(this,"You are female",Toast.LENGTH_SHORT).show()
            }else if(id == R.id.radioButtonMale){
                Toast.makeText(this,"You are male",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"You are transgender",Toast.LENGTH_SHORT).show()
            }
        }
    }
}