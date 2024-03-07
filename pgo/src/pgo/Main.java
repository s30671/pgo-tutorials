package pgo;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");

        int b = scanner.nextInt();
         if (b > 0){
             System.out.println("Dodatnia");
         }else if (b < 0){
             System.out.println("Ujemna");
         }else {
             System.out.println("Zero");
         }
    }
}
6