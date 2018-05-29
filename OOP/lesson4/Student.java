public class Student extends Human {
    protected String sex;
    protected String specialty;
    protected String educationform;

    public Student () {

    }

    Student (String name, String surname, String sex, String nationality, int age, String specialty, String educationform) {
        this.name=name;
        this.surname=surname;
        this.nationality=nationality;
        this.age=age;
        this.sex=sex;
        this.specialty=specialty;
        this.educationform=educationform;
    }

    public String getSex() {
        return sex;
    }

    public void setSex ( String sex) {
        this.sex=sex;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty (String specialty) {
        this.specialty=specialty;
    }

    public String getEducationform() {
        return educationform;
    }

    public void setEducationform (String educationform) {
        this.educationform=educationform;
    }

    @Override
    public void printinfo ( ) {
        System.out.println("Имя: " + this.name+ "\n" + "Фамилия: " + this.surname + "\n" + "Национальность:" +  this.nationality + "\n" + "Возраст: " + this.age + "\n" + "Специальность: " +  this.specialty + "\n" + "Форма обучения: " + this.educationform + "\n");
    }
}
