interface Computer {
    int i = 5;  //by default all var in interface are static & final, so this line is actually static final int i = 5;

    void cpu(); //by default all methods are public abstract, so this line is actually public abstract void cpu();
    int ram();
}

class Laptop implements Computer {
    int i = 10;

    @Override
    public void cpu() {
        System.out.println("in cpu");
    }

    @Override
    public int ram() {
        System.out.println("Interface static final var i = "+Computer.i);
        return 0;
    }

    void test(){
        System.out.println("in test");
    }
}