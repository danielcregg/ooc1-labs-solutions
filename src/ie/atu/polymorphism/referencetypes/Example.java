/* 
 * Example of reference types
 * 
 * The variable original is a reference to a String object.
 * The variable copy is a reference to the same String object.
 * The variable modified is a reference to a new String object.
 * The variable input is a reference to the same String object.
 */
package ie.atu.polymorphism.referencetypes;

public class Example {
    public static void main(String[] args) {
        String original = "original";
        String copy = original;
        String modified = modify(copy);
        System.out.println(original);
        System.out.println(copy);
        System.out.println(modified);
    }

    public static String modify(String input) {
        input = "modified";
        return input;
    }
}
