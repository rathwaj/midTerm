/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{
 public double x,y;
    double calculate(double x, double y) 
        {

        for(int s=1;s<5;s++){
        if(s == 1){
        double rslt ;
        rslt = x + y;
        System.out.println("result :" +rslt);
        }
        if(s == 2){
        double rslt1 ;
        rslt1 = x - y;
        System.out.println("result :" +rslt1);
        }
        if(s == 3){
        double rslt2 ;
        rslt2 = x - y;
        System.out.println("result :" +rslt2);
        }
        if(s == 4){
        double rslt3 ;
        rslt3 = x - y;
        System.out.println("result :" +rslt3);
        }
        }
                //throw new AssertionError("Unknown operations " + this);
     return 0;
        
   
}
}