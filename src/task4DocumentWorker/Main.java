package task4DocumentWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key word: ");
        String password = sc.nextLine();

        switch (password) {

            case "pro":
                ProDocumentWorker proDoc = new ProDocumentWorker();
                proDoc.openDocument();
                proDoc.editDocument();
                proDoc.saveDocument();
                break;

            case "exp":
                ExpDocumentWorker expDoc = new ExpDocumentWorker();
                expDoc.openDocument();
                expDoc.editDocument();
                expDoc.saveDocument();
                break;

            default:
                DocumentWorker doc = new DocumentWorker();
                doc.openDocument();
                doc.editDocument();
                doc.saveDocument();
                break;
        }
    }
}
