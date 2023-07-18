

public class OneMinCommand implements Command{
    private StopWatch watch;
    public OneMinCommand(StopWatch watch){
        this.watch = watch;
    }

    public void execute(){
        this.watch.countDownOneMin();
    }
}
