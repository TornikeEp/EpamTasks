public sealed class Animal implements Runnable permits Cat {

    private String name;
    private int age;

    public Animal(){

    }

   public Animal(String name, int age){
       this.age = age;
       this.name = name;
       System.out.println("Created animal");
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
        System.out.println("Running animal: " + this.name);
    }

}
