//task 2
//Name Ewurakua Amoah
//Date: 16/09/2025
//simple interest calc
import java.util.Scanner;//allows input
public class Interest {
    public static void main(String[] args) {
        Scanner vals=new Scanner(System.in);//creates scanner object

        System.out.println("please enter the interest rate");
        int interest=vals.nextInt();
        System.out.println("please enter the initial amount");
        int initial_amount=vals.nextInt();
        System.out.println("please enter the time");
        int time=vals.nextInt();

        float simple_interest=time*initial_amount*interest;
        System.out.println("simple interest for the past "+time+" years with the initial as "+initial_amount+" and initial rate as "+ interest+ " is "+ simple_interest);
        
        vals.close();
    }

}
