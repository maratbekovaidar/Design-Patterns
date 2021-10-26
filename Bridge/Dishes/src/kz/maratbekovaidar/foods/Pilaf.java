/**
 * @author Aidar Maratbekov SE-2004
 * GitHub: github.com/maratbekovaidar
 */

package kz.maratbekovaidar.foods;

import kz.maratbekovaidar.Meat;
import kz.maratbekovaidar.Dish;

public class Pilaf extends Dish {
    public Pilaf(Meat meat) {
        super(meat);
    }

    @Override
    public void getProduct() {
        // Pilaf это если что плов, сам только что узнал
        System.out.print("Pilaf ");
        meat.getMeat();
    }
}
