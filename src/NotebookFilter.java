public class NotebookFilter {
    public int minRAM;
    public int maxRAM;
    public int minStorage;
    public int maxStorage;
    public String color;
    public int minPrice;
    public int maxPrice;



    NotebookFilter(NotebookCatalog catalog) {
        this.clear(catalog);
    }

    public void setFilterMaxPrice(int price){
        maxPrice = price;
    }

    public void setFilterMinPrice(int price) {
        minPrice = price;
    }

    public void setFilterMinRAM(int RAM) {
        minRAM = RAM;
    }

    public void setFilterMaxRAM(int RAM) {
        maxRAM = RAM;
    }

    public void setFilterMinStorage(int storage) {
        minStorage = storage;
    }


    public void setFilterMaxStorage(int storage) {
        maxStorage = storage;
    }

    public void setFilterColor(String newColor) {
        color = newColor;
    }

    public void showFilter() {
        System.out.println(String.format(
                "Текущий фильтр:\n" +
                "RAM: от %dGB до %dGB\n" +
                "Жесткий диск: от %d GB до %d GB\n" +
                "Цвет: %s\n" +
                "Цена: от %d рублей до %d рублей\n", minRAM, maxRAM, minStorage, maxStorage, color, minPrice, maxPrice));
    }

    public void clear(NotebookCatalog catalog) {
        minRAM = 0;
        maxRAM = catalog.maxRam;
        minStorage = 0;
        maxStorage = catalog.maxStorage;
        color = "Любой";
        minPrice = 0;
        maxPrice = catalog.maxPrice;
    }


}
