
class Main {
    public static void main(String argZee[]){
        //Must for PDT & diff b/n PDT & Ref Type in--> src/must.java (note its written like a script so you'll find class missing error)
        // to run (i.e to resolve class missing error) just comment all in must.java then run this Main.java
        Must2 m2 = new Must2();

        m2.array();
        m2.array2D();
        m2.arrayJagged();
        m2.arrayOfObj();

        m2.strings();

        Laptop laptop = new Laptop();
        laptop.cpu();
        System.out.println(laptop.ram());
        laptop.test();

        EnumStatus enumStatus = EnumStatus.Running;
        System.out.println("Enum: " + enumStatus);
        System.out.println("Enum index value: " + enumStatus.ordinal());
    }

}