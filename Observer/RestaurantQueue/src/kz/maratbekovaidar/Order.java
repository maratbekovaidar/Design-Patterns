package kz.maratbekovaidar;

import java.util.List;

public class Order implements Observer {
    String order_name;

    public Order() {

    }

//    CleanCode книга по правильному именовании

    public Order(String order_name) {
        this.order_name = order_name;
    }

    @Override
    public void next(List<Observer> order_list, Observer order) {
        System.out.println(order_name + ", ваша позиция в очереди " + order_list.indexOf(order) + "!");
    }
}
