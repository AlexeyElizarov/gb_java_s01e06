public class Main {
    public static void main(String[] args) {
        // ToCheck

        Animal dog1 = new Dog();
        System.out.println("\nDog 1");
        System.out.print(dog1);
        System.out.println(dog1.run(500));
        System.out.println(dog1.jump(0.3f));
        System.out.println(dog1.swim(5));

        Animal dog2 = new Dog();
        System.out.println("\nDog 2");
        System.out.print(dog2);
        System.out.println(dog2.run(500));
        System.out.println(dog2.jump(0.3f));
        System.out.println(dog2.swim(5));

        Animal cat = new Cat();
        System.out.println("\nCat");
        System.out.print(cat);
        System.out.println(cat.run(150));
        System.out.println(cat.jump(0.3f));
        System.out.println(cat.swim(5));
    }
}
