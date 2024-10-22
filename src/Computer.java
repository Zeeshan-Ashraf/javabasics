interface Computer {
    int i = 55555;  //by default all var in interface are static & final, so this line is actually static final int i = 5;

    void cpu(); //by default all methods are public abstract, so this line is actually public abstract void cpu();
    int ram();
}

class Laptop implements Computer {
    int i = 10000;

    @Override
    public void cpu() {
        System.out.println("in cpu");
    }

    @Override
    public int ram() {
        System.out.println("Interface static final var i = "+Computer.i);
        System.out.println("class var this.i = "+this.i);
        return 0;
    }

    void test(){
        System.out.println("in test");
    }
}