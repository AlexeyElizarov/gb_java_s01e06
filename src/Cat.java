public class Cat extends Animal {

    public Cat() {
        run_limit = randFloat(50f, 400f);
        jump_limit = randFloat(1f, 3f);
    }
}
