import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hello {
     
    public static void main(String[] args) throws Exception {
        
    }
    

    
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String enterName() {
      System.out.print("Input your name: ");
    String x = reader.readLine();
    return x;
    }
    public void helloName() {
      System.out.println("Hello "+enterName()+"!");
    }

  }