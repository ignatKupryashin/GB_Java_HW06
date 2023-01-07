import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Loader loader = new Loader();
        UI ui = new UI(loader.loadDB());
        ui.run();
    }

}