//Undo fonksiyonunun Command Design Pattern ile gerçekleştirilmesi
public class Undo implements ICommand {

    private static TextEditor textEditorListener;

    public Undo(TextEditor textEditorListener)
    {
        Undo.textEditorListener = Undo.textEditorListener == null ? textEditorListener : Undo.textEditorListener;
    }
    @Override
    public void execute() {//Undo eyleminin gerçekleştirilmesi

//retrieves the value of the checkpoint field of the textEditorListener object subtracts 2 

        int changeCheckPoint = Undo.textEditorListener.getCheckpoint() - 2;

//and sets it as the changeCheckPoint variable.
        Undo.textEditorListener.setCheckpoint(changeCheckPoint);


    }

}
