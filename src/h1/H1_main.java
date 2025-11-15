package h1;

public class H1_main {
    public static void main(String[] args) {

        int[] myArray = {1,2,38,3444,23,4,5};
        int[] notMyArray = myArray.clone();


        for (int i = 0; i < myArray.length;i++){

            myArray[i] = notMyArray[myArray.length -1 -i];

        }
        for (int j = 0; j < myArray.length;j++){

            System.out.println(myArray[j]);

        }




    }
}
