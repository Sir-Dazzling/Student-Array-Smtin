
package student.array.smtin;

import java.util.Scanner;

/**
 *
 * @author DazzlingStar
 */
public class StudentArraySmtin 
{
    public static String inputname;
    
    public static void main(String[] args) 
    {
        int size;
        
        StudentArraySmtin app = new StudentArraySmtin();
       Scanner input = new Scanner(System.in);
       System.out.println("How many names do u want to add?");
       size = input.nextInt();
       
       String id[] = new String[size];
       String name[] = new String[size];
       String course[] = new String[size] ;
       
       
       //to loop the number of times user enters d name into name Array.
       for(int i=0; i<size;i++ )
       {
           System.out.println("Please Enter  Name"+(i+1));
           name[i] = input.next();
           System.out.println("Please Enter  Id"+(i+1));
           id[i] = input.next();
           System.out.println("Please Enter  Course"+(i+1));
           course[i] = input.next();
       }
           
          //To check if Name is in Array
          System.out.println("Please Enter The name you want to search details for ");
          inputname = input.next();
          app.isIn(name,id,course, inputname);
    }
    
    public void isIn(String arr[],String arr2[],String arr3[], String x)
    {
         for(int i=0; i<arr.length; i++)
        {
            if(arr[i].equalsIgnoreCase(x)|| arr2[i].equalsIgnoreCase(x)||arr3[i].equalsIgnoreCase(x))
            {
               System.out.println("Your name is  "+arr[i]+" and your Id is "+arr2[i]+" and your Course is "+arr3[i]);
            }
            else
            {
               // System.out.println("Not Found");
            }
        }
    }
    
}
