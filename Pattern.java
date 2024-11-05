public class Pattern {

    public static void main(String[] args) {
        /// STAR  
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("* ");
                
        //     }
        //     System.out.println();
        // }

        /// Inverted Star 
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}