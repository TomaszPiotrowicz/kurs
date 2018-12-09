package pl.com.tomasz.kuchnia.java14;

public class cat {
    private String name;


    public cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        cat kot = new cat ("zibi");
        System.out.println( kot);

    }

}

