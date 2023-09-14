import java.util.*;
public class conditionloop {
    public static void main(String[] args) {
        /*
        syntax of if statement:
        if (boolean expression t or f){
        // code
        }
        else{
        //do this
        }

        */
//        int salary = 25400;
//        if(salary > 10000)
//        {
//           salary += 2000; //we cn write as the condition (salary = salary+2000;)
//        }
//        else{
//            salary = salary + 1000; // salary += 1000;

            // multiple if else statement
        int salary = 25400;
        if(salary > 10000)
        {
            salary += 2000; //we cn write as the condition (salary = salary+2000;)
        }
        else if (salary > 20000){
            salary = salary + 3000; // salary += 1000;

        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
