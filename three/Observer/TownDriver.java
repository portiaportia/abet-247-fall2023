/** 
 * Create a TownDriver class
*/
public class TownDriver {
/**
 * Create a function to be the main entry point into the program
*/
	public static void main(String[] args){
        Watchman watchman = new Watchman();
        Observer[] observer = new Observer[3];
        observer[0] = new ShopOwner();
        observer[1] = new Teacher();
        observer[2] = new Knight();
        int i = 0;

        /**Add observers to the list.*/
        for(i = 0;i<3;i++){
            watchman.registerObserver(observer[i]);
        }

        watchman.notifyObservers();     /**"watchman" warns.*/

        /**Remove the observer.*/
        for(Observer o:observer){
            watchman.removeObserver(o);
        }
    }
}
