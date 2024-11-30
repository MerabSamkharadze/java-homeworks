package ge.merabi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("[ ,]+");
        int wordCount = words.length;
        System.out.println("Word count: " + wordCount);
        scanner.close();


    }
}