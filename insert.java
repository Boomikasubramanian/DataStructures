import java.util.*;
class linkedlist
{
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    public void insertbegin(int k){
        Node newnode = new Node(k);

        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
        public void insertposition(int pos,int d){
            Node newnode = new Node(d);
            Node temp = head;
            for(int i =1;i<pos;i++){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next= newnode;
        }
    public void insertend(int val)
    {
        Node newnode = new Node(val);

        if (head ==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = newnode;
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist();
        int n = sc.nextInt();
        for(int i =0;i<n;i++) {
            int val = sc.nextInt();
            list.insertbegin(val);//insert begin
        }
        System.out.println("Insert at begin");
        list.display();
//insert end
        int k=sc.nextInt();
        System.out.println("Insert at end");
        list.insertend(k);
        list.display();
//insert pos
        int d=sc.nextInt();
        int pos=sc.nextInt();
        System.out.println("Insert at position");
        list.insertposition(pos,d);
        list.display();
    }
}
