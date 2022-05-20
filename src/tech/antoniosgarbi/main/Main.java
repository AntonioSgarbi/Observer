package tech.antoniosgarbi.main;

import tech.antoniosgarbi.BynaryObserver;
import tech.antoniosgarbi.HexaObserver;
import tech.antoniosgarbi.OctalObserver;
import tech.antoniosgarbi.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BynaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
