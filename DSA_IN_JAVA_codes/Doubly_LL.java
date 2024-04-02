
import java.util.Scanner;

public class Doubly_LL {
    Scanner sc = new Scanner(System.in);

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void Creation()
    {
         int data,n;
    do{
         System.out.print("Enter the data : ");
         data = sc.nextInt();
         Node new_node = new Node(data);
         if(head == null)
         {
            head = new_node;
            tail = new_node;
            //new_node.next =head;
         }
         else
         {
            

            System.out.print("For Insertion at Begin Enter 1 \nFor Insertion at Middle Enter 2 \nFor Insertion at End Enter 3 \nEnter :");
            int p = sc.nextInt();
               switch (p) {
                case 1:                      //At Begin
                    new_node.next=head;
                    head.prev = new_node;
                    head=new_node;
                    break;

                case 2:                              //At Middle
                    System.out.print("Enter the Position Do you want to insert:");
                    int a=sc.nextInt();
                    Node temp = head;
                    Node ptr = temp.next;
                    for(int i=0; i<(a-2);i++)
                    {
                        temp = ptr;
                        ptr=ptr.next;
                    }
                    new_node.prev=temp;
                    new_node.next = ptr;
                    temp.next = new_node;
                    ptr.prev=new_node;                 
                    
                    break;

                case 3:
                                                                    
                    /*while(temp1.next != null)           //at end  
                    {
                       temp1=temp1.next;
                    }*/

                    tail.next = new_node;
                    tail.prev=tail;
                    tail=new_node;
                    break;
                    
               }
         }
         System.out.print("Do you want to Enter the Data Again?? if yes then Press 1  :-");
         n=sc.nextInt();
     }while(n==1);

    }

    public void deletion()
    {
               
              if(head == null)
              {
                 System.out.println("Linked List is empty.");
               }
               else 
               {
                System.out.print("For Deletion at Begin Enter 1 \nFor Deletion at Middle Enter 2 \nFor Deletion at End Enter 3 \nEnter :");
                int p = sc.nextInt();
                switch (p) {
                    case 1:                      //At Begin
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev=null;
                        break;
    
                    case 2:                              //At Middle
                        
                        System.out.print("Enter the Position Do you want to Delete:");
                        int a=sc.nextInt();
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        for(int i =0;i<(a-2);i++)
                        {
                           temp1=ptr;
                           ptr=ptr.next;
                        }
                        temp1.next=ptr.next;
                        ptr.next.prev=temp1;
                        break; 
    
                    case 3:
                        Node temp2 = tail;                  //at end
                        temp2=temp2.prev;
                        temp2.next = null;
                        tail=temp2;
                        
                        break;
                   }
               }
               
                       
     }
    
    public void traversal(){
        Node temp=head;
        if(head == null)
        {
            System.out.println("LL Does not exist.");
        }
        else{

           do {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=null);
            
        }
    }
    public static void main(String args[])
    {
        int n1;
        Doubly_LL s =new Doubly_LL();
        Scanner sc1 = new Scanner(System.in);
      
        do{
        System.out.print("Enter 1 for Insert.\nEnter 2 for Delete.\nEnter 3 for Print.\nEnter:");
        int y=sc1.nextInt();
        switch(y){
            case 1:     //For insertion
                s.Creation();
                break;

            case 2:
                s.deletion();
                 break;

            case 3:
                  s.traversal();
                  break;

            }
            System.out.println("\nIf you want Exit Enter 2.");
            n1=sc1.nextInt();
        }while(n1 != 2);
       
    }
    
}
