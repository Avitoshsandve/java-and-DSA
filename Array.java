import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int[] marks = {1,2,3,4,5};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks.length);
        System.out.println(Arrays.toString(marks));
        Arrays.sort(marks);
    
}
}
