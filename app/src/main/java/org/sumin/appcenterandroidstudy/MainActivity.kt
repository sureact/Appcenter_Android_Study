package org.sumin.appcenterandroidstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_login).setOnClickListener{
            val id = findViewById<EditText>(R.id.name).text.toString()
            val pw = findViewById<EditText>(R.id.password).text.toString()
            if(id.isEmpty() || pw.isEmpty()){
                Toast.makeText(this,"아이디 혹은 비밀번호를 입력하세요!",Toast.LENGTH_SHORT).show()
            }
            else if (id.isEmpty()){
                //심화과제부분
            }
            else if (pw.isEmpty()){
                //심화과제부분
            }
            else{
                findViewById<TextView>(R.id.error).visibility= View.VISIBLE
            }
        }
    }
}