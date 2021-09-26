package kz.maratbekovaidar;

import java.util.List;

public interface Observer {
    public void next(List<Observer> order_list, Observer order);
}
