package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToStreamExample {
    public static void main(String[] args) {
        /*String[] languages = {"Java", "C#", "C++", "PHP", "Javascript" };

        Stream<String> test = Arrays.stream(languages);
        test.forEach(x -> System.out.println(x));

        Stream<String> test2 = Stream.of(languages);
        test2.forEach(x -> System.out.println(x));


//       Collect Dùng để trả về kết quả của stream dưới dạng List hoặc Set.
        List<String> list = Arrays.asList("cat", "Dog","crow");
        List<String> list1 =list.stream().collect(Collectors.toList());


//        forEach dùng để duyệt qua mọi phần tử trong stream
        list1.stream().forEach(s -> System.out.println(s));

//        Reduce dùng để kết hợp các phần tử thành một giá trị đơn cùng kiểu vs kiểu dữ liệu ban đầu

        String result = list.stream().reduce("_", String::concat);
        list.stream().forEach(s -> System.out.println(result));
         */
//  tạo Stream qua một cấu trúc dữ liệu khác
        Stream<String> stream = Stream.of("java", "PHP","C#");
        List<String> languages = stream.collect(Collectors.toList());
        System.out.println(languages);


    }
}
