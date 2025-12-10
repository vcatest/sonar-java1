public class SelectorMethodArgumentCheck {

    // Noncompliant - Using 'this' as an argument to a selector method.
    public void nonCompliantExample1(String selector) {
        WebElement element = findElement(this, selector);
    }

    private WebElement findElement(SelectorMethodArgumentCheck instance, String selector) {
        return null;
    }

    // Noncompliant - Passing the class itself as an argument to a selector method.
    public void nonCompliantExample2(String selector) {
        WebElement element = findElement(SelectorMethodArgumentCheck.class, selector);
    }

    private WebElement findElement(Class<?> clazz, String selector) {
        return null;
    }

    // Compliant - Passing a valid WebElement as an argument.
    public void compliantExample1(String selector, WebElement element) {
        WebElement foundElement = findElement(element, selector);
    }

    private WebElement findElement(WebElement element, String selector) {
        return null;
    }

    // Compliant - Passing a valid object that is not 'this' or the class itself.
    public void compliantExample2(String selector, MyObject obj) {
        WebElement element = findElement(obj, selector);
    }

    private WebElement findElement(MyObject obj, String selector) {
        return null;
    }

    private static class MyObject {
        // Dummy class for compliant example
    }

    private static class WebElement {
        //Dummy class for examples
    }
}
