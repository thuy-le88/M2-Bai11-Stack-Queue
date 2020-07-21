package mylinkedliststack;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack1=new MyGenericStack<>();
        stack1.push("Five");
        stack1.push("Four");
        stack1.push("Three");
        stack1.push("Two");
        stack1.push("One");

        System.out.println("Size of stack 1 is: "+stack1.size());
        System.out.println("Elements in stack 1: ");
        while (!stack1.isEmpty())
            System.out.println(stack1.pop());

        System.out.println("Size of stack 1 after POP operations is: "+stack1.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack2=new MyGenericStack<>();
        stack2.push(5);
        stack2.push(4);
        stack2.push(3);
        stack2.push(2);
        stack2.push(1);

        System.out.println("Size of stack 2 is: "+stack2.size());
        System.out.println("Elements in stack 2: ");
        while (!stack2.isEmpty())
            System.out.println(stack2.pop());

        System.out.println("Size of stack 2 after POP operations is: "+stack2.size());
    }

    public static void main(String[] args) {
        stackOfStrings();
        stackOfIntegers();
    }
}
