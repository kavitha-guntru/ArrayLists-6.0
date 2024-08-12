import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic {
    // Load person class Objects in it
    class Person 
    {
        String name;
        int age;
        Person(String name, int age) 
        {
            this.name = name;
            this.age = age;
        }
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }
    public static void main(String[] args) 
    {
        // Create an Object for ArrayList
        Dynamic dynamic = new Dynamic();
        ArrayList<Person> a = new ArrayList<>();
        a.add(dynamic.new Person("Kavitha", 22));
        // Iterate it by using List Iterator
        Iterator<Person> i = a.iterator();
        // print the values by using while Loop
        while (i.hasNext()) 
        {
            System.out.println(i.next());
        }
    }
}   