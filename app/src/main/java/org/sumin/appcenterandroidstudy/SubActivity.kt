package org.sumin.appcenterandroidstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import org.sumin.appcenterandroidstudy.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }  //뷰 바인딩

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data:MutableList<Memo> = loadData()
        var adapter = ChattingAdapter()
        adapter.listData = data
        binding.recyclerView.adapter = adapter

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val idText = intent.getStringExtra("id")
        binding.textViewSub.text = idText
    }
    fun loadData(): MutableList<Memo>{
        val data: MutableList<Memo> = mutableListOf()
        for(no in 1..20){
            val title = "내이름은 코난 탐정이죠"
            var memo = Memo(no,title)
            data.add(memo)
        }
        return data
    }
}