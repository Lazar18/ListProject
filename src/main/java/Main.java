import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.error("TEST");

        // tworzymy własną listę
        // 1. dodajemy do niej wartości - dni tygodnia

        MyList myList = new MyListImpl();
        myList.add("poniedziałek");
        myList.add("wtorek");
        myList.add("środa");
        myList.add("czwartek");
        myList.add("piątek");
        myList.add("sobota");
        myList.add("niedziela");

        // 2. wyświatlamy wszystkie elementy z listy

        logger.error(myList.returnListAsString());

        // 3. zwracamy rozmiar listy

        logger.error("size {}", (myList.getListSize()));



        // 4. usuwamy element z listy
    }
}
