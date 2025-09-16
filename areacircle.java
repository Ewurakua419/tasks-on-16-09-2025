//task 3
//Name Ewurakua Amoah
//Date: 16/09/2025
//radius of a circle and calculate the area
import java.util.Scanner;
public class areacircle {
    public static void main (String[] args){
        Scanner circle= new Scanner(System.in);

        System.out.println("Enter the radius");
        int radius=circle.nextInt();
        float pi=3.141592653589793f;
        double area= 2*pi*(Math.pow(radius,2));

        System.out.println("the pi is "+ pi);
        System.out.println("the radius is "+ radius);
        System.out.println("the area is "+ area);

        circle.close();

    }

}
