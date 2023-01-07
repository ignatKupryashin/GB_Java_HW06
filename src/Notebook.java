
/**
 * Объединяет параметры отдельного ноутбука
*/

public class Notebook {
        private String modelName; //Наименование
         private int RAM; //Объем оперативной памяти
        private int storage; // Объем жеткого диска
         private String OS; // Операционная система
        private String color; // Цвет
        private int price;

    Notebook(String argModelName, int argRAM, int argStorage, String argOS, String argColor, int argPrice) {
        modelName = argModelName;
        RAM = argRAM;
        storage = argStorage;
        OS = argOS;
        color = argColor;
        price = argPrice;
    }



    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
        System.out.println(String.format("Цена на ноутбук %s установлена в размере %d", modelName, price));
    }

    /**
     * Выводит информацию о конкретном ноутбуке
    * */
    public void showInfo() {
        System.out.println(String.format("" +
                "Наименование: %s\n" +
                "Оперативная память: %d\n" +
                "Объем жесткого диска: %dGB\n" +
                "Операционная система: %s\n" +
                "Цвет: %s\n" +
                "-----\n" +
                "Цена: %d рублей\n", modelName,RAM,storage,OS,color,price));
    }

}
