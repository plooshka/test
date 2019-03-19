abstract public class Person {
    private String name;
    private String surname;
    private int age;
    private String mobile_number;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
        this.age = age;
    }

    public String getMobile_numver() {
        return mobile_number;
    }

    public void setMobile_numver(String mobile_numver) {
        this.mobile_number = mobile_numver;
    }
}
