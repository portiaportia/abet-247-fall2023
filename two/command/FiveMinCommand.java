
public class FiveMinCommand implements Command{
    private StopWatch watch;
    public FiveMinCommand(StopWatch watch){
        this.watch = watch;
    }

    public void execute(){
        this.watch.countDownFiveMin();
    }
}
