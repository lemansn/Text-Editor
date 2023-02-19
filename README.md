 
# User Functions

1. Open File

2. Read File

3. Write File

4. Create File 

5. Save File

6. Close File

7. Undo&Redo step by step

8. Searching and replacing the desired words in the file

9. Copy, Cut, Paste

10. Number of characters and words

11. Shortcuts


# UML Class Diagram

<img src = "https://user-images.githubusercontent.com/78681001/219945306-c231e4d3-018d-47e3-a4ce-5f299b90e7f1.png" width="700" height="900">

# Design Patterns

- Command Design Pattern

- Iterator Design Pattern

- Adapter Design Pattern

- Factory Method Design Pattern

- Singleton Design Pattern


# Project Demo


Main Page&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;File Button

<img src = "https://user-images.githubusercontent.com/78681001/219946245-380a8472-1b51-48cd-9b99-d87ff1d6e1e3.jpeg" width="330" height="300">    <img src = "https://user-images.githubusercontent.com/78681001/219946286-7298a2e2-08a6-4977-b8ea-b2e2a45344e5.jpeg" width="330" height="300">    

<br />

 Edit Button &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Find and Replace
 
 
<img src = "https://user-images.githubusercontent.com/78681001/219946449-0f208c2e-593b-44d0-9f91-4fb635abef68.jpeg" width="330" height="300">  <img src = "https://user-images.githubusercontent.com/78681001/219946383-01e1366b-8e77-4787-a6c8-48600e7ca922.jpeg" width="330" height="300">


<br />

Create File&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Open File &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;

<img src = "https://user-images.githubusercontent.com/78681001/219946298-1df77484-b911-4082-b782-5fbae2f5aa90.jpeg" width="330" height="300">  <img src = "https://user-images.githubusercontent.com/78681001/219946324-63b19241-67d1-476f-aadb-a80391ca6672.jpeg" width="330" height="300">


<br />

Save As

<img src = "https://user-images.githubusercontent.com/78681001/219946317-31b3ebfe-aff4-4657-bd4b-180314d7c671.jpeg" width="330" height="300"> 



# JUnit Test
<pre>
import org.junit.Test;


public class TestFile {

    @Test
    public void testSingleton() {
       
        CommandManager m1 = CommandManager.getInstance();
        CommandManager m2 = CommandManager.getInstance();
        assertSame(m1, m2);

    }

    private static void assertSame(Object expected, Object actual) {
        if (expected != actual) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
        System.out.println("SUCCESSFUL");
    }
}

</pre>

