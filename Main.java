/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
    public static void main(String args[])
    {
        String s = "29-02-2020";
        
        String[] date1 = s.split("-");
        int date[] = new int[3];
        
        for(int i = 0; i<date1.length; i++)
            date[i] = Integer.parseInt(date1[i]);

        if(date[2] >= 1900 && date[2] <= 9999)
        {
            if(date[1] >= 1 && date[1] <= 12)
            {
                if((date[0] >= 1 && date[0] <= 31) && (date[1] == 1 || date[1] == 3 || date[1] == 5 ||
                   date[1] == 7 || date[1] == 8 || date[1] == 10 || date[1] == 12))
                {
                    System.out.println("Valid Date");
                }
                else if((date[0] >= 1 && date[0] <= 30) && (date[1] == 4 || date[1] == 6 || 
                         date[1] == 9 || date[1] == 11))
                {
                    System.out.println("Valid Date");
                }
                
                else if((date[0] >= 1 && date[0] <= 28) && date[1] == 2)
                {
                    System.out.println("Valid Date");
                }
                else if((date[0] == 29  && date[1] == 2) && ((date[2] % 400 == 0)||
                        (date[2] % 4 == 0 && date[2] % 100!=0)))
                {
                    System.out.println("Valid Date");
                }
                else{
                    System.out.println("Invalid Date");
                }
                switch(date[1])
                {
                    case 1 : System.out.println("January");
                             break;
                    
                    case 2 : System.out.println("February");
                             break;
                             
                    case 3 : System.out.println("March");
                             break;
                    
                    case 4 : System.out.println("April");
                             break;
                    
                    case 5 : System.out.println("May");
                             break;
                             
                    case 6 : System.out.println("June");
                             break;
                    
                    case 7 : System.out.println("July");
                             break;
                             
                    case 8 : System.out.println("August");
                             break;
                    
                    case 9 : System.out.println("September");
                             break;
                    
                    case 10 : System.out.println("October");
                             break;
                    
                    case 11 : System.out.println("November");
                             break;
                    
                    case 12 : System.out.println("December");
                             break;
                }
            }
        }
    }
}