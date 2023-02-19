
import java.util.List;
import java.util.Iterator;
//execute meethodunu, command design pattern ile çalýþan fonksiyonlar kullanýldýðýnda çaðýran sýnýf
public class CommandManager implements ICommandManager { //ICommandManager interface'ini implemente ediyor

    private static CommandManager cmInstance = null; //CommandManager tipinde variable

    static CommandManager getInstance()
    {
        CommandManager.cmInstance = CommandManager.cmInstance == null ? new CommandManager() : CommandManager.cmInstance;

        return CommandManager.cmInstance;
    }
    //commandList parametreli execute methodu
    public void execute(List<ICommand> commandIList)
    {
        //Iterator Design Pattern kullanýlarak dolaþýlýyor
        Iterator<ICommand> ite = commandIList.iterator(); 
        while(ite.hasNext()){
            ICommand item = ite.next();
            item.execute();
        }
    }
}
