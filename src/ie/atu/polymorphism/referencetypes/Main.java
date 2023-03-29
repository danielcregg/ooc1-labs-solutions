/* 
 * Example of reference types
 * 
 * The variable original is a reference to a String object.
 * The variable copy is a reference to the same String object.
 * The variable modified is a reference to a new String object.
 * The variable input is a reference to the same String object.
 */
package ie.atu.polymorphism.referencetypes;

public class Main {
    public static void main(String[] args) {
        /* Create a Student object and assign it to the studentObject1 reference. Then 
         * create another Student reference studentObjectCopy and assign it the value
         * of studentObject1, so both references now point to the same Student object. 
         */
        Student studentObject1 = new Student(123456);
        Student studentObjectCopy = studentObject1;
        // Print the reference value of both objects
        System.out.println("studentObject1 memory address = :\t" + System.identityHashCode(studentObject1)); 
        System.out.println("studentObjectCopy memory address = :\t" + System.identityHashCode(studentObjectCopy));
        // Print the student ID of both objects
        System.out.println("studentObject1 Student ID = :\t\t" + studentObject1.getStudentID());
        System.out.println("studentObjectCopy Student ID = :\t" + studentObjectCopy.getStudentID());

        studentObjectCopy.setStudentID(999999);
        // Print the reference value of both objects
        System.out.println("studentObject1 memory address = :\t" + System.identityHashCode(studentObject1)); 
        System.out.println("studentObjectCopy memory address = :\t" + System.identityHashCode(studentObjectCopy));
        // Print the student ID of both objects
        System.out.println("studentObject1 Student ID = :\t\t" + studentObject1.getStudentID());
        System.out.println("studentObjectCopy Student ID = :\t" + studentObjectCopy.getStudentID());

        // If you change the value of one reference by assigning it a new value using 
        // the = operator, it will no longer point to the same string object as the 
        // other reference. In Java, you cannot change the value of a reference without
        //  using the = operator. 
        studentObjectCopy = new Student(888888);
        /// Print the reference value of both objects
        System.out.println("studentObject1 memory address = :\t" + System.identityHashCode(studentObject1)); 
        System.out.println("studentObjectCopy memory address = :\t" + System.identityHashCode(studentObjectCopy));
        // Print the student ID of both objects
        System.out.println("studentObject1 Student ID = :\t\t" + studentObject1.getStudentID());
        System.out.println("studentObjectCopy Student ID = :\t" + studentObjectCopy.getStudentID());

    }
}
