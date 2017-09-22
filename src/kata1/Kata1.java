package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Dani", new Date(94, 9-1, 7));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
