public final class Lion extends Cat {

    private String name;
    private int age;

    public Lion(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("Created lion");
    }

    public Lion(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void run(){
        System.out.println("Running lion: " + this.name);
    }
}
