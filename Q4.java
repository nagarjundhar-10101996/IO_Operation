import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

 class Q4 {
    
    public static void main(String[] args)   {
        Scanner fileReader;
        File F;
        try {
            F = new File("input.txt");
            fileReader = new Scanner(F);
            FileWriter myWriter = new FileWriter(((File)F).getAbsolutePath() , true);
            myWriter.append(fileReader.nextLine()+'\n');
            myWriter.close();
            fileReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            return;
        }  
        catch (NoSuchElementException e) {
            return;
        }  
        catch (IOException e) 
        {
            return;
        }
    }
}