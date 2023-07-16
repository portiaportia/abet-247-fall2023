package observer;

public class Teacher implements Observer {
            private int warning;
            private Subject watchman;

    public Teacher(Subject watchman) {
            this.watchman = watchman;
            watchman.registerObserver(this);
    }
    
    public void update(int warning) {
            this.warning = warning;
            display();
    }

    public void display() {
            System.out.print("Teacher: ");

            if (warning == 1) {
                System.out.print("Helps get every kid home safe\n");
            }
            if (warning == 2) {
                System.out.print("Brings all students to the underground shelter\n");
            }
    }
}