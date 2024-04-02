import java.util.Scanner;
public class LinklistCreation {
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
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the data: ");
            data = sc.nextInt();
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
    
    public static void main(String args[]){
        LinklistCreation s =new LinklistCreation();
        s.creation();
        s.traversal();

    }
    
}
