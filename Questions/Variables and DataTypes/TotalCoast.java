import java.util.Scanner;

public class TotalCoast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of Pen.");
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of Pencil.");
        float pencil = sc.nextFloat();

        System.out.println("Enter the cost of Eraser.");
        float eraser = sc.nextFloat();
        
        //!<--Calculation-->
        float total = pen + pencil + eraser ;
        float gst = (total/100) * 18;
        float finalPrice = total + gst;
        System.out.println("Total price is " + finalPrice);
        
        sc.close();
    }
}