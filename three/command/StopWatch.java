//package command;
//import java.util.concurrent.TimeUnit;
//
//public class StopWatch {
//  int minutes, seconds;
//    /*
//    * creates a new instance of a stopwatch at 0 minutes and seconds
//    */
//    public StopWatch() {
//      minutes = 0;
//      seconds = 0;
//    }
//
//    /* void method that creates the oneMinuteCountDown using the
//    * a new instance of the Hashmap
//    */ @return void
//    public void countDownOneMin() {
//      minutes = 1;
//      seconds = 0;
//      countDown();
//    }
//
//    /* void method that creates the FiveMinuteCountDown using the
//    * a new instance of the Hashmap
//    */ @return void
//    public void countDownFiveMin() {
//      minutes = 5;
//      seconds = 0;
//      countDown();
//    }
//
//    /* void method that creates the 30SecondCountDown using the
//    * a new instance of the Hashmap
//    */ @return void
//    public void countDownThirtySec() {
//      minutes = 0;
//      seconds = 30;
//      countDown();
//    }
///* void method the makes the countdown time go down and displays it on the console
//* until it hits 0.
//* Uses try-catch to stop interruptions from sleeping threads
//*/ @return void
//    public void countDown(){
//      try {
//        while(minutes > 0 || seconds > 0){
//          System.out.print("\033[H\033[2J");
//          System.out.flush();
//          System.out.printf("%02d:%02d%n", minutes, seconds);
//          TimeUnit.MILLISECONDS.sleep(100);
//
//          if(seconds == 0){
//            if(minutes == 0){
//              break;
//            }
//            seconds == 59;
//            minutes--;
//          }
//          else {
//            seconds--;
//          }
//        }
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//        System.out.printf("%02d:%02d%n", minutes, seconds);
//catch(InterruptedException e){
//  Thread.currentThread().interrupt();
//    }
//  }
// }
//}
////package command;
////
////public class StopWatch {
////    /*
////    * creates a new instance of the Hashmap to create the stop watch
////    */
////    public StopWatch() {
////        commands = new HashMap<>();
////    }
////
////    /* void method that creates the oneMinuteCountDown using the
////    * a new instance of the Hashmap
////    */ @return void
////    public void countDownOneMin() {
////      commands.put("1", new OneMinCommand());
////    }
////
////    /* void method that creates the FiveMinuteCountDown using the
////    * a new instance of the Hashmap
////    */ @return void
////    public void countDownFiveMin() {
////      commands.put("5", new FiveMinCommand());
////    }
////
////    /* void method that creates the 30SecondCountDown using the
////    * a new instance of the Hashmap
////    */ @return void
////    public void countDownThirtySec() {
////      commands.put("30", new OneMinCommand());
////    }
////
////}
