
import java.util.List;
import java.util.Iterator;
//execute meethodunu, command design pattern ile �al��an fonksiyonlar kullan�ld���nda �a��ran s�n�f
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
        //Iterator Design Pattern kullan�larak dola��l�yor
        Iterator<ICommand> ite = commandIList.iterator(); 
        while(ite.hasNext()){
            ICommand item = ite.next();
            item.execute();
        }
    }
}
