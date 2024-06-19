package com.project.fooddb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food {
    @Id
    @Column(name = "식품코드")
    private String foodCode;

    @Column(name = "식품명", nullable = false)
    private String name;

    @Column(name = "에너지(kcal)")
    private int kcal;

    @Column(name = "탄수화물(g)")
    private float carbs;

    @Column(name = "단백질(g)")
    private float protein;

    @Column(name = "지방(g)")
    private float fat;

    @Column(name = "당류(g)")
    private float sugars;

    @Column(name = "나트륨(mg)")
    private float sodium;

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public float getCarbs() {
        return carbs;
    }

    public void setCarbs(float carbs) {
        this.carbs = carbs;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getSugars() {
        return sugars;
    }

    public void setSugars(float sugars) {
        this.sugars = sugars;
    }

    public float getSodium() {
        return sodium;
    }

    public void setSodium(float sodium) {
        this.sodium = sodium;
    }
}

