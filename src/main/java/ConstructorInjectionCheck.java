public class ConstructorInjectionCheck {

    // Noncompliant - Field injection
    @Autowired
    private MyService myService;

    public ConstructorInjectionCheck() {
    }

    public void doSomething() {
        myService.performAction();
    }

    // Noncompliant - Setter injection
    private AnotherService anotherService;

    @Autowired
    public void setAnotherService(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    public void doAnotherThing() {
        anotherService.executeTask();
    }

    // Compliant - Constructor injection
    private final YetAnotherService yetAnotherService;

    @Autowired
    public ConstructorInjectionCheck(YetAnotherService yetAnotherService) {
        this.yetAnotherService = yetAnotherService;
    }

    public void doYetAnotherThing() {
        yetAnotherService.processData();
    }

    // Compliant - Constructor injection with multiple dependencies
    private final FirstService firstService;
    private final SecondService secondService;

    @Autowired
    public ConstructorInjectionCheck(FirstService firstService, SecondService secondService) {
        this.firstService = firstService;
        this.secondService = secondService;
    }

    public void doMultipleThings() {
        firstService.handleRequest();
        secondService.respond();
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
