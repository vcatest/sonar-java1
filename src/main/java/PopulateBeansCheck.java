public class PopulateBeansCheck {

    // Noncompliant - Direct field assignment within a method.
    public void nonCompliantExample1(MyBean bean, String value) {
        bean.name = value;
    }

    // Noncompliant - Direct field assignment in a loop.
    public void nonCompliantExample2(MyBean[] beans, String[] values) {
        for (int i = 0; i < beans.length; i++) {
            beans[i].age = values[i]; // Noncompliant
        }
    }

    // Compliant - Using setter methods.
    public void compliantExample1(MyBean bean, String value) {
        bean.setName(value);
    }

    // Compliant - Using builder pattern.
    public void compliantExample2(String name, int age) {
        MyBean bean = new MyBean.Builder().name(name).age(age).build();
    }

    static class MyBean {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static class Builder {
            private String name;
            private int age;

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Builder age(int age) {
                this.age = age;
                return this;
            }

            public MyBean build() {
                return new MyBean(name, age);
            }
        }

        private MyBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
