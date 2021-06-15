package org.sumin.appcenterandroidstudy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sumin.appcenterandroidstudy.databinding.ItemRecyclerviewBinding

internal class ChattingAdapter: RecyclerView.Adapter<Holder>(){
    var listData = mutableListOf<Memo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}
internal class Holder(val binding: ItemRecyclerviewBinding): RecyclerView.ViewHolder(binding.root){
    fun setMemo(memo: Memo){
        binding.textNo.text = "${memo.no}"
        binding.tvMessage.text = memo.title
    }
}