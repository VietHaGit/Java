package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamFromCollection {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
        items.stream().forEach(item -> System.out.println(item));
    }

    public static void streamUsingGenerate(){
        Stream<String> stream = Stream.generate(() ->"gpcoder").limit(3);

    }
}

