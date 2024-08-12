import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  ArrayList<Integer> a = new ArrayList<>();
  // Load Values in ArrayList
  a.add(1);
  a.add(4);
  a.add(7);
  // Iterate it by usig Iterator and While Loops
  Iterator i=a.iterator();
  while(i.hasNext()) {
    System.out.println(i.next());
  }
}
}
