import java.util.*;
public class Stack1{
    public static void main (String[] args){
        Stack<Integer> sttack=new Stack<>();
        sttack.push(1);
        sttack.push(2);
        sttack.push(69);
        System.out.println(sttack);
        while(!sttack.isEmpty()){
            System.out.println(sttack.pop());

        }
    }

}