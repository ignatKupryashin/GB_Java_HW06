import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
* Каталог для ноутбуков. Собирает воедино и проводит анализ
* */

public class NotebookCatalog {
    HashSet<Notebook> catalog = new HashSet<>();
    int maxPrice = 0;
    int maxRam = 0;
    int maxStorage = 0;

    NotebookCatalog() {

    }

/**
* Добавляет ноутбук в каталог
* */
    public void addNotebook(Notebook notebook) {
        catalog.add(notebook);
        checkMax(notebook);
    }



    /**
     * Выводин информацию обо всех ноутбуках в каталоге
     * */

    public void showAllInfo() {
        for (Notebook item : catalog
        ) {
            item.showInfo();
        }
    }

/**
* Обновляет максимальную цену ноутбука в каталоге
* */


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


    /**
     * Проверяет удовлетворение параметру (параметр так же передается)
     * */

    public HashSet<Notebook> checkValue(int min, int max, String parameter) {
        HashSet<Notebook> answer = new HashSet<>();
        switch (parameter) {
            case "Price": {
                for (Notebook item : catalog
                ) {
                    if ((item.getPrice() <= max) && (item.getPrice() >= min)) {
                        answer.add(item);
                    }
                }
            break;
            }
            case "RAM": {
                for (Notebook item : catalog
                ) {
                    if ((item.getRAM() <= max) && (item.getRAM() >= min)) {
                        answer.add(item);
                    }
                }
                break;
            }

            case "Storage": {
                for (Notebook item : catalog
                ) {
                    if ((item.getStorage() <= max) && (item.getStorage() >= min)) {
                        answer.add(item);
                    }
                }
                break;
            }
        }
        return answer;
    }

    public HashSet<Notebook> colorIs(String color) {
        HashSet<Notebook> answer = new HashSet<>();
        if (color.equals("Любой")) {
            answer.addAll(catalog);
        } else {
            for (Notebook item : catalog
            ) {
                if (item.getColor().equals(color)) {
                    answer.add(item);
                }
            }
        }
        return answer;
    }

    public HashSet<Notebook> filter(NotebookFilter inputFilter) {
        HashSet<Notebook> answerHashset = new HashSet<>();
        answerHashset.addAll(catalog);
        answerHashset.retainAll(checkValue(inputFilter.minRAM, inputFilter.maxRAM, "RAM"));
        answerHashset.retainAll(checkValue(inputFilter.minPrice, inputFilter.maxPrice, "Price"));
        answerHashset.retainAll(checkValue(inputFilter.minStorage, inputFilter.maxStorage, "Storage"));
        answerHashset.retainAll(colorIs(inputFilter.color));
        return answerHashset;

    }

}

