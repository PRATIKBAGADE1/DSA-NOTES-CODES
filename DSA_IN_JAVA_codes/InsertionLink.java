import java.util.Scanner;

public class InsertionLink {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void Creation()
    {
         int data,n;
    do{
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the data : ");
         data = sc.nextInt();
         Node new_node = new Node(data);
         if(head == null)
         {
            head = new_node;
         }
         else
         {
            

            System.out.print("For Insertion at Begin Enter 1 \nFor Insertion at Middle Enter 2 \nFor Insertion at End Enter 3 \nEnter :");
            int p = sc.nextInt();
               switch (p) {
                case 1:                      //At Begin
                    new_node.next=head;
                    head = new_node;
                    break;

                case 2:                              //At Middle
                    System.out.print("Enter the Position Do you want to insert:");
                    int a=sc.nextInt();
                     Node temp = head;
                    for(int i=0; i<(a-2);i++)
                    {
                        temp = temp.next;
                    }
                    new_node.next=temp.next;
                    temp.next=new_node;
                    break;

                case 3:
                    Node temp1 = head;           //at end
                    while(temp1.next != null)
                    {
                       temp1=temp1.next;
                    }
                    temp1.next = new_node;
                    break;
                    
               }
         }
         System.out.print("Do you want to Enter the Data Again?? if yes then Press 1  :-");
         n=sc.nextInt();
     }while(n==1);

    }
    
    public void traversal(){
        Node temp=head;
        if(head == null)
        {
            System.out.println("LL Does not exist.");
        }
        else{
            while(temp!=null)
            {
                System.out.print(temp.data+" ->");
                temp=temp.next;
            }
            System.out.print("Null");
        }
    }
    public static void main(String args[])
    {
        InsertionLink s =new InsertionLink();
        s.Creation();
        s.traversal();
    }
    
}
