
public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON [Speed: " + speedToString(speed) + ", Radius: " + radius + ", Color: " + color + "]";
        } else {
            return "Fan is OFF [Radius: " + radius + ", Color: " + color + "]";
        }
    }

    // Helper method to convert speed to readable string
    private String speedToString(int speed) {
        switch (speed) {
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "STOPPED";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using no-argument constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (default): " + fan1);

        // Using argument constructor
        Fan fan2 = new Fan(FAST, true, 10.5, "blue");
        System.out.println("Fan 2 (custom): " + fan2);

        // Changing properties of fan1 using setters
        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(7.0);
        fan1.setColor("black");

        System.out.println("Fan 1 (after updates): " + fan1);
    }
}
