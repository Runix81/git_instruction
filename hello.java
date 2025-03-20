import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.IOException;

public class hello {
     
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Input your name: ");
        String x = reader.readLine();
      //  String x = "Sergey";
        System.out.println("Hello "+x+"!");
    }
}