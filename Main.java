public class Main {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne(1, 2);
        System.out.println(c1.sum());
        System.out.println(c1.addition());
        System.out.println(ClassOne.factorial(5));

        ClassTwo c2 = new ClassTwo("string1", "string2");
        System.out.println(c2.add());
        System.out.println(c2.reverse("Hello World"));

        ClassThree c3 = new ClassThree(12.4, 124.5);
        System.out.println(c3.getD1());
        System.out.println(c3.getD2());
    }
}