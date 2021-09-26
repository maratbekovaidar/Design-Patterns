package kz.maratbekovaidar;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Cafe implements Observable {

    private int max_seat;
    private int order_counts = 0;

    public Cafe() {

    }

    public Cafe(int max_seat) {
        this.max_seat = max_seat;
    }

    List<Observer> order_list = new ArrayList<>();


    @Override
    public void RegisterOrder(Observer order) {
        order_list.add(order);
        order_counts++;
        NotifyOrders();
    }

    @Override
    public void UnregisterOrder(Observer order) {
        order_list.remove(order);
        NotifyOrders();
    }

    @Override
    public void NotifyOrders() {
        for (Observer order: order_list) {
            order.next(order_list, order);
        }
        System.out.println("==================");
    }

    public int getOrder_counts() {
        return this.order_counts;
    }
}
