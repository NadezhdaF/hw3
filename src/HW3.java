import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число");
        int range = 1000;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угaдай число от 0 до " + range);
            for (int i = 0; i < 3; i++) {
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println(" Вы угадали");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                    System.out.println("Вы проиграли Повторить игру еще раз?");
                }

            }
        }
    }
}
