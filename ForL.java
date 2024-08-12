import java.util.ArrayList;

public class ForL
{
  public static void main(String[]args){
    // prepare an object for ArrayList
    
   
    ArrayList<String> a = new ArrayList<>();
    // Load String instead of Integers 
    a.add("Kavitha");
    a.add("Sujatha");
    a.add("Swarupa");
    // Iterate them using for each loop
    for (String p : a) {
      System.out.println(p);
    }
  }
}

  