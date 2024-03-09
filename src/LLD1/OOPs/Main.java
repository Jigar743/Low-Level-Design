package LLD1.OOPs;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(24, "dsds");

        Person p2 = new Person(25, "weww");

        // Here swapping is not happening, objects are just doing a swallow copy rather than deep copy.
        swapObj(p1, p2);
        System.out.println(p1.age + "  " + p1.name);
        System.out.println(p2.age + "  " + p2.name);
    }

    public static void swapObj(Person p1, Person p2){
        Person tempObj = p1;
        p1 = p2;
        p2 = tempObj;
    }
}
