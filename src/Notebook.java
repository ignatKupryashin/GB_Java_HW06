
public class Notebook {
        String modelName; //Наименование
        int RAM; //Объем оперативной памяти
        int storage; // Объем жеткого диска
        String OS; // Операционная система
        String color; // Цвет
        int price;

    Notebook(String argModelName, int argRAM, int argStorage, String argOS, String argColor, int argPrice) {
        modelName = argModelName;
        RAM = argRAM;
        storage = argStorage;
        OS = argOS;
        color = argColor;
        price = argPrice;
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
