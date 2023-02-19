//redo fonksiyonunu Command Design Pattern ile gerçekleþtiren sýnýf
public class Redo implements ICommand { //Icommand interface'ini implemente ediyor

    private static TextEditor textEditorListener;

    public Redo(TextEditor textEditorListener)
    {
        Redo.textEditorListener = Redo.textEditorListener == null ? textEditorListener : Redo.textEditorListener;
    }
    @Override
    public void execute() {//Redo eyleminin gerçekleþtirilmesi

//retrieves the value of the checkpoint field of the textEditorListener object 

        int changeCheckPoint = Redo.textEditorListener.getCheckpoint();

//and sets it as the changeCheckPoint variable.
        Redo.textEditorListener.setCheckpoint(changeCheckPoint);


    }
}