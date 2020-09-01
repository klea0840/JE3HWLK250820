package task4DocumentWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key word: ");
        String password = sc.nextLine();

        // Если пользователь ввел номера ключа доступа pro и exp, то должен создаться
        // экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.

        // Создаем переменную базового класса
        DocumentWorker docWorker;

        switch (password) {

            // В зависимости от ключа присваиваем ей экземпляр нужного подкласса
            case "pro":
                docWorker = new ProDocumentWorker();
                break;

            case "exp":
                docWorker = new ExpDocumentWorker();
                break;

            default:
                docWorker = new DocumentWorker();
                break;
        }

        // Вызываем методы
        // Их вызовы внутри switch-case были одинаковы с поправкой на типы.
        // Но так как у нас все эти классы являются подклассами DocumentWorker,
        // мы спокойно вызываем их через переменную базового класса.
        docWorker.openDocument();
        docWorker.editDocument();
        docWorker.saveDocument();

    }
}
