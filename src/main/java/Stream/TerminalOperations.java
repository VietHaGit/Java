package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        /*
//        Max, Min method: Trả về giá trị lớn nhất hoặc bé nhất trong các phần tử.
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        Integer max = integers.stream().max(Integer::compare).get();
        Integer min = integers.stream().min(Integer::compare).get();
        System.out.println("Max:"+max+"\nMin:"+min);
         */
//        Stream<String> stream = Stream.of("Java","C#"," C++");
//        List<String> languages = stream.collect(Collectors.toList());
//        System.out.println(languages);

// anyMatch trả về boolean tùy thuộc vào điều kiện của Stream. Trả về true khi phần tử đầu tiên thõa mãn đk.
//        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
//        boolean result = data.stream().anyMatch((s) -> s.equalsIgnoreCase("Java"));
//        System.out.println(result);
//        allMatch trả về true nếu tất cả phần tử thõa mãn điều kiện
//        nonMatch trả về true nếu tất cả các phần tử không thõa mãn điều kiện

//        Count() dùng để trả số phần tử về cho luồng
//        List<Integer> stream = Arrays.asList(2,3,4,5,6);
//        long count = stream.stream().filter(num ->num % 3 ==0).count();
//        System.out.println("Count =" + count);

        Integer []numbers = {1,3,2,4,5,6,7};

        Integer maxNumber = Stream.of(numbers).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxNumber);

        Integer minNumber = Stream.of(numbers).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minNumber);




    }
}
