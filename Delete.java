import java.util.*;
class Main{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;

        }
    }
    Main(){
        head = null;
    }
    public void insertend(int val){
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
    public void deleteend() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
    public void deletebegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteposition(int d){
        Node temp = head;
        Node prev = null;
        for (int i=1;i<d+1;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;}
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;}
        System.out.println("Null");}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Main list = new Main();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            list.insertend(val);}
        System.out.println("Delete begin");
        list.deletebegin();
        list.display();
        System.out.println("Delete end");
        list.deleteend();
        list.display();
        System.out.println("Deleting position");
        int d=sc.nextInt();
        list.deleteposition(d);
        list.display();
    }
}

///prev.next = temp.next
