import java.util.Scanner.*;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;
public class Stacksproblem {
    public void StackPush()

    {
        Stack<Integer> stk= new Stack<>();
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
// pushing elements into stack
        stk.push(70);
        stk.push(30);
        stk.push(56);
        System.out.println("Elements in Stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty? " + result);
    }


    public void StackPop()
    {
        Stack <Integer> stk = new Stack<>();
        System.out.println("stack: " + stk);
//pushing elements into the stack
        pushelmnt(stk, 70);
        pushelmnt(stk, 30);
        pushelmnt(stk, 56);

//popping elements from the stack
        popelmnt(stk);
        popelmnt(stk);
//throws exception if the stack is empty
        try
        {
            popelmnt(stk);
        }
        catch (EmptyStackException e)
        {
            System.out.println("empty stack");
        }
    }
    //performing push operation
    static void pushelmnt(Stack stk, int x)
    {

        System.out.println("stack: " + stk);
    }

    static void popelmnt(Stack stk)
    {
        System.out.print("pop -> ");

        Integer x = (Integer) stk.pop();
        System.out.println(x);

        System.out.println("stack: " + stk);
    }



    public static void main(String[] args)
    {
        Stacksproblem stk=new Stacksproblem();
        stk.StackPush();
        stk.StackPop();
    }
}

