
package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

    private ClockTimer timer;
    
    public DigitalClock(ClockTimer ct){
        timer = ct;
    }
    
    private void draw(){
        int hour = timer.getHour();
        int minutes = timer.getMinute();
        int seconds = timer.getSecond();
        System.out.println(hour+"."+minutes+"."+seconds);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        draw();
    }
    
}
