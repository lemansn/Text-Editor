import java.util.List;

//ICommandManager ve ICommand interfacelerinin adapte edilmesi.
public class AdapterManager implements ICommandManager{
    
    //ICommandManager tipinde variable
    static ICommandManager commandMng;


    public static ICommandManager getInstance(String commandMngType)
    {
        return FactoryManager.generate(commandMngType);
    }

    //commandList parametreli execute methodu
    @Override
    public void execute(List<ICommand> commandIList) {
        AdapterManager.commandMng.execute(commandIList);
    }
}
