public class ChildClassShadowFieldCheck {

    // Noncompliant - Shadowing a field from the superclass
    public class Parent {
        public int value;
    }

    public class Child extends Parent {
        public int value; // Noncompliant
        public void someMethod() {
            this.value = 10;
        }
    }

    // Noncompliant - Shadowing another field from the superclass
    public class Base {
        public String name;
    }

    public class Derived extends Base {
        public String name; // Noncompliant
        public void printName() {
            System.out.println(this.name);
        }
    }

    // Compliant - No shadowing of fields
    public class Grandparent {
        public int age;
    }

    public class ParentClass extends Grandparent {
        public int height;
        public void display() {
            System.out.println("Height: " + height + ", Age: " + age);
        }
    }

    // Compliant - Using different names for fields
    public class Animal {
        public String species;
    }

    public class Dog extends Animal {
        public String breed;
        public void bark() {
            System.out.println("Woof! I am a " + breed + " " + species);
        }
    }
}
