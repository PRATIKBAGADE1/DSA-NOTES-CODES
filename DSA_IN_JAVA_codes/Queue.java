
import java.util.Scanner;
class Queuee
{

   int f = -1,r=-1;
   int n = 5;
   int arr[] =new int[n];

   void enqueue(Scanner sc)
   {
       if(r == (n-1))
       {
           System.out.println("Overflow.");
       }
       else{
           System.out.println("Enter the Data:");
           int i = sc.nextInt();
           if(f==-1 && r==-1)
           {
            f=0;
            r=0;
            arr[r]=i;
           }
           else{
            r=r+1;
            arr[r]=i;
           }

           System.out.println("Item inserted");
       }
   }

   void dequeue()
   {
       if(f==-1 && r==-1)
       {
           System.out.println("Underflow");
       }
       else{
           f=f+1;
           System.out.println("Item Deleted ");
       }

   }

   void display()
   {
       System.out.println("\nItems are:");
       for(int j=f;j<=r;j++)
       {
           System.out.print(arr[j]+" ");
       }
   }
}

public class Queue {

   
   public static void main(String args[])
   {
       int n1;
       Scanner sc = new Scanner(System.in);

       Queuee a =new Queuee();
       do{
           System.out.print("Enter 1 for Enqueue:\nEnter 2 for Dequeue:\nEnter 3 for Display:");
           int p = sc.nextInt();
           switch(p)
           {
               case 1:
                   a.enqueue(sc);
                   break;

               case 2:
                    a.dequeue();
                    break;

               case 3:
                    a.display();
                    break;

               default:
                    System.out.println("You Enter a wrong Choice,Please Enter Again:");
                   
           }
           System.out.print("Enter 0 for exit OR Enter any key to Continue:");
           n1 = sc.nextInt();

       }while(n1 != 0);
       System.out.println("Exited Successfully.");
      
   }
   
}
