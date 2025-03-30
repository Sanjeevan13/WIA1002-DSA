package l1q1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L1Q1 {

    public static void main(String[] args) {
        File file = new File ("\\C:\\Users\\SANJEEVAN KUMARESON\\OneDrive\\Documents\\yourname_matrixNum.txt\\");
        
        try{
            
            Scanner scanner = new Scanner(file);
        
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }  
    }
}
