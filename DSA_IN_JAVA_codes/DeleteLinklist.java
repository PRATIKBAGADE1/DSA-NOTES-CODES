import java.util.Scanner;

public class DeleteLinklist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void creation(){
        int data,n;
        do{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the data: ");
            data = s.nextInt();
            Node new_node =new Node(data);
            if(head == null)
            {
               head = new_node;
            }
            else
            {
              new_node.next = head;
              head = new_node;
            }
            System.out.print("Do you want to Enter the Data Again?? if yes then Press 1  :-");
            n=s.nextInt();
        
          }while(n==1);
        }

    public void deletion()
    {
               
              Scanner sc = new Scanner(System.in);
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
                        break; 
    
                    case 3:
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        while(ptr1.next!=null)
                        {
                            temp2=ptr1;
                            ptr1=ptr1.next;
                        }
                        temp2.next=null;
                        
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
            while(temp!=null)
            {
                System.out.print(temp.data+" ->");
                temp=temp.next;
            }
            System.out.print("Null");
        }
    }
    public static void main(String args[]) {
        DeleteLinklist Dl = new DeleteLinklist();
        Dl.creation();
        Dl.deletion();
        Dl.traversal();
        
    }
}
