package tech.antoniosgarbi;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
