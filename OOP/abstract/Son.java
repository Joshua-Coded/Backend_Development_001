public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("I am going to be a software Engineer" + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love coding and programming" + name + " and programming " + age);

    }
}