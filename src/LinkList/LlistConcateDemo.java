package LinkList;

public class LlistConcateDemo {

    static class Node {
        String name;
        Node next;
    }

    public static void main(String[] args) {

        Node node1 = createFirstList();
        Node node2 = createSecondList();

        while (node1.next == null){

        }

    }

    private static Node createFirstList() {
        Node top1 = new Node();
        top1.name = "A";
        top1.next = null;

        Node temp = new Node();
        temp.name = "B";
        //System.out.println("top : " + top1.hashCode());
        temp.next = top1;
        //System.out.println("temp : " + temp.hashCode());
        top1 = temp;

        temp = new Node();
        temp.name = "C";
        temp.next = top1;
        top1 = temp;

        temp = new Node();
        temp.name = "D";
        temp.next = top1;
        top1 = temp;
        dump("Initial singly-linked list", top1);

        return top1;
    }


    private static Node createSecondList() {
        Node top2 = new Node();
        top2.name = "A1";
        top2.next = null;

        Node temp = new Node();
        temp.name = "B1";
        //System.out.println("top : " + top1.hashCode());
        temp.next = top2;
        //System.out.println("temp : " + temp.hashCode());
        top2 = temp;

        temp = new Node();
        temp.name = "C1";
        temp.next = top2;
        top2 = temp;

        temp = new Node();
        temp.name = "D1";
        temp.next = top2;
        top2 = temp;
        dump("Initial singly-linked list", top2);

        return top2;
    }

    static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");
        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }
}
