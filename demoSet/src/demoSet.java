import java.util.*;
public class demoSet {
    public static void main(String[] args)
    {
        Integer number[] = {4,8,2,6,7,1,3,5};

        Set<Integer> numberSet = new HashSet<Integer>(Arrays.asList(number)); // using hashSet constructor to set the numbers

        System.out.println(numberSet);
    }
}
