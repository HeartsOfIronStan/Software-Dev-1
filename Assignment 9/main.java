import java.util.Stack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();

        stax.push(70);
        stax.push(34);
        stax.push(807);//
        stax.push(61);
        stax.push(28);//
        stax.push(563);
        stax.push(492);
        stax.push(386);

        stax.pop(); //386
        stax.pop(); //492
        stax.pop();//563
        System.out.println(stax.pop()); //28
        stax.pop();//61
        System.out.println(stax.pop()); //807

        System.out.println("There are 8 stacks.");




        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);
        System.out.println(linky.get(2));

        //grocery cart example
        Stack<Integer> carts = new Stack<>();

        carts.push(1);
        carts.push(2);
        carts.push(3);
        carts.push(4);
        carts.push(5);

        //comes and grabs a cart

        carts.pop();

        System.out.println(carts);
    }
}
