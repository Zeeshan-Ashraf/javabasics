////////////////////////////////////////////////////////////////////////
/* reference data type or non-premitive: */
////////////////////////////////////////////////////////////////////////


import java.util.Arrays;

/***
 *  String
 *  Array
 *  Class
 *  Interface
 *  Enum
 *  Annotation
 *
 * 1. It is Class & is different from Java Collections class
 * 2. it begins with Uppercase==coz Class
 * 3. can be null
 * 4. it has methods == coz Class
 * 5. all refrence type is of same size == 8B coz it stores refrence & actual data stored in heap that can grow/shrink
 */

public class Must2 {

    public void array(){
        //two ways to init array
        int arr[] = {1,2,3};
        int arr2[] = new int[4];  //default value [0, 0, 0, 0]

        //o/p
        System.out.println("--------basic array-------");
        System.out.println("print elem by index, arr[2]=" + arr[2]);
        System.out.println("print all elem of arr (use deepToString for 2D/3D array)=" + Arrays.toString(arr));

        //for-each loop to iterate over each element of arr
        System.out.println("\nPrint each elem using for-each loop");
        for (int item:arr) {
            System.out.print(item+" ");
        }
    }

    void array2D(){
        int arr2D[][] = {{1,2},{2,3},{3,4}};
        int arr2D2[][] = new int[2][3]; // default value = [[0,0,0], [0,0,0]]
        System.out.println("\n\n---------2D arr-----------\nprint elem by index in 2D, arr[2][0]=" + arr2D[2][0]);
        System.out.println("print all elem of ar2Dr=" + Arrays.deepToString(arr2D));

        //for-each loop to iterate over each element of arr
        System.out.println("\nPrint each elem using for-each loop");
        for (int row[]:arr2D) {
            for(int elem: row)
                System.out.print(elem+" ");
        }
    }

    void arrayJagged(){
        int arr2DJagged[][] = {{1,2},{2},{4,5,6}};
        int arr2DJagged2[][] = new int[2][]; // default value = [null, null]
        System.out.println("\n\n--------2D Jagged arr--------\nprint elem by index in 2D, arr2DJagged[2][0]=" + arr2DJagged[2][0]);
        System.out.println("print all elem of arr2DJagged=" + Arrays.deepToString(arr2DJagged));
        System.out.println("print all elem of arr2DJagged2=" + Arrays.deepToString(arr2DJagged2));

        //for-each loop to iterate over each element of arr
        System.out.println("\nPrint each elem using for-each loop");
        for (int row[]:arr2DJagged) {
            for(int elem: row)
                System.out.print(elem+" ");
        }
    }

    public void arrayOfObj(){
        Student stud[] = new Student[3];  //default value [null, null, null]
        System.out.println("\n\n-------Student[] obj arr--------\nprint elem by index, arr[2]=" + stud[2]);
        System.out.println("print all elem of arr (use deepToString for 2D/3D array)=" + Arrays.toString(stud));

        Student student = new Student();
        Student student2 = new Student();
        student.name = "Zeesha";
        stud[1] = student;
        stud[2] = student2;
        //for-each loop to iterate over each element of arr
        System.out.println("\nPrint each elem using for-each loop");
        for (Student item:stud) {
            System.out.print(item+" ");
        }
    }

    void strings(){
        Strings strings = new Strings();
        System.out.println("\n\n\n----------Strings----------");
        strings.basic();
    }

}

class Student{
    String name = "hhh";  //global var within 1 object

    @Override  // optional, this annotation helps in generating errors
    public String toString() {  //every class is child of Object class which has toString() method & prints the hash
                                // of curr obj whenever we print the obj directly
        return name;
    }
}

class Teacher{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Strings{
    void basic(){
        System.out.println("1. String is immutable \n" +
                "2. String is class not PDT \n"
                + "3. StringBuffer is mutable i.e we can do replace char & other mutable ops\n"
        + "4. + is used for concat\n"
        + "5. String is different than Java Collections class");
        String s = "Zeeshan";
        System.out.println(s);
    }
}
