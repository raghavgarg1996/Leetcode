public class Covert_The_Temperature {

    public static double[] convertTemperature(double celsius) {

        double[] temp_arr = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        temp_arr[0] = kelvin;
        temp_arr[1] = fahrenheit;

        return temp_arr;
    }

    public static void main(String[] args) {
        double cels = 36.50;
        double[] temp_array = new double[2];
        temp_array = convertTemperature(cels);
        for (double v : temp_array) {
            System.out.println(v);
        }
    }
}
