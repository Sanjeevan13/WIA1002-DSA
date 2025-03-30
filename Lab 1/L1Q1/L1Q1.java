package l1q1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File ("\\C:\\Users\\SANJEEVAN KUMARESON\\OneDrive\\Documents\\yourname_matrixNum.txt\\");
        
        try{
            FileWriter writer = new FileWriter(file, true);
            writer.append("\n\nFriday, 24 January 2026 \n\nIt is me again. Finally, it is the end of the term and the DS class has finished!");
            writer.append("\nI believe my performance has significantly improved over these last few months. ");
            writer.append("I am indeed quite happy.\nLearning DS has taught me that the only way to improve my programming skills is by practising everyday.");
            writer.append("\nI am glad to say that my grade has improved from the last semester - it has become an A now.");
            writer.append("\nI believe one thing that I did very well was staying consistent with my revision.");
            writer.append("\nAlthough, I do wish that I spent a bit more time on the File IO topic.");
            writer.close();
            
            Scanner scanner = new Scanner(file);
        
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }  
    }
}
