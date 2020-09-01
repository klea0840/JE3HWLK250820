package task4DocumentWorker;

// ...от базового класса ProDocumentWorker. В данном случае, судя по всему,
// имеется ввиду, что для ExpDocumentWorker базовым должен быть
// ProDocumentWorker.
public class ExpDocumentWorker extends ProDocumentWorker {

//    // Тогда эти два метода не нужны, т.к. они есть в ProDocumentWorker
//    @Override
//    public void openDocument() {
//        System.out.println("Документ открыт");
//    }
//
//    @Override
//    public void editDocument() {
//        System.out.println("Документ отредактирован");
//    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
