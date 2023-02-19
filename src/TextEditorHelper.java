import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextPane;

public class TextEditorHelper {

    static JTextPane jTextPane;

    public static void setTextJPane(JTextPane jTextPane){
        TextEditorHelper.jTextPane = jTextPane;
    }
    //dosya okumak için yazýlan method
    public static String openToFile(File file)
    {
        String textData = null;
        //gerekli hata kontrolleri için try-catch kullanýmý
        try {
            File textPath = new File(file.getAbsolutePath());
            Scanner myFileReader = new Scanner(textPath);
            while (myFileReader.hasNextLine()) {
                textData += myFileReader.nextLine();
                textData +="\n";

            }
            myFileReader.close();
            
        } catch (FileNotFoundException error) {
            System.out.println("An error occurred.");
            error.printStackTrace();
        }

        return textData;
    }
//dosyayý kaydetmek için gerekli olan methodlar
    public static boolean saveToFile(File tFile,String text)
    {
        //gerekli hata kontrolleri için try-catch kullanýmý
        try {
            if (tFile.createNewFile()) {
                FileWriter fileWriter = new FileWriter(tFile.getAbsoluteFile());
                fileWriter.write(text);
                fileWriter.close();
                return true;
            }
        } catch (IOException error) {
            System.out.println("An error occurred.");
            error.printStackTrace();
        }

        return false;
    }

}


