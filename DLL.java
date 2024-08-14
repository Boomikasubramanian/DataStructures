import java.util.*;
public class Main{
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }
    Main(){
        head = null;
        tail =null;
    }

    public void insertbegin(int k) {
        Node newnode=new Node(k);

        if(head==null) {
            tail = newnode;
        }else {
            newnode.next = head;
            head.prev = newnode;
        }
        head = newnode;
    }
    public void insertposition(int pos,int d) {
        Node newnode=new Node(d);
        Node temp=head;
        for(int i=1;i<pos;i++) {
            temp=temp.next;
        }
        newnode.next = temp.next;
        temp.next.prev = newnode;

        temp.next = newnode;
        newnode.prev = temp;
    }
    public void deleteInitial ()
    {
        if (head == null)
        {
            System.out.println ("List is empty");
            return;
        }
        else
        {
            //testing for the presence of a single node in the list, If not, Then head and tail will be re-directed
            if (head != null)
            {
                head = head.next;
            }
            //if only one node exist both head and tail will be redirected to null
            else
            {
                head = null;
            }
        }
    }

    public void display(){
        Node temp = head;  //        Node temp = head-error; corrected-Node temp=head;

        while(temp!= null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");}
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        Main list=new Main();
        int num=n.nextInt();
        for(int i=0;i<num;i++)
        {
            int k=n.nextInt();
            list.insertbegin(k);
        }
        list.display();
        list.deleteInitial();
        list.display();
    }
}
