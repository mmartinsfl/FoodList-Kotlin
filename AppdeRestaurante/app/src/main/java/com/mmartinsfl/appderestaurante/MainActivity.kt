package com.mmartinsfl.appderestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.mmartinsfl.appderestaurante.adapter.FoodAdapter
import com.mmartinsfl.appderestaurante.databinding.ActivityMainBinding
import com.mmartinsfl.appderestaurante.model.Food

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<Food> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFood = binding.RecyclerViewFood
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FoodAdapter(this, foodList)
        recyclerViewFood.adapter = foodAdapter
        getFood()
    }

    private fun getFood(){

        val food1 = Food(
            imgFood = R.drawable.food1,
            foodName = "Food 1",
            foodDescription = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tinicidunt ut",
            price = "$ 120.00"
        )
        foodList.add(food1)
        val food2 = Food(
            imgFood = R.drawable.food2,
            foodName = "Food 2",
            foodDescription = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tinicidunt ut",
            price = "$ 80.00"
        )
        foodList.add(food2)
        val food3 = Food(
            imgFood = R.drawable.food3,
            foodName = "Food 3",
            foodDescription = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tinicidunt ut",
            price = "$ 45.00"
        )
        foodList.add(food3)
        val food4 = Food(
            imgFood = R.drawable.food4,
            foodName = "Food 4",
            foodDescription = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tinicidunt ut",
            price = "$ 50.00"
        )
        foodList.add(food4)
    }
}