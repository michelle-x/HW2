package com.example.hw2;

public class Food {

    // Food item unique identifier
    private int foodID;
    // Food item title
    private String title;
    // Price of the menu item
    private String price;
    // Food detail
    private String detail;
    // Resource ID of associated image 
    private int imageDrawableId;


    public Food(int foodID, String title, String price, String detail, int imageDrawableId) {
        this.foodID = foodID;
        this.title = title;
        this.price = price;
        this.detail = detail;
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodID() {

        return foodID;
    }

    public void setFoodID(int FoodID) {

        this.foodID = foodID;
    }


    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public String getDetail(){

        return detail;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public int getImageDrawableId() {

        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {

        this.imageDrawableId = imageDrawableId;
    }
}
