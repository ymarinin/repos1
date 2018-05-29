public class Human {
    protected String name;
    protected String surname;
    protected String nationality;
    protected int age;

    public Human () {

    }

    public Human (String name, String surname, String nationality, int age){
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname=surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality ( String nationality) {
        this.nationality=nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age=age;
    }

    public void printinfo () {
        System.out.println("Information :" + this.name + this.surname + this.nationality + this.age);
    }
}
