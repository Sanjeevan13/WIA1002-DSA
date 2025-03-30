package l1q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L1Q2 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\SANJEEVAN KUMARESON\\OneDrive\\Documents\\text4.txt");
        try{
            Scanner scanner = new Scanner(file);
            int character = 0;
            
            while (scanner.hasNext()){
                String line = scanner.nextLine().replaceAll("[0-9]", "");
                System.out.println(line);
                character += line.length();
            }
            System.out.println("Number of characters: " + character);
        }catch (FileNotFoundException e){
            e.getMessage();
        }
    }
    
}
