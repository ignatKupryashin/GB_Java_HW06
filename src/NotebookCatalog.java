import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class NotebookCatalog {
    HashSet <Notebook> catalog = new HashSet<>();
    int maxPrice = 0;
    int maxRam = 0;
    int maxStorage = 0;

    NotebookCatalog() {
    }

    public void addNotebook(Notebook notebook) {
        catalog.add(notebook);
        checkMax(notebook);
    }

    public void showAllInfo() {
        for (Notebook item: catalog
             ) {
            item.showInfo();
        }
    }




    void checkMax(Notebook notebook) {
        if (notebook.getPrice() > maxPrice) {
            maxPrice = notebook.getPrice();
        }

        if (notebook.getStorage() > maxStorage) {
            maxStorage = notebook.getStorage();
        }

        if (notebook.getRAM() > maxRam) {
            maxRam = notebook.getRAM();
        }

    }


    public HashSet<Notebook> priceLess(int maxPrice) {

        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
             ) {
            if (item.getPrice() <= maxPrice) {
                answer.add(item);
            }
        }
        return answer;
    }


    public HashSet<Notebook> priceMore(int minPrice) {

        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
        ) {
            if (item.getPrice() >= minPrice) {
                answer.add(item);
            }
        }
        return answer;
    }

    public HashSet<Notebook> RAMLess(int maxRAM) {

        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
        ) {
            if (item.getRAM() <= maxRAM) {
                answer.add(item);
            }
        }
        return answer;
    }


    public HashSet<Notebook> RAMMore(int minRAM) {

        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
        ) {
            if (item.getRAM() >= minRAM) {
                answer.add(item);
            }
        }
        return answer;
    }


    public HashSet<Notebook> storageLess(int maxstorage) {

        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
        ) {
            if (item.getStorage() <= maxstorage) {
                answer.add(item);
            }
        }
        return answer;
    }


    public HashSet<Notebook> storageMore(int minstorage) {

        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
        ) {
            if (item.getStorage() >= minstorage) {
                answer.add(item);
            }
        }
        return answer;
    }




    public HashSet<Notebook> colorIs(String color) {
        HashSet<Notebook> answer = new HashSet<>();
        if (color.equals("Любой")) {
            answer.addAll(catalog);
        }
        else {
            for (Notebook item: catalog
            ) {
                if (item.getColor().equals(color)) {
                    answer.add(item);
                }}
        }
        return answer;
    }


    public HashSet<Notebook> modelNameIs(String modelName) {
        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
        ) {
            if (item.getModelName().equals(modelName)) {
                answer.add(item);
            }
        }
        return answer;
    }

    public HashSet<Notebook> OSIs(String OS) {
        HashSet<Notebook> answer = new HashSet<>();

        for (Notebook item: catalog
        ) {
            if (item.getOS().equals(OS)) {
                answer.add(item);
            }
        }
        return answer;
    }

    public HashSet<Notebook> filter(NotebookFilter inputFilter) {
        HashSet <Notebook> answerHashset= new HashSet<>();
        answerHashset.addAll(catalog);
        answerHashset.retainAll(RAMMore(inputFilter.minRAM));
        answerHashset.retainAll(RAMLess(inputFilter.maxRAM));
        answerHashset.retainAll(priceMore(inputFilter.minPrice));
        answerHashset.retainAll(priceLess(inputFilter.maxPrice));
        answerHashset.retainAll(storageMore(inputFilter.minStorage));
        answerHashset.retainAll(storageLess(inputFilter.maxStorage));
        answerHashset.retainAll(colorIs(inputFilter.color));
        return answerHashset;

    }

}

