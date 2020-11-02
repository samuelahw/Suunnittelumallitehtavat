
package observer;

public class main {
    public static void main(String[] args) {
        ClockTimer ct = new ClockTimer();
        DigitalClock clock = new DigitalClock(ct);
        ct.addObserver(clock);
        ct.tick();
    }
}
