package task4DocumentWorker;

public class ExpDocumentWorker extends DocumentWorker{

    @Override
    public void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
