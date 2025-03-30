package t1q1;

public class T1Q1 {

    public static void main(String[] args) {
        //Create a new telephone array
        Telephone phones[] = new Telephone[5];
        
        //Initiate 5 new telephone objects
        for (int i = 0; i < 5; i++){
            phones[i] = new Telephone("03", 79676300 + i);
        }
        
        //Iterate through the area and combine the parameters using the method
        for (Telephone phone: phones){
            System.out.println(phone.makeFullNumber());
        }
    }  
}
