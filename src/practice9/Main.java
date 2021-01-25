package practice9;

import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

class InvalidInnException extends RuntimeException{
    public InvalidInnException(String message) {
        super(message);
    }
}
public class Main {
    HashMap<String, String> list = new HashMap<>();

    public void fillList(){
        list.put("Мухин Иван Иванович", "7655");
        list.put("Белов Василий Николаевич", "4566");
        list.put("Стрекозова Евгения Павловна", "7623");
    }

    public void readInf(){
        fillList();
        Scanner sn = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите ФИО:");
                String fio = sn.nextLine();
                System.out.println("Введите ИНН:");
                String inn = sn.nextLine();
                System.out.println(list.get(fio));
                if (!list.get(fio).equals(inn))
                    throw new InvalidInnException("Номер ИНН " + inn + " не соответсвует клиенту " + fio);
            } catch (InvalidInnException e) {
                System.out.println(e.getMessage());
                System.out.println("Пожалуйста, попробуйте ещё раз.");
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.readInf();
    }

}
