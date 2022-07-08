public sealed class Cat extends Animal implements Runnable permits Tiger, Lion {

    private String name;
    private int age;

    public Cat(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("Created cat");
    }

    public Cat(){

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
        System.out.println("Running cat: " + this.name);
    }
}
