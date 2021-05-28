public class Balloon {

    double radius = 0; // radius starts at 0

    public Balloon(double originalRadius) {
    radius = originalRadius; // initial radius = radius, so initial radius is 0
    }

    public void inflate(double amount) {
        radius = radius + amount;
    }

    public double getVolume() {
        double volume = radius * radius * radius * Math.PI * 1.3333333;
        return volume;
    }

    public static void main(String[] args) {
        Balloon balloon = new Balloon(9); //starts out at radius of 9
        System.out.println(balloon.getVolume());// volume when radius = 9
        balloon.inflate(15); // radius is now 9 + 15 = 24
        System.out.println(balloon.getVolume()); // volume when radius = 24
        balloon.inflate(2); // radius is now 24 + 2 = 26
        System.out.println(balloon.getVolume()); // volume when radius = 26
    }
}
