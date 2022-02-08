import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("How many number do you want to put in? \r");
       int numElements = scanner.nextInt();

        System.out.println("******************\r");

        sortMax(getNumber(numElements));

    }

    public static void sortMax (int array []){
        int max = array[0];
        for (int e=0;e<array.length;e++){
            if (array[e]>max)
                max = array[e];

        }
        System.out.println("The max number is: "+max);
    }


    public static int [] getNumber (int number){
        System.out.println("Enter the "+number+" value.\r");
        int [] values = new int[number];

        for(int i=0; i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }


}
