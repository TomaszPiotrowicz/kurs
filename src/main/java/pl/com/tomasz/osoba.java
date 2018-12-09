package pl.com.tomasz;

public class osoba {
    private String name;
    private String surname;
    private int age;


    public osoba(String name, String surname, int age) {
   setName(name);
        this.surname = surname;
       setAge(age);
}

    public String getName() {
        return name;
    }

    public void setName(String name)    {
        if(name.length() > 20){
            this.name =name.substring(0, 10);
            return;
        }

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
            System.out.println("nie narodziłeś się ");
            return;
        }
        if (age > 200) {
        this.age = 200;
        System.out.println(" jesteś stary dinozaur");
        return;
    }this.age =age;

    }

    @Override
    public String toString() {
        return "osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        osoba tomek = new osoba("tometytytytytytytytytytytyk" ,"piotrowicz" ,300
        );
        System.out.println("tomek dane:" + tomek);

    }

}



