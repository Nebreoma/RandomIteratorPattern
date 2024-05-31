import java.util.Iterator;
import java.util.Random;

class RandomsIterator implements Iterator<Integer> {

    protected Random random;
    protected int min, max;

    public RandomsIterator(int min, int max, Random random) {
        this.random = random;
        this.min = min;
        this.max = max;
    }
    @Override
    public Integer next() {
        return random.nextInt(min, max + 1);
    }

    @Override
    public boolean hasNext() {
        return true;
    }

}