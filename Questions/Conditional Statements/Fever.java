public class Fever {

    public static void main(String[] args) {
        double temp = 103.5;
        // String healthCheck = (temp > 100) ? "You have a fever" : "You dont have a fever";
        // System.out.println(healthCheck);

        if(temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You dont have a fever");
        }
    }
}