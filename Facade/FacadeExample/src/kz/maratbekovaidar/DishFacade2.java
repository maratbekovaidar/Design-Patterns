package kz.maratbekovaidar;

import kz.maratbekovaidar.foods.Beshbarmak;
import kz.maratbekovaidar.foods.Burger;
import kz.maratbekovaidar.foods.Pilaf;
import kz.maratbekovaidar.foods.Steak;
import kz.maratbekovaidar.meets.*;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class DishFacade2 {
    List<Dish> dishes = new ArrayList<>();

    private Dish validateDish(String dishName, Meat meat) {
        switch (dishName) {
            case "Beshbarmak":
                return new Beshbarmak(meat);
            case "Burger":
                return new Burger(meat);
            case "Pilaf":
                return new Pilaf(meat);
            case "Steak":
                return new Steak(meat);
            default:
                System.out.println("This dish haven't in menu.");
                return null;
        }
    }

    private Meat validateMeet(String meetName) {
        switch (meetName) {
            case "BeefMeet":
                return new BeefMeat();
            case "ChickenMeet":
                return new ChickenMeat();
            case "FishMeet":
                return new FishMeat();
            case "HorseMeet":
                return new HorseMeat();
            case "PorkMeet":
                return new PorkMeat();
            default:
                System.out.println("That meet haven't in menu.");
                return null;
        }
    }

    public void addDish(String dishName, String meetName) {
        dishes.add(validateDish(dishName, validateMeet(meetName)));
    }

    public void getMenu() {
        System.out.println("======-Menu-======");
        System.out.println();
        System.out.println("=====-Dishes-=====");
        System.out.println("-=- Beshbarmak");
        System.out.println("-=- Burger");
        System.out.println("-=- Pilaf");
        System.out.println("-=- Steak");
        System.out.println();
        System.out.println("=====-Meets-======");
        System.out.println("-=- BeefMeet");
        System.out.println("-=- ChickenMeet");
        System.out.println("-=- FishMeet");
        System.out.println("-=- HorseMeet");
        System.out.println("-=- PorkMeet");
        System.out.println("=======-END-======");
        System.out.println();

    }

    public void getAllDishes() {
        for (Dish dish: dishes) {
            dish.getProduct();
        }
    }
}
