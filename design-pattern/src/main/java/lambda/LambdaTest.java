package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by felix on 18.02.17.
 */
public class LambdaTest {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("1","2","3","4","5");
        List<String> list2 = Arrays.asList("a","b","c","d","e");

        Model model1 = new Model();
        model1.setEntries(list1);
        Model model2 = new Model();
        model2.setEntries(list2);

        printFlatMap(model1, model2);

        printMatch(list1);

        printSupplier();

        printFunction();

        printPredicate();

        printConsumer();
    }

    private static void printMatch(List<String> list1) {
        boolean anymatch = list1.stream().anyMatch(item -> item.contains("3"));
        boolean allmatch = list1.stream().allMatch(item -> item.contains("3"));
        System.out.println(anymatch + " " + allmatch);
    }

    private static void printConsumer() {
        consumerTest().accept("2");
    }

    private static void printPredicate() {
        System.out.println(predicateTest().test(-1));
        System.out.println(predicateTest().test(1));
    }

    private static void printFunction() {
        System.out.println(functionTest().apply("1000"));
    }

    private static void printSupplier() {
        Supplier<String> supplierString = supplierTest();
        System.out.println(supplierString.get());
    }

    private static void printFlatMap(Model model1, Model model2) {
        List<Model> models = Arrays.asList(model1, model2);
        List<String> result = models.stream().map(Model::getEntries)
                .flatMap(item -> item.stream())
                .collect(Collectors.toList());
        result.forEach(item -> System.out.println(item));
    }

    private static Function<String, Integer> functionTest(){
        return input -> Integer.valueOf(input)*2;
    }

    private static Predicate<Integer> predicateTest() {
        return input -> input>0;
    }

    private static Consumer<String> consumerTest(){
        return number -> {
            System.out.println(Integer.valueOf(number)*Integer.valueOf(number));
        };
    }

    private static Supplier<String> supplierTest(){
        return new Supplier<String>() {
            @Override
            public String get() {
                return "Test";
            }
        };
    }

    public static class Model {

        List<String> entries;

        public List<String> getEntries() {
            return entries;
        }

        public void setEntries(List<String> entries) {
            this.entries = entries;
        }
    }
}


