public class Linked_list {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public void insertion(int data){

        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = NewNode;
        }
    }


    public void deletion(int info){

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head.data == info){
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;
        while(temp != null && temp.data != info){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("value not found");
            return;
        }
        prev.next = temp.next;
    }


    public void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.insertion(10);
        list.insertion(20);
        list.insertion(30);
        list.insertion(40);
        list.insertion(50);

        System.out.println("linked list after insertion of items");
        list.display();

        list.deletion(20);
        System.out.println("list after deletion of item");
        list.display();
    }
}
