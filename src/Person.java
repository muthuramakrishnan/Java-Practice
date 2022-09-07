import business.Company;

import java.util.Arrays;

public class Person {
    //I can initialize here itself

    //The data types which are in white are classes - the instances we create are objects
    //The data types which are in oranges are primitives
    private String firstname = "muthu";
    private int age;
    private long id;
    private byte myByte;
    static private Company company = new Company();
    private NewAgency newAgency;

    public static void varArgsTestMethod(String... words){
        System.out.println(Arrays.toString(words));
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.varArgsTestMethod("muthu", "rama", "krishnan");
    }
}
