public class Human {
    protected String name;
    protected String sex;
    protected String nationality;
    protected int age;

    public Human () {

    }

    public Human (String name, String sex, String nationality, int age){
    }

    public String getName() {
        return name;
    }

    public void setName () {
        this.name=name;
    }

    public String getSex () {
        return sex;
    }

    public void setSex () {
        this.sex=sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality () {
        this.nationality=nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge () {
        this.age=age;
    }

    public void printinfo () {
        System.out.println("Information :" + this.name + this.sex + this.nationality + this.age);
    }
}
