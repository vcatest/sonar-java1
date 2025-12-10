import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorInjectionCheck {

    // Example 1: Noncompliant - Field injection
    static class FieldInjectionExample {
        @Autowired
        private MyService myService;

        public void doSomething() {
            myService.performAction();
        }
    }

    // Example 2: Noncompliant - Setter injection
    static class SetterInjectionExample {
        private AnotherService anotherService;

        @Autowired
        public void setAnotherService(AnotherService anotherService) {
            this.anotherService = anotherService;
        }

        public void doAnotherThing() {
            anotherService.executeTask();
        }
    }

    // Example 3: Compliant - Constructor injection
    static class ConstructorInjectionExample {
        private final YetAnotherService yetAnotherService;

        @Autowired
        public ConstructorInjectionExample(YetAnotherService yetAnotherService) {
            this.yetAnotherService = yetAnotherService;
        }

        public void doYetAnotherThing() {
            yetAnotherService.processData();
        }
    }

    // Example 4: Compliant - Constructor injection with multiple dependencies
    static class MultipleConstructorInjectionExample {
        private final FirstService firstService;
        private final SecondService secondService;

        @Autowired
        public MultipleConstructorInjectionExample(FirstService firstService, SecondService secondService) {
            this.firstService = firstService;
            this.secondService = secondService;
        }

        public void doMultipleThings() {
            firstService.handleRequest();
            secondService.respond();
        }
    }

    interface MyService {
        void performAction();
    }

    interface AnotherService {
        void executeTask();
    }

    interface YetAnotherService {
        void processData();
    }

    interface FirstService {
        void handleRequest();
    }

    interface SecondService {
        void respond();
    }
}
