package core.JunitSurefireReport;
 
public class App 
{
	
	
    public static String s = "Testing JUnit 4";
    public static Integer i = 55;
    public static Boolean t = true;
    public static Boolean f = false;
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        System.out.println( "Hello World!" );
   //  public static String s = "Testing JUnit 4";   	 
   //  public static Integer i = 55;					//for some reason when you add public static inside the main method it shows an error 
   //  public static Boolean t = true;					//and recomends to remove unnecessary access modifier
   //  public static Boolean f = false;					//is that because of the variable is not primitive data tytpe but it is an an Object?
     //QUESTION: 	 Why it shows an error when it is inside the main method and asks to remove the incorrect acess modifier?
     
        
        
    }
}
