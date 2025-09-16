//task 1
//Name Ewurakua Amoah
//Date: 16/09/2025
//calculate the average of 4 numbers with input
import java.util.Scanner;//useful for adding input 

public class Averages{
    public static void main(String[] arg) {
        Scanner number1= new Scanner(System.in);//creates an object called number1

        System.out.println("please enter number 1:");
        int n1=number1.nextInt();
        System.out.println("please enter number 2:");
        int n2=number1.nextInt();
        System.out.println("please enter number 3:");
        int n3=number1.nextInt();
        System.out.println("please enter number 4:");
        int n4=number1.nextInt();
        float verage=((n1+ n2 +n3+ n4)/4);

        System.out.println("your average is: "+verage);

        number1.close();

    }
}
