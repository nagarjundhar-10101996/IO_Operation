import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

 class Q1 {
    
    public static void main(String[] args)   {
        Scanner fileReader;
        String file = "";
        int countnextline = 0;
        try {
            fileReader = new Scanner(new File("input.txt"));
            while (fileReader.hasNextLine()) {
                file += fileReader.nextLine();
               
                    
                
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
        System.out.println("Character Count:" + file.length());
        System.out.println("Word Count:" + file.replace("."," ").split(" ").length);
        System.out.println("Line Count:" + countnextline);
    }
}
