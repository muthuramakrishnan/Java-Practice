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
    private static final double PI = 3.14;
    public static int[] nums = initNums();

    public static int[] initNums(){
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 4;
        nums[3] = 100;
        nums[4] = 24;
        return nums;
    }

    public static void varArgsTestMethod(String... words){
        System.out.println(Arrays.toString(words));
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.varArgsTestMethod("muthu", "rama", "krishnan");

        //static variable
        System.out.println(PI);
        System.out.println(Person.PI);
        System.out.println(Arrays.toString(nums));
    }
}
