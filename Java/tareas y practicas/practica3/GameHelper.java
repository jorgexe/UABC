package practica3;

import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        return scanner.nextInt();
    }
}
