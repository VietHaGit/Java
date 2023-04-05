package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {

//        Distinct method: Được dùng để loại bỏ các phần tử trùng lặp.
        List<Integer> list = Arrays.asList(1,2,2,2,4,3);
        list.stream().distinct().forEach(System.out::println);

//        Filter method: Dùng để lọc và xóa bỏ các phần tử với điều kiện do người dùng định nghĩa.
        list.stream().distinct().filter(num -> num >2).forEach(System.out::println);

//        Sorted method: Dùng cho việc sắp xếp các phần tử. Sắp xếp giảm dần vs comparator
      list.stream().distinct().sorted(Comparator.comparing(o->(int)o).reversed()).forEach(System.out::println);
        list.stream().distinct().sorted((s1,s2) -> s2.intValue() - s1.intValue()).forEach(System.out::println);

//        Limit method: limit(n) với tham số đầu vào là số nguyên không âm n nó sẽ trả về một stream chứa n phần tử đầu tiên.
        list.stream().limit(3).forEach(System.out::println);


//        Skip method: skip(n) với tham số truyền vào là số nguyên không âm n nó sẽ trả về các phần tử còn lại đằng sau n phần tử đầu tiên.
        list.stream().skip(3).forEach(System.out::println);



//        Stream map() giúp ánh xạ các phần tử tới các kết quả tương ứng.
        list.stream().map(num->num>1).forEach(System.out::println);

    }
}
