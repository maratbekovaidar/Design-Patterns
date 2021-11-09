package kz.maratbekovaidar;

import kz.maratbekovaidar.foods.Beshbarmak;
import kz.maratbekovaidar.foods.Burger;
import kz.maratbekovaidar.foods.Pilaf;
import kz.maratbekovaidar.foods.Steak;
import kz.maratbekovaidar.meets.BeefMeat;
import kz.maratbekovaidar.meets.ChickenMeat;
import kz.maratbekovaidar.meets.HorseMeat;
import kz.maratbekovaidar.meets.PorkMeat;

public class Main {
    public static void main(String[] args) {

        /** BEFORE

         Dish[] products = {
         new Burger(new ChickenMeat()),
         new Pilaf(new BeefMeat()),
         new Beshbarmak(new HorseMeat()),
         new Steak(new PorkMeat())
         };
         for (Dish product : products) {
         product.getProduct();
         }*/


        /** AFTER */
//        DishFacade dishFacade = new DishFacade();
//        dishFacade.addDish(new Burger(new ChickenMeat()));
//        dishFacade.addDish(new Pilaf(new BeefMeat()));
//        dishFacade.addDish(new Beshbarmak(new HorseMeat()));
//        dishFacade.addDish(new Steak(new PorkMeat()));
//
//        dishFacade.getAllDishes();


        // Second version

        DishFacade2 dishFacade2 = new DishFacade2();

        // To get menu
        dishFacade2.getMenu();

        // Adding dishes
        dishFacade2.addDish("Burger", "ChickenMeet");
        dishFacade2.addDish("Pilaf", "BeefMeet");
        dishFacade2.addDish("Beshbarmak", "HorseMeet");
        dishFacade2.addDish("Steak", "PorkMeet");

        // Get all dishes
        dishFacade2.getAllDishes();

    }
}
