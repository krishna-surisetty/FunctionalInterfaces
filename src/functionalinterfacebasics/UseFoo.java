package functionalinterfacebasics;

import functionalinterfacebasics.Foo;

public class UseFoo {
    public String add(String string, Foo foo) {
        return foo.method(string);
    }
}
