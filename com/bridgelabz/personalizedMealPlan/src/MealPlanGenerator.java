package com.bridgelabz.personalizedMealPlan.src;

import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealName();
}

// Specific meal plan types
class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "Vegetarian Meal: " + mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "Vegan Meal: " + mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "Keto Meal: " + mealName;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "High-Protein Meal: " + mealName;
    }
}

// Generic Meal class

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }
}

// Utility class to generate and validate meal plans
class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(Meal<T> mealPlan) {
        System.out.println("Generated Meal Plan:");
        for (MealPlan meal : mealPlan.getMeals()) {
            System.out.println(meal);
        }
    }
}
