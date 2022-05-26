package com.furkanbostan.buildinginfo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.furkanbostan.buildinginfo.databinding.RecylclerRowBinding

class LandMarkAdapter(val landmarklist : ArrayList<LandMark>) : RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {
    class LandMarkHolder(val binding: RecylclerRowBinding ): RecyclerView.ViewHolder(binding.root){

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        val binding = RecylclerRowBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.recyclerRowText.text= landmarklist.get(position).name
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailsAcitivity::class.java)
            intent.putExtra("landmark",landmarklist.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landmarklist.size
    }

}