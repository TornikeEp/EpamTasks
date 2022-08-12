public non-sealed class Tiger extends Cat {
    private String name;
    private int age;

    public Tiger(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Tiger(){

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

    public void run(){
        System.out.println("Running tiger: " + this.name);
    }
}
