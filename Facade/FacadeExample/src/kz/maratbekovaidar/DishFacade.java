package kz.maratbekovaidar;

import java.util.ArrayList;
import java.util.List;

public class DishFacade {
    List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    // get all dishes
    public void getAllDishes() {
        for (Dish product : dishes) {
            product.getProduct();
        }
    }
}
