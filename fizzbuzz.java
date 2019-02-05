/*
* This is a program that plays Fizz Buzz.
* Count to 100; replace numbers devisable by three with the word fizz.
* Replace numbers devisable by five with the word buzz.
* Numbers divisible by both become fizz buzz.
*/

public class fizzbuzz {
    public static void main(String[] args) {
        for (int num = 1; num<=100; num++){
            String toPrint = "";
            
            toPrint += num%3 == 0 ? "fizz " : "";
            toPrint += num%5 == 0 ? "buzz " : "";
            toPrint += toPrint.equals("") ? num : "";

            System.out.println(toPrint);
        }
    }
}