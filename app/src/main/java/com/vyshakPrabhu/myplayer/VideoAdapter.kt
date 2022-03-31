package com.vyshakPrabhu.myplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vyshakPrabhu.myplayer.databinding.VideoViewBinding

class VideoAdapter(private val context: Context , private var videoList : ArrayList<String>) :
    RecyclerView.Adapter<VideoAdapter.MyHolder>() {
    class MyHolder (binding: VideoViewBinding): RecyclerView.ViewHolder(binding.root){
        val title = binding.videoName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoAdapter.MyHolder {
        return MyHolder(VideoViewBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: VideoAdapter.MyHolder, position: Int) {
        holder.title.text = videoList(position)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}