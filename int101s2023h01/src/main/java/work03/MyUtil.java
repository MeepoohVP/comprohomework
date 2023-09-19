package work03;

public class MyUtil {
    public static double calculateBMI(double weight, double height){
        double result = weight / (height * height);
        return result;
    }
    public static double average(int v1, int v2, int v3){
        double avg = (v1 + v2 + v3) / 3;
        return avg;
    }
}
