import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

 class Q3 {
    
    public static void main(String[] args)   {
        Scanner fileReader;
        String longest_word = "";
        String current;
        int countnextline = 0;
        try {
            fileReader = new Scanner(new File("input.txt"));
            while (fileReader.hasNextLine()) {
                current = fileReader.next();
                if (current.length() > longest_word.length()) {
                    longest_word = current;
                  }
                    
                
                countnextline++;
                }
            fileReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            return;
        }  
        catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            return;
        }  
        System.out.println("Longer Word: " + longest_word);
    }
}

