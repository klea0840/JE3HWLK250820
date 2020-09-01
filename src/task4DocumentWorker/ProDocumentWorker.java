package task4DocumentWorker;

public class ProDocumentWorker extends DocumentWorker {
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
        System.out.println("Документ сохранен в старом формате," + "\nсохранение в остальных форматах доступно в версии Эксперт");
    }
}
