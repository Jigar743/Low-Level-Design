package LLD1.Generics;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> idToEmail3 = new Pair<>(3, "sdsd@ds");
        Pair<Integer, String> idToEmail1 = new Pair<>(1, "ijds@ds");
        Pair<Integer, String> idToEmail2 = new Pair<>(2, "idsds@ds");

        List<Pair<Integer, String>> list = List.of(idToEmail1, idToEmail2, idToEmail3);

        for (Pair<Integer, String> pair : list) {
            System.out.println(pair.getLeft() + " , " + pair.getRight());
        }

        List<Float> list1 = List.of(1.00f, 2.00f, 3.00f, 4.00f, 5.52f, 1.00f);

        System.out.println(list1);

    }
}
