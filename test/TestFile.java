import org.junit.Test;

//Beklenen ��kt� ile Ger�ekle�en ��kt�n�n ayn� olup olmad���n� kontrol eden s�n�f
public class TestFile {

    @Test
    public void testSingleton() {
        //2 commandManager nesnesinin ayn� olup olmad���n� kontrol eder,
        //bu nesneleri assertSame methoduna parametre olarak g�nderir.
        CommandManager m1 = CommandManager.getInstance();
        CommandManager m2 = CommandManager.getInstance();
        assertSame(m1, m2);

    }
//2 object tipinde nesnenin ayn� olup olmad���n� kontrol eder, ayn�ysa SUCCESSFUL yazd�r�r.
    private static void assertSame(Object expected, Object actual) {
        if (expected != actual) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
        System.out.println("SUCCESSFUL");
    }
}
