package LinkList;

class SLLDelDemo {

    static class Node {
        String name;
        Node next;
    }

    public static void main(String[] args) {

        // Build Figure 6's singly linked list (i.e., B A D C)
        Node top = new Node();
        top.name = "C";
        top.next = null;

        Node temp = new Node();
        temp.name = "D";
        System.out.println("top : " + top.hashCode());
        temp.next = top;
        System.out.println("temp : " + temp.hashCode());
        top = temp;

        temp = new Node();
        temp.name = "A";
        temp.next = top;
        top = temp;

        temp = new Node();
        temp.name = "B";
        temp.next = top;
        top = temp;
        dump("Initial singly-linked list", top);

        // 1. Delete the first node
        top = top.next;
        dump("After first node deletion", top);

        // Put back B
        temp = new Node();
        temp.name = "B";
        temp.next = top;
        top = temp;

        // 2. Delete any node but the first node
        temp = top;
        while (temp.name.equals("A") == false)
            temp = temp.next;
        temp.next = temp.next.next;
        dump("After D node deletion", top);
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