package org.sumin.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import org.sumin.layoutpractice.databinding.ActivityPracticeBinding

class Practice : AppCompatActivity() {

    val binding = ActivityPracticeBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.editText.addTextChangedListener {
            Log.d("EditText", "현재 입력된 값=${it.toString()}")
        }
        setContentView(R.layout.activity_practice)
    }
}