package Lesson27;

public class Test17 {
    public static void main(String[] args) {
        Tigers t = new Tigers();
        t.eat("meat");
        try {
            t.drink("water");
            try {
                t.drink("beer");
            } catch (NotWaterException a) {
                System.out.println(a.getMessage());
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }  finally {
                System.out.println("It's inner finally block!");
            }
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NotMeatException extends RuntimeException {
    NotMeatException(String message) {
        super(message);
    }
}

class NotWaterException extends Exception {
    NotWaterException(String message) {
        super(message);
    }
}
class Tigers {
    void eat(String meat) {
        if (meat.equals("meat")) {
            System.out.println("Tigers eat meat!");
        } else {
            throw new NotMeatException("Tigers don't eat" + meat);
        }
    }
    void drink(String water) throws NotWaterException {
        if (water.equals("water")) {
            System.out.println("Tigers drink water!");
        } else {
            throw new NotWaterException("Tigers don't drink " + water);
        }
    }
}