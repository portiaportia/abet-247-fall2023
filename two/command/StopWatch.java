

import java.util.concurrent.TimeUnit;
public class StopWatch {
    
    public StopWatch(){
    }

    public void countDownOneMin(){
        countDown(60);
    } 
    
    public void countDownFiveMin(){
        countDown(300);
    }

    public void countDownThirtySec(){
        countDown(30);
    }

    private String secondstoString(int time){
        int minutes = time/60;
        int seconds = time -(minutes*60);
        if(seconds>9) 
            return ""+minutes+":"+seconds;
        else
            return ""+minutes+":0"+seconds;
    }

    private void countDown(int time){
        while(time>=0){
            System.out.println(secondstoString(time));
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (Exception e) {
                System.out.println("Error with try catch");
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            time--;
        }
    }
}
