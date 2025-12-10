public class AnonymousClassesTooBigCheck {

    public void nonCompliantExample1() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // Noncompliant
                for (int i = 0; i < 100; i++) {
                    System.out.println("Iteration " + i);
                    if (i % 2 == 0) {
                        System.out.println("Even number");
                    } else {
                        System.out.println("Odd number");
                    }
                    // More code to make it bigger
                    String longString = "This is a very long string to increase the size of the anonymous class.  It needs to be long enough to trigger the rule.";
                    System.out.println(longString);
                }
            }
        };
        new Thread(task).start();
    }

    public void nonCompliantExample2() {
        new Object() {
            @Override
            public String toString() {
                // Noncompliant
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 50; i++) {
                    sb.append("This is line ").append(i).append("\n");
                }
                return sb.toString();
            }

            public void someMethod() {
                System.out.println("Another method in the anonymous class");
                //More code to increase size
                int[] largeArray = new int[200];
                for(int i = 0; i < largeArray.length; i++){
                    largeArray[i] = i;
                }
            }
        };
    }

    public void compliantExample1() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Simple task");
            }
        };
        new Thread(task).start();
    }

    public void compliantExample2() {
        new Object() {
            @Override
            public String toString() {
                return "Simple object";
            }
        };
    }
}
