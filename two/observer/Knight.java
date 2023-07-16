package observer;

public class Knight implements Observer {
        private int warning;
        private Subject watchman;

    public Knight(Subject watchman) {
            this.watchman = watchman;
            watchman.registerObserver(this);
    }

    public void update(int warning) {
            this.warning = warning;
            display();
    }
    
    public void display() {
            System.out.print("Knight: ");

            if (warning == 1) {
                System.out.print("Helps everyone get home safe\n");
            }
            if (warning == 2) {
                System.out.print("Prepares for battle\n");
            }
    }
}
