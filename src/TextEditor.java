
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;


public class TextEditor implements DocumentListener {
//gerekli Listler ve variablelar yarat�l�r
    private static final ArrayList<String> changeHistory = new ArrayList<String>();
    private static final ArrayList<String> listPunctuation = new ArrayList<String>();
    private final JLabel jCharCountLabel;
    private final JLabel jWordCountLabel;
    private static Integer checkPoint = 0;
    private static Boolean changeCheckPoint = false;
    public static Boolean checkThread = false;

//parametreli constructor methodu
    public TextEditor(JLabel jCharCountLabel,JLabel jWordCountLabel) {

        this.jCharCountLabel = jCharCountLabel;
        this.jWordCountLabel = jWordCountLabel;
        //noktalama i�aretleri
        TextEditor.listPunctuation.add(" ");
        TextEditor.listPunctuation.add(".");
        TextEditor.listPunctuation.add(",");
        TextEditor.listPunctuation.add("!");
        TextEditor.listPunctuation.add(":");
        TextEditor.listPunctuation.add(";");
        TextEditor.listPunctuation.add("?");
        TextEditor.listPunctuation.add("\t");
        TextEditor.listPunctuation.add("\n");

    }

    @Override
    //Textteki de�i�im durumu sa�lan�r
    public void insertUpdate(DocumentEvent e) {
        this.saveHistory(e);
        this.storeWord(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        this.saveHistory(e);
        this.storeWord(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        this.saveHistory(e);
        this.storeWord(e);

    }
 //Undo i�lemi, yap�lan bir eylemi geri almay� sa�layan methodlar
    public void undoHistory(Integer operation) {
        TextEditor.checkPoint -= operation;
    }
//Redo i�lemi,�nceden yap�lan i�lemi geri almay� sa�layan methodlar
    public void redoHistory(Integer operation) {
        TextEditor.checkPoint += (TextEditor.checkPoint + operation) > TextEditor.changeHistory.size() ? TextEditor.changeHistory.size() : 0;
    }
//textte yap�lan t�m de�i�iklikleri tutan method
    public void saveHistory(DocumentEvent event) {
        if (TextEditor.changeCheckPoint) {

            TextEditor.changeCheckPoint = false;

            return;
        }


        Document documentEvent = event.getDocument();

        Integer documentTextLenght = documentEvent.getLength();

        String historyPoint;

        try {
            historyPoint = documentEvent.getText(0, documentTextLenght);

            if(TextEditor.checkPoint >= TextEditor.changeHistory.size())
                TextEditor.changeHistory.add(historyPoint);
            else
                TextEditor.changeHistory.set(TextEditor.checkPoint, historyPoint);

            TextEditor.checkPoint ++;

        } catch (BadLocationException exception) {
            Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, exception);
        }
    }

//metindeki kelime say�s�n� tutan method
    public void storeWord(DocumentEvent event) {
        Document document = (Document)event.getDocument();
        Integer changeTLength = document.getLength();

        this.jCharCountLabel.setText(changeTLength.toString());
    }
    
    public static String goToCheckpoint() {
        TextEditor.changeCheckPoint = true;
        return (String)TextEditor.changeHistory.get(TextEditor.checkPoint);
    }
    
//Checkpoint i�in getter ve setter methodlar�
    public static void setCheckpoint(int checkpoint) {
        TextEditor.checkPoint = checkpoint;
    }

    public static int getCheckpoint()
    {
        return TextEditor.checkPoint;
    }
}
