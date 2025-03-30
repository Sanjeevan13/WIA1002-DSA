package t1q1;

public class Telephone {
    //Instance variables
    private String areaCode;
    private int number;
    
    //Static variable
    private static int numberOfTelephoneObject = 0;
    
    public Telephone(String areaCode, int number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }
    
    //Accessors
    public String getAreaCode(){
        return areaCode;
    }
    
    public int getNumber(){
        return number;
    }
    
    public static int getNumberOfTelephoneObject(){
        return numberOfTelephoneObject;
    }
    
    //Mutators
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    //Custom Method
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
}
