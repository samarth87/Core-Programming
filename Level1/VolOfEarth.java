package Level1;

public class VolOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double conversionFactor = Math.pow(0.621371, 3);
        double volumeMi3 = volumeKm3 * conversionFactor;
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMi3);
    }
}
