package kz.maratbekovaidar;

public abstract class Program {
    Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void develop();
}
