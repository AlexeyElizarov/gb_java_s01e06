import java.util.Random;

public abstract class Animal {

    protected float run_limit;
    protected float jump_limit;
    protected float swim_limit;

    public boolean run(float distance) {
        return distance <= run_limit;
    }

    public boolean jump(float distance) {
        return distance <= jump_limit;
    }

    public boolean swim(float distance) {
        return distance <= swim_limit;
    }

    protected float randFloat(float min, float max) {
        Random random = new Random();
        return min + random.nextFloat() * (max - min);
    }

    @Override
    public String toString() {
        return String.format("running limit = %f\n" +
                "jumping limit = %f\n" +
                "swimming limit = %f\n", run_limit, jump_limit, swim_limit);
    }

}
