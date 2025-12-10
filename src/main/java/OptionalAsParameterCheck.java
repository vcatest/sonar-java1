import java.util.Optional;
import java.util.List;

public class OptionalAsParameterCheck {

    // Noncompliant
    public void method1(Optional<String> optionalString) {
        if (optionalString.isPresent()) {
            System.out.println(optionalString.get());
        }
    }

    // Noncompliant
    public String method2(Optional<Integer> optionalInt) {
        return optionalInt.map(String::valueOf).orElse("0");
    }

    // Compliant
    public void method3(String str) {
        if (str != null) {
            System.out.println(str);
        }
    }

    // Compliant
    public String method4(Integer num) {
        return String.valueOf(num == null ? 0 : num);
    }

    // Noncompliant
    public void method5(Optional<List<String>> optionalList) {
        optionalList.ifPresent(list -> list.forEach(System.out::println));
    }

    // Compliant
    public void method6(List<String> list) {
        if (list != null) {
            list.forEach(System.out::println);
        }
    }
}
