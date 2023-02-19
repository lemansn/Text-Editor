public class FactoryManager {
    //ICommandManager tipinde veri döndüren generate methodu
    public static ICommandManager generate(String commandMngType)
    {
        
        switch(commandMngType)
        {
        //If the commandMngType parameter is "CommandManager", 
        //the generate method returns an ICommandManager object through the AdapterManager class.  
            case "CommandManager":
                //If the commandMngType field is null, 
                //it is set to an instance of the CommandManager class through the getInstance method.
                AdapterManager.commandMng = AdapterManager.commandMng == null ? CommandManager.getInstance() : AdapterManager.commandMng;

                return AdapterManager.commandMng;
                
       //If the commandMngType parameter is something other than "CommandManager", 
       // the generate method also returns an ICommandManager object through the AdapterManager class.
            default:
                //If the commandMng field is not null, it is returned as is.
                //This ensures that only one instance of the CommandManager class is created and returned.
                AdapterManager.commandMng = AdapterManager.commandMng == null ? CommandManager.getInstance() : AdapterManager.commandMng;

                return AdapterManager.commandMng;
        }
    }
}
