package Lesson27;

public class Test12 {
    void marathon(int temp, int speed) throws SprainFootException {
        if (speed > 12) {
            throw new SprainFootException("Very fast speed: " + speed);
        }
        if (temp > 32) {
            throw new MuscleCrampException();
        }
        System.out.println("Congratulations, you ran a marathon!");
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        try {
            t.marathon(20, 13);
        } catch (SprainFootException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Anyway you will receive a medal!");
        }
    }
}

class SprainFootException extends Exception {
    SprainFootException(String message) {
        super(message);
    }
    SprainFootException() {}
}

class MuscleCrampException extends RuntimeException {
    MuscleCrampException(String message) {
        super(message);
    }
    MuscleCrampException() {}
}