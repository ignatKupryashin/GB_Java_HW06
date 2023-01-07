
/**
 * Класс для загрузки Базы Данных
* */
public class  Loader {
    NotebookCatalog myCatalog = new NotebookCatalog();

    public Loader() {
    }

    public NotebookCatalog loadDB() {

        Notebook firstNotebook = new Notebook("Macbook Pro", 16, 512, "MacOS", "Space Gray", 200000);
        Notebook secondNotebook = new Notebook("ASUS Zenbook black", 64, 256, "Windows 11", "Black", 150000);
        Notebook thirdNotebook = new Notebook("ASUS ROG", 32, 512, "Windows 11", "Black", 160000);
        Notebook fourthNotebook = new Notebook("Huaway Matebook", 8, 512, "Linux", "Silver", 90000);
        Notebook fifthNotebook = new Notebook("Sony VAIO", 16, 2048, "Windows 11", "Silver", 96000);
        Notebook sixthNotebook = new Notebook("ASUS Zenbook blue", 64, 256, "Windows 11", "Blue", 150000);

        myCatalog.addNotebook(firstNotebook);
        myCatalog.addNotebook(secondNotebook);
        myCatalog.addNotebook(thirdNotebook);
        myCatalog.addNotebook(fourthNotebook);
        myCatalog.addNotebook(fifthNotebook);
        myCatalog.addNotebook(sixthNotebook);

        return myCatalog;
    }
}
