package CollectionBubbleSorting;

import java.util.Random;

public class RandMethod {

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
