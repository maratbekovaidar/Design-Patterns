package kz.maratbekovaidar;

public interface Observable {
    public void RegisterOrder(Observer order);
    public void UnregisterOrder(Observer order);
    public void NotifyOrders();
}
