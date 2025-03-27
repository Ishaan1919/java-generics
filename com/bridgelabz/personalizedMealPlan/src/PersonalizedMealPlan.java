package com.bridgelabz.personalizedMealPlan.src;

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>();
        vegetarianMealPlan.addMeal(new VegetarianMeal("Grilled Veggie Wrap"));
        vegetarianMealPlan.addMeal(new VegetarianMeal("Mushroom Risotto"));

        Meal<VeganMeal> veganMealPlan = new Meal<>();
        veganMealPlan.addMeal(new VeganMeal("Tofu Stir Fry"));
        veganMealPlan.addMeal(new VeganMeal("Vegan Burrito Bowl"));

        Meal<KetoMeal> ketoMealPlan = new Meal<>();
        ketoMealPlan.addMeal(new KetoMeal("Grilled Chicken with Avocado"));
        ketoMealPlan.addMeal(new KetoMeal("Cheese & Spinach Omelette"));

        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>();
        highProteinMealPlan.addMeal(new HighProteinMeal("Salmon & Quinoa Bowl"));
        highProteinMealPlan.addMeal(new HighProteinMeal("Egg & Turkey Scramble"));

        System.out.println("\nVegetarian Meal Plan:");
        MealPlanGenerator.generateMealPlan(vegetarianMealPlan);

        System.out.println("\nVegan Meal Plan:");
        MealPlanGenerator.generateMealPlan(veganMealPlan);

        System.out.println("\nKeto Meal Plan:");
        MealPlanGenerator.generateMealPlan(ketoMealPlan);

        System.out.println("\nHigh-Protein Meal Plan:");
        MealPlanGenerator.generateMealPlan(highProteinMealPlan);
    }
}
