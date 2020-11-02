package com.mygdx.game.classes

import android.annotation.SuppressLint

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.mygdx.game.R
import kotlinx.android.synthetic.main.score_item.view.*

class MyAdapter(private val myDataset: ArrayList<Score>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        val numberTextView = itemView.score_number
        val valueTextView = itemView.score_value
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val scoreItem = LayoutInflater.from(parent.context).inflate(R.layout.score_item, parent, false)
        return MyViewHolder(scoreItem)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = myDataset[position]

        holder.numberTextView.text = "$position."
        holder.valueTextView.text = currentItem.scoreValue
    }

    override fun getItemCount() = myDataset.size

}