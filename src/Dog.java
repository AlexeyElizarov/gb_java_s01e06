public class Dog extends Animal {

    public Dog() {
        run_limit = randFloat(100f, 700f);
        jump_limit = randFloat(0.3f, 2.5f);
        swim_limit = randFloat(1f, 15f);
    }
}
