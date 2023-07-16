/**
 * Creat a knight of Subject 
 */
public class Watchman implements Subject{
    private Observer[] observers;
    private int length;
    public Watchman(){
        super();
        observers = new Observer[3];
        length = 0;
    }
/**
 * Add an observer item to the end of the list.
 */
    @Override
    public void registerObserver(Observer observer) {
        observers[length] = observer;   
        length++;
    }
/**
 * Find the observer in the list with the same parameters as the incoming parameter.
 */
    @Override
    public void removeObserver(Observer observer) {
        int i = 0;
        for (i = 0;i<length;i++){
            if(observer.equals(observers[i])){  
                break;
            }
        }

        /**
         * Move all of its subsequent observers forward.
         */
        while(i<length-1){
            observers[i] = observers[i+1];
            i++;
        }
        length--;   /**The length of the list is minus one.*/
    }
/**
 * Create a function to notify for observers
 * Output Knight's response to different warnings
 */
    @Override
    public void notifyObservers() {
        System.out.println("A Happy Little City");
        for(int j = 1;j<3;j++) {
            System.out.println("\n-----------------------\n");
            if(j == 1)
                System.out.println("WARNING:  1 trumpet was played!");
            if(j == 2)
                System.out.println("WARNING:  2 trumpets were played!");
            for (int i = 0; i < length; i++) {
                observers[i].update(j);
            }
        }
    }

    public void issueWarning(int i) {
    }
}
