package byUsingAllKeywords;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ThrowsExample  {
    public static void main(String[] args) throws FileNotFoundException{
   
            File file = new File("nonexistentfile.txt");
            FileReader reader = new FileReader(file);
            // Perform some operations with the FileReader here
        
    }
}
