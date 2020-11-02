
package observer;

import java.time.Clock;
import java.util.Observable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClockTimer extends Observable{
    int hour = 0, seconds = 0, minutes = 0;
    Clock kello;
    
    public int getHour(){
       return hour; 
    }
    public int getMinute(){
       return minutes; 
    }
    public int getSecond(){
       return seconds; 
    }
    public void tick(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
            seconds++;
            if(seconds == 61){
                minutes++;
                seconds = 0;
                if(minutes == 61){
                    minutes = 0;
                    hour++;
                    if(hour == 25){
                        hour = 0;
                    }
                }
            }
            
            setChanged();
            notifyObservers();  
    }
        }
    
}
