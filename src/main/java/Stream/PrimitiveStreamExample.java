package Stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        IntStream.range(1,4).forEach(System.out::print);
        IntStream.of(1,2,3).forEach(System.out::print);
        DoubleStream.of(1,2,3).forEach(System.out::print);
        LongStream.of(1,2,3).forEach(System.out::print);
        LongStream.range(1,4).forEach(System.out::print);
    }
}
