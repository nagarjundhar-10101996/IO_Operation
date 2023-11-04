import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

 class Q2 {
    
    public static void main(String[] args)   {
        Scanner fileReader;
        File reader = new File("inp.txt");
        try {
            FileWriter myWriter = new FileWriter(reader.getAbsolutePath());
            fileReader = new Scanner(new File("input.txt"));
            while (fileReader.hasNextLine()) {
                reader.createNewFile();
                myWriter.write(fileReader.nextLine()+'\n');
                }
                myWriter.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            return;
        }  
        catch (NoSuchElementException e) {
            return;
        }  
        catch (IOException e) {
                    return;
                }
    }
}

