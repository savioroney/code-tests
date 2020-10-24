public class FrogJmp {

    public static void main(String[] args) {

        int X = 10;
        int Y = 85;
        int D = 30;

        int diff = Y - X;
        int increment = (diff % D != 0) ? 1 : 0;
        int jumps = (diff / D) + increment;


        System.out.println(jumps);
    }
}
