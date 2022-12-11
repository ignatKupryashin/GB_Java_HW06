import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Notebook firstNotebook = new Notebook("Macbook Pro", 16, 512, "MacOS", "Space Gray", 200000);
        Notebook secondNotebook = new Notebook("ASUS Zenbook black", 64, 256, "Windows 11", "Black", 150000);
        Notebook thirdNotebook = new Notebook("ASUS ROG", 32, 512, "Windows 11", "Black", 160000);
        Notebook fourthNotebook = new Notebook("Huaway Matebook", 8, 512, "Linux", "Silver", 90000);
        Notebook fifthNotebook = new Notebook("Sony VAIO", 16, 2048, "Windows 11", "Silver", 96000);
        Notebook sixthNotebook = new Notebook("ASUS Zenbook blue", 64, 256, "Windows 11", "Blue", 150000);

        NotebookCatalog myCatalog = new NotebookCatalog();

        myCatalog.addNotebook(firstNotebook);
        myCatalog.addNotebook(secondNotebook);
        myCatalog.addNotebook(thirdNotebook);
        myCatalog.addNotebook(fourthNotebook);
        myCatalog.addNotebook(fifthNotebook);
        myCatalog.addNotebook(sixthNotebook);

        boolean flag = true;
        System.out.println("Добро пожаловат в наш каталог ноутбуков");
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("---------------------------------------");
            System.out.println("1. Показать весь каталог\n" +
                    "2. Отфильтровать каталог\n" +
                    "9. Выход\n" +
                    "Введите команду:");
            String command = scanner.nextLine();

            switch (command) {
                case "1": {
                    myCatalog.showAllInfo();
                    break;
                }
                case "2": {
                    filterInterface(myCatalog);
                    break;
                }

                case "9": {
                    flag = false;
                    System.out.println("До новых встреч");
                    break;
                }
                default: {
                    System.out.println("Введена не верная команда");
                    break;
                }
            }
        }
    }


    public static boolean isInterger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }


    public static void filterInterface(NotebookCatalog catalog) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        NotebookFilter myFilter = new NotebookFilter(catalog);
        HashSet<Notebook> filterList = new HashSet<>();

        while (flag) {
            myFilter.showFilter();
            System.out.println("Назначте критерии фильтрации и нажмите фильтр");
            System.out.println("0. Сбросить фильтр\n" +
                    "1. Назначить минимальную RAM\n" +
                    "2. Назначить максимальную RAM\n" +
                    "3.Назначить минимальное место на жёстком диске\n" +
                    "4. Назначить максимальное место на жестком диске\n" +
                    "5. Назначте цвет\n" +
                    "6. Назначить минимальную цену\n" +
                    "7. Назначить максимальную цену\n" +
                    "8. Показать отфильтрованое\n" +
                    "9. Вернуться в главное меню\n\n" +
                    "Введите команду:");

            String command = scanner.nextLine();

            switch (command){

                case "0": {
                    myFilter.clear(catalog);
                    break;
                }

                case "1": {
                    System.out.println("Ввежите минимальную необходимую RAM: ");
                    String input = scanner.nextLine();
                    if (isInterger(input)) {
                        int num = Integer.parseInt(input);
                        if (num > 0) {
                            myFilter.setFilterMinRAM(num);
                        }
                        else {
                            myFilter.setFilterMinRAM(0);
                        }
                    }
                    else {
                        System.out.println("Введено не верное число");
                    }
                    break;
                }


                case "2": {
                    System.out.println("Ввежите максимальную необходимую RAM: ");
                    String input = scanner.nextLine();
                    if (isInterger(input)) {
                        int num = Integer.parseInt(input);
                        if (num < catalog.maxRam) {
                            myFilter.setFilterMaxRAM(num);
                        }
                        else {
                            myFilter.setFilterMinRAM(catalog.maxRam);
                        }
                    }
                    else {
                        System.out.println("Введено не верное число");
                    }
                    break;
                }


                case "3": {
                    System.out.println("Ввежите минимальное место на жёстком диске: ");
                    String input = scanner.nextLine();
                    if (isInterger(input)) {
                        int num = Integer.parseInt(input);
                        if (num > 0) {
                            myFilter.setFilterMinStorage(num);
                        }
                        else {
                            myFilter.setFilterMinStorage(0);
                        }
                    }
                    else {
                        System.out.println("Введено не верное число");
                    }
                    break;
                }


                case "4": {
                    System.out.println("Ввежите максимальное место на жёстком диске: ");
                    String input = scanner.nextLine();
                    if (isInterger(input)) {
                        int num = Integer.parseInt(input);
                        if (num < catalog.maxStorage) {
                            myFilter.setFilterMaxStorage(num);
                        }
                        else {
                            myFilter.setFilterMinStorage(catalog.maxStorage);
                        }
                    }
                    else {
                        System.out.println("Введено не верное число");
                    }
                    break;
                }

                case "5": {
                    System.out.println("Ввежите необходимый цвет: ");
                    String input = scanner.nextLine();
                    myFilter.setFilterColor(input);
                    break;
                }



                case "6": {
                    System.out.println("Ввежите минимальую цену: ");
                    String input = scanner.nextLine();
                    if (isInterger(input)) {
                        int num = Integer.parseInt(input);
                        if (num > 0) {
                            myFilter.setFilterMinPrice(num);
                        }
                        else {
                            myFilter.setFilterMinPrice(0);
                        }
                    }
                    else {
                        System.out.println("Введено не верное число");
                    }
                    break;
                }


                case "7": {
                    System.out.println("Ввежите максимальную цену: ");
                    String input = scanner.nextLine();
                    if (isInterger(input)) {
                        int num = Integer.parseInt(input);
                        if (num < catalog.maxPrice) {
                            myFilter.setFilterMaxPrice(num);
                        }
                        else {
                            myFilter.setFilterMaxPrice(catalog.maxPrice);
                        }
                    }
                    else {
                        System.out.println("Введено не верное число");
                    }
                    break;
                }

                case "8": {
                    for (Notebook item:catalog.filter(myFilter)
                         ) {
                        item.showInfo();
                    }
                    break;
                }

                case "9": {
                    flag = false;
                    break;
                }
            }

        }
    }



}