
import java.util.HashMap;
public class InputHandler{
    private HashMap<String, Command> commands = new HashMap<String,Command>();
    private StopWatch watch;

    public InputHandler(StopWatch watch){
        this.watch = watch;
        OneMinCommand omc = new OneMinCommand(watch);
        commands.put("1", omc);
        FiveMinCommand fmc = new FiveMinCommand(watch);
        commands.put("5", fmc);
        ThirtySecCommand tsc = new ThirtySecCommand(watch);
        commands.put("30", tsc);
    }

    public boolean inputEntered(String data){
        if(commands.containsKey(data)){
            commands.get(data).execute();
            return true;
        }
        return false;
    }
}
