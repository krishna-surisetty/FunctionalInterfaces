package functionalinterfacebasics;

public class TestMain {
    public static void main(String[] args) {
        Foo foo = input -> input + " from lambda expression";
        UseFoo useFoo = new UseFoo();
        String result = useFoo.add("Hello", foo);
        System.out.println(result);
    }
}
