package com.androiddeveloper3005.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.androiddeveloper3005.myapplication.R
import com.androiddeveloper3005.myapplication.models.Test
import com.androiddeveloper3005.myapplication.showToast
import kotlinx.android.synthetic.main.item_view.view.*

class Adapter(val context : Context ,val list : List<Test>) : RecyclerView.Adapter<Adapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View  = LayoutInflater.from(context).inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listofData = list[position]
        holder.setData(listofData,position)

    }

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var currentItem : Test? = null
        var currentPositin : Int = 0
        init {
            itemView.setOnClickListener{
                currentItem?.let {
                    context.showToast("Clicked in : " + currentItem!!.name ,Toast.LENGTH_LONG)//extension function


                }
            }
        }
        fun setData(test: Test?, pos : Int){
            test?.let {
                itemView.textView.text = test.name
                itemView.imageView.setImageResource(test.image)
            }
            this.currentItem = test
            this.currentPositin = pos
        }



    }
}