public class sml_Among_three {
    static int larger(int a, int b, int c) {
        return c < (a < b ? a : b) ? c : ((a < b) ? a : b);
    }

    public static void main(String[] args) {
        int a = 10, b = 3, c = 5;
        int result = larger(a, b, c);
        //the line 7 bug is fixed 
        System.out.println("SMALLEST IS :" + result);
    }

}