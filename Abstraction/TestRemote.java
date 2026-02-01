// Interface
interface Remote {
    void turnOn();
    void turnOff();
}

// Class TV implements Remote
class TV implements Remote {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

// Class AC implements Remote
class AC implements Remote {
    @Override
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

// Test class
public class TestRemote {
    public static void main(String[] args) {
        Remote tv = new TV();
        Remote ac = new AC();

        tv.turnOn();
        tv.turnOff();

        System.out.println();

        ac.turnOn();
        ac.turnOff();
    }
}
