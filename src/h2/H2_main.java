package h2;

public class H2_main {
    public static void main(String[] args) {

        int n = 987654321;
        int digits = 9;
        int[] a = new int[9];

        String b = "" + n ;
        digits = b.length();




        for (int i = 0; i<a.length; i++){
            a[i] = 0;
        }

        for (int j = 0 ;j <digits;j++){
            a[a.length - digits + j] = b.charAt(j) - 48;
            System.out.println(b.charAt(j));
        }





        for (int i = 0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
