package pachet1;

import java.util.Scanner;

public class CitireString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number here: ");

        int number = scanner.nextInt();

        scanner.close();

        if (number == 0) {
            System.out.println(" MA-TA DE PROST, E ZERO");
        } else if (number > 0) {
            System.out.println("POZITIV CA MA-TA");
        } else {
            System.out.println("NEGATIV ");
        }
    }

}

