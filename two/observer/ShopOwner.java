package observer;

public class ShopOwner implements Observer {
        private int warning;
        private Subject watchman;

    public ShopOwner(Subject watchman) {
            this.watchman = watchman;
            watchman.registerObserver(this);
    }

    public void update(int warning) {
            this.warning = warning;
            display();
    }

    public void display() {
            System.out.print("Shop Owner: ");

            if (warning == 1) {
                System.out.print("Close down shop and head home\n");
            }
            if (warning == 2) {
                System.out.print("Drops everything and find nearest hideout\n");
            }
    }
}