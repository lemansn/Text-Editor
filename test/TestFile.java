import org.junit.Test;

//Beklenen çýktý ile Gerçekleþen çýktýnýn ayný olup olmadýðýný kontrol eden sýnýf
public class TestFile {

    @Test
    public void testSingleton() {
        //2 commandManager nesnesinin ayný olup olmadýðýný kontrol eder,
        //bu nesneleri assertSame methoduna parametre olarak gönderir.
        CommandManager m1 = CommandManager.getInstance();
        CommandManager m2 = CommandManager.getInstance();
        assertSame(m1, m2);

    }
//2 object tipinde nesnenin ayný olup olmadýðýný kontrol eder, aynýysa SUCCESSFUL yazdýrýr.
    private static void assertSame(Object expected, Object actual) {
        if (expected != actual) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
        System.out.println("SUCCESSFUL");
    }
}
