package LLD1.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Pair<Integer, Integer> p1 = new Pair<>(1, 2);
//
//        System.out.println(p1.getLeft() + " " + p1.getRight());

        File file = new File("example.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();


//        CustomCheckedException cce = new CustomCheckedException("dsds");


    }
}
