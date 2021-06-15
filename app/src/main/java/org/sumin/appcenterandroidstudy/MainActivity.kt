package org.sumin.appcenterandroidstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.sumin.appcenterandroidstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val id = findViewById<EditText>(R.id.name).text.toString()
            val pw = findViewById<EditText>(R.id.password).text.toString()
            if(id.isEmpty() || pw.isEmpty()){
                Toast.makeText(this,"아이디 혹은 비밀번호를 입력하세요!",Toast.LENGTH_SHORT).show()
            }
            else{
                binding.error.visibility = View.VISIBLE
                val intent = Intent(this,SubActivity::class.java)
                val idText = binding.name.text.toString()
                intent.putExtra("id",idText)        //intent객체에 데이터를 저장
                startActivity(intent)       //서브엑티비티 실행
            }
        }
    }
}