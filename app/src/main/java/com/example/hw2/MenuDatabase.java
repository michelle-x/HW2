package com.example.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {
    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }


    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }


    //Input data for menu and food detailed info
    private static final HashMap<Integer, Food> foods = new HashMap<>();

    static {
        foods.put(1, new Food(
                1,
                "Double Cheeseburger",
                "$9.00",
                "Double cheeseburger with pickles, two beef patties, cheese, lettuce and tomato.",
                R.drawable.image1
        ));
        foods.put(2, new Food(
                2,
                "Chicken Burger",
                "$6.00",
                "Fried chicken fillet burger with lettuce and mayo.",
                R.drawable.image2
        ));

        foods.put(3, new Food(
                3,
                "Chicken Cheeseburger",
                "$8.00",
                "Fried chicken fillet burger with cheese.",
                R.drawable.image3
        ));

        foods.put(4, new Food(
                4,
                "Double Burger",
                "$9.50",
                "Double burger with two beef patties, cheese, lettuce and our special sauce.",
                R.drawable.image4
        ));

        foods.put(5, new Food(
                5,
                "Classic Cheeseburger",
                "$6.00",
                "Classic cheeseburger with a beef patty, cheese, lettuce, pickles and tomato.",
                R.drawable.image5
        ));

        foods.put(6, new Food(
                 6,
                 "Fish Burger",
                 "$6.00",
                "Fried fish fillet burger with cheese and our special tartare sauce.",
                R.drawable.image6
        ));

        foods.put(7, new Food(
                7,
                "Fried Chicken",
                "$9.00",
                "7 fried chicken pieces.",
                R.drawable.image7
        ));

        foods.put(8, new Food(
                8,
                "Chicken Nuggets",
                "$6.00",
                "8 chicken nuggets.",
                R.drawable.image8
        ));

        foods.put(9, new Food(
                9,
                "Beef Taco",
                "$3.00",
                "Beef taco with lettuce and salsa.",
                R.drawable.image9
        ));

        foods.put(10, new Food(
                10,
                "Two Beef Tacos",
                "$5.00",
                "Two taco deal.",
                R.drawable.image10
        ));

        foods.put(11, new Food(
                11,
                "Chicken Strips",
                "$6.00",
                "Fried chicken tender strips.",
                R.drawable.image11
        ));

        foods.put(12, new Food(
                12,
                "Loaded Fries",
                "$7.00",
                "Loaded fries with our special sauce.",
                R.drawable.image12
        ));

        foods.put(13, new Food(
                13,
                "Chicken and Fries",
                "$11.00",
                "Chicken strips and fries meal deal.",
                R.drawable.image13
        ));

        foods.put(14, new Food(
                14,
                "Cookies",
                "$1.00",
                "Macadamia white choc-chip cookies.",
                R.drawable.image14
        ));

        foods.put(15, new Food(
                15,
                "Oreo Chocolate Shake",
                "$4.50",
                "Iced chocolate shake with oreos.",
                R.drawable.image15
        ));

        foods.put(16, new Food(
                16,
                "Frozen Coke",
                "$2.00",
                "Frozen coke slushy.",
                R.drawable.image16
        ));


        }

}

