package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    List<Integer> lists = Arrays.asList(2,3, 4,2,3,4);
    public void withoutStream(){
        long count = 0;
        for (Integer list: lists){
            if (list %2 == 0){
                count ++;
            }
        }
        System.out.println("There are %d elements that are even" + count);
    }
public void withStream(){
        long count = lists.stream().filter(num ->num %2==0).count();
    System.out.printf("There are %d elements that are even", count);
}
}
