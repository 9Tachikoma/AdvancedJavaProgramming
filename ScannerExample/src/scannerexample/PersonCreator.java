package scannerexample;

import java.util.Scanner;

public class PersonCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name,age and phone number: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        Long phoneNuber = scanner.nextLong();
        Person person = new Person(name, age, phoneNuber);//useDelimiter
    }
}
