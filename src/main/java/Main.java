import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш абборигенский текст!");
        String s1 = reader.readLine();

        Function <String, List<String>> function = string -> Arrays.stream(string.split(" "))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList()); //используем детерминированную функцию и стримы (монады) а так же
        //лямбда-выражения
        System.out.println(function.apply(s1).toString());
    }
}
