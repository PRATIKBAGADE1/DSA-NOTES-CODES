import java.util.Scanner;
class Array
{

   int top = -1;
   int n = 4;
   int arr[] =new int[n];

   void push(Scanner sc)
   {
       if(top == (n-1))
       {
           System.out.println("Overflow.");
       }
       else{
           System.out.println("Enter the Data:");
           int i = sc.nextInt();
           top = top+1;
           arr[top]=i;

           System.out.println("Item inserted");
       }
   }

   void pop()
   {
       if(top == -1)
       {
           System.out.println("Underflow");
       }
       else{
           top = top-1;
           System.out.println("Item Poped");
       }

   }

   void display()
   {
       System.out.println("\nItems are:");
       for(int j=top;j>=0;j--)
       {
           System.out.println(arr[j]+" ");
       }
   }
}

public class Stack_LL {

   
   public static void main(String args[])
   {
       int n1;
       Scanner sc = new Scanner(System.in);

       Array a =new Array();
       do{
           System.out.print("Enter 1 for Insert:\nEnter 2 for Delete:\nEnter 3 for Display:");
           int p = sc.nextInt();
           switch(p)
           {
               case 1:
                   a.push(sc);
                   break;

               case 2:
                    a.pop();
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
