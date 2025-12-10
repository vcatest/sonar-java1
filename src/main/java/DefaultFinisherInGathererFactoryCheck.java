public class DefaultFinisherInGathererFactoryCheck {

    // Noncompliant - Using DefaultFinisher directly in a factory method.
    public static class NoncompliantExample1 {
        public static MyGatherer createGatherer() {
            return new MyGatherer(new DefaultFinisher()); // Noncompliant
        }
    }

    // Noncompliant - Another instance of using DefaultFinisher directly.
    public static class NoncompliantExample2 {
        private final Finisher finisher;

        public NoncompliantExample2() {
            this.finisher = new DefaultFinisher(); // Noncompliant
        }

        public Finisher getFinisher() {
            return finisher;
        }
    }

    // Compliant - Using an interface for the finisher.
    public static class CompliantExample1 {
        public static MyGatherer createGatherer(Finisher finisher) {
            return new MyGatherer(finisher);
        }
    }

    // Compliant - Injecting the finisher via constructor.
    public static class CompliantExample2 {
        private final Finisher finisher;

        public CompliantExample2(Finisher finisher) {
            this.finisher = finisher;
        }

        public Finisher getFinisher() {
            return finisher;
        }
    }

    interface Finisher {
        void finish();
    }

    static class DefaultFinisher implements Finisher {
        @Override
        public void finish() {
            // Default finishing logic
        }
    }

    static class MyGatherer {
        private final Finisher finisher;

        public MyGatherer(Finisher finisher) {
            this.finisher = finisher;
        }

        public void gatherAndFinish() {
            // Gather data
            finisher.finish();
        }
    }
}
