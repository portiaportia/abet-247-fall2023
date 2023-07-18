
public class ThirtySecCommand implements Command{
    private StopWatch watch;
    public ThirtySecCommand(StopWatch watch){
        this.watch = watch;
    }

    public void execute(){
        this.watch.countDownThirtySec();
    }
}
