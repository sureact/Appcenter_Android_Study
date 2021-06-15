package org.sumin.appcenterandroidstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sumin.appcenterandroidstudy.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }  //뷰 바인딩

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val idText = intent.getStringExtra("id")
        binding.textViewSub.text = idText
    }
}