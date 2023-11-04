import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

 class Q5 {  
    public static void main(String[] args)   {
        int i;
        for ( i = 0; i < 5; i++) {
            System.out.println();
            Update();
            System.out.println();
        }
           result(); 
    }
    private static void result() {
                String file = "";
                File F;
                String classed = "";
                int Grand_totel = 0;
                Scanner fileReader;
                FileWriter myWriter;
                String path = "java.txt";
                try {
                    F = new File(path);
                    myWriter = new FileWriter(((File)F).getAbsolutePath() , true);
                    fileReader = new Scanner(F);
                    System.out.println();
                while (fileReader.hasNextLine()) {
                    classed = fileReader.nextLine();
                    if(classed.contains("Total Value : Rs "))
                    {
                        Grand_totel+=Integer.parseInt(classed.replace("Total Value : Rs ",""));
                    }
                    file += classed+"\n";
                }
                System.out.println("Result: ");
                System.out.println(file);
                System.out.println("Total Value of All Products: Rs "+Grand_totel);
                myWriter.append("Total Value of All Products: Rs "+Grand_totel+'\n'+'\n');
                myWriter.close();
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    return;
                }catch (IOException e) {
                    // TODO Auto-generated catch block
                    return;
                }
                
    }
    public static void Update()
    {
            
        
            String [] st = {"Product Code: ","Cost: Rs ","Quantity: "};
            File F;
            String path = "java.txt";
            int count = 0;
            int []arr = new int[3];
            int Total_Value = 0;
            
            
            try {

               
                Scanner sc = new Scanner(System.in);
                F = new File(path);
                FileWriter myWriter = new FileWriter(((File)F).getAbsolutePath() , true);

                while (count < st.length) {
                    //++count;
                    System.out.print(st[++count-1]);
                    arr[count-1] = sc.nextInt();
                    myWriter.append(st[count-1]+arr[count-1]+'\n'); 
                }
                Total_Value = arr[1]*arr[2] ;
                System.out.print("Total Value : Rs "+Total_Value+"");
                myWriter.append("Total Value : Rs "+Total_Value+'\n'+'\n');
                
                
                myWriter.close();
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
             catch (MatchException e) 
            {
                return;
            }
     
    }
}
