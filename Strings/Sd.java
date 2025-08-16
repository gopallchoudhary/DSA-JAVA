package Strings;

public class Sd {
    public static float shortest(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'E') {
                x++;
            } 
            else if (dir == 'W') {
                x--;
            }
            else if(dir == 'N') {
                y++;
            }
            else {
                y--;
            }
        }

        double X2 = Math.pow(x, 2);
        double Y2 = Math.pow(y, 2);
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "NS";
        System.out.println(shortest(path));
    }
}
