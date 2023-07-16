package observer;

import java.util.ArrayList;

public class Watchman implements Subject {
        private ArrayList<Observer> observers;
        private int warning;

        public Watchman() {
                observers = new ArrayList<Observer>();
        }

        public void registerObserver(Observer observer) {
                observers.add(observer);
        }

        public void removeObserver(Observer observer) {
                observers.remove(observer);
        }

        public void notifyObservers() {
                for(Observer observer : observers) {
                        observer.update(warning);
                }
        }

        public void issueWarning(int warning) {
                this.warning = warning;
                display();
                notifyObservers();
        }

        public void display() {
                if (warning == 1) {
                    System.out.print("WARNING: 1 trumpet was played!\n");
                }
                if (warning == 2) {
                    System.out.print("WARNING: 2 trumpets were played\n");
                }
        }
}