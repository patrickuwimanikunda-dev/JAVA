public class Main {

    static void useRepeatedly(Flashlight flash, int times) {
        for (int i = 0; i < times; i++) {
            flash.use();
            System.out.println(flash.getBattery());
        }
    }

    public static void main(String[] args) {
        try {
            Flashlight a = new Flashlight(100);
            System.out.println("For a");
            useRepeatedly(a, 10);
            Flashlight b = new Flashlight(50);
            System.out.println("For b");
            useRepeatedly(b, 6);
            Flashlight c = new Flashlight(-10);
            System.out.println("For c");
            useRepeatedly(c, 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Flashlight d = new Flashlight(25);
        useRepeatedly(d,3);
    }
}


class Flashlight {
    private int battery;

    Flashlight(int startBattery) {
        if (startBattery < 0) {
            throw new IllegalArgumentException("Battery cannot be less than zero");
        }
        battery = startBattery;
    }

    void use() {
        if (battery >= 10) {
            battery -= 10;
        }
    }

    int getBattery() {
        return battery;
    }
}

