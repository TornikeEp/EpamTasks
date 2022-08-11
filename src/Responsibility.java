public class Responsibility {

    private String name;

    public Responsibility(String name) {
        this.name = name;
    }

    public Responsibility(Responsibility responsibility) {
        this(responsibility.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Responsibility{" +
                "name='" + name + '\'' +
                '}';
    }
}
