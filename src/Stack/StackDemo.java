package Stack;

public class StackDemo {

    public static void main(String[] args) {

        System.out.println("ArrayStack Demo");
        System.out.println("---------------");
        stackDemo(new ArrayStack(5));

        System.out.println("LinkedListStack Demo");
        System.out.println("--------------------");
        stackDemo(new LinkedListStack());
    }

    private static void stackDemo(Stack s) {

        System.out.println("Pushing \"Hello\"");
        s.push("Hello");
        System.out.println("Pushing \"World\"");
        s.push("World");
        System.out.println("Pushing StackDemo object");
        s.push(new StackDemo());
        System.out.println("Pushing Character object");
        s.push('C');
        System.out.println("Pushing Thread object");
        s.push(new Thread("A"));

        try {
            System.out.println("Pushing \"One last item\"");
            s.push("One last item");
        } catch (FullStackException e) {
            System.out.println("One push too many");
        }

        System.out.println();
        while (!s.isEmpty())
            System.out.println(s.pop());
        try {
            s.pop();
        } catch (java.util.EmptyStackException e) {
            System.out.println("One pop too many");
        }
        System.out.println();
    }
}
