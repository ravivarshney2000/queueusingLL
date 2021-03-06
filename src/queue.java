import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
public class queue
{
    Node front,rear;
    queue()
    {
        front=null;
        rear=null;
    }
    void insertatlast()
    {
        System.out.println("Enter data");
        Scanner sc2=new Scanner(System.in);
        int item= sc2.nextInt();
        Node newnode=new Node();
        newnode.data=item;
        newnode.next=null;
        if (front==null || rear==null)
        {
            front=newnode;
            rear=newnode;
        }
        else
        {
            Node current =front;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
        System.out.println("data inserted........");
    }
    void deleteatbegin()
    {
        if (front==null)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("deleted :"+front.data);
            front=front.next;
        }
    }
    void traverse()
    {
        if (front==null || rear==null)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("------------elements-------------");
            for (Node current=front;current!=null;current=current.next)
            {
                System.out.print(" "+current.data);
            }
        }
    }
    public static void main(String[] args) {
        queue obj=new queue();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Enter ur choice");
            int ch= sc.nextInt();
            switch(ch)
            {
                case 1 ->obj.insertatlast();
                case 2 ->obj.deleteatbegin();
                case 3 ->obj.traverse();
                case 4 ->System.exit(0);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}