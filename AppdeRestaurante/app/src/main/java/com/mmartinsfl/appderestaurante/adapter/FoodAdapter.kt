package com.mmartinsfl.appderestaurante.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmartinsfl.appderestaurante.databinding.ActivityMainBinding
import com.mmartinsfl.appderestaurante.databinding.FoodItemBinding
import com.mmartinsfl.appderestaurante.model.Food

class FoodAdapter(private val context: Context, private val foodList: MutableList<Food>):
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val listItem = FoodItemBinding.inflate(LayoutInflater.from(context),parent, false)
        return FoodViewHolder(listItem)
    }

    override fun getItemCount() = foodList.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.imgFood.setBackgroundResource(foodList[position].imgFood!!)
        holder.txtFoodName.text = foodList[position].foodName
        holder.txtFoodDescription.text = foodList[position].foodDescription
        holder.txtPrice.text = foodList[position].price
    }

    inner class FoodViewHolder(binding: FoodItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imgFood = binding.imgFood
        val txtFoodName = binding.txtFoodName
        val txtFoodDescription = binding.txtFoodDescription
        val txtPrice = binding.txtPrice


    }

}