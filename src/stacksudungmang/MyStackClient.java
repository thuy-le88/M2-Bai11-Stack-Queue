package stacksudungmang;

public class MyStackClient {
    public static void main(String[] as) throws Exception {
        MyStack number=new MyStack(5);
        number.push(5);
        number.push(4);
        number.push(3);
        number.push(2);
        //number.push(1);

        System.out.println(number.isEmpty());
        System.out.println();
        System.out.println(number.isFull());

        System.out.println("Size of stack number is: "+number.size());
        System.out.println("Elements in stack number: ");
        while (!number.isEmpty()) {
            //System.out.print(number.pop()+",");
            System.out.printf(" %d", number.pop());
        }



        System.out.println("\nSize of stack number after POP operations is: "+number.size());
    }
}
