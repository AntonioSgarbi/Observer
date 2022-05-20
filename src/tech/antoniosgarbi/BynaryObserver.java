package tech.antoniosgarbi;

public class BynaryObserver extends Observer {

    public BynaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toBinaryString(subject.getState()));
    }
}
