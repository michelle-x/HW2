package com.example.hw2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodInfoActivity extends AppCompatActivity {
    private TextView titleTextView;
    private TextView priceTextView;
    private TextView descriptionTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_info);

        Intent intent = getIntent();

        int foodID = intent.getIntExtra("FoodID", 0);

        Food food = MenuDatabase.getFoodById(foodID);

        titleTextView = findViewById(R.id.title);
        priceTextView = findViewById(R.id.price);
        descriptionTextView = findViewById(R.id.desc);
        imageView = findViewById(R.id.itemPhoto);

        // Set views to show data
        titleTextView.setText(food.getTitle());
        priceTextView.setText(food.getPrice());
        descriptionTextView.setText(food.getDetail());
        imageView.setImageResource(food.getImageDrawableId());
    }


}
