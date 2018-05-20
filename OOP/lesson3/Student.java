public class Student extends Human {
    public String specialty;
    public String educationform;

    Student (String name, String sex, String nationality, int age, String specialty, String educationform) {
        this.name=name;
        this.sex=sex;
        this.nationality=nationality;
        this.age=age;
        this.specialty=specialty;
        this.educationform=educationform;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty () {
        this.specialty=specialty;
    }

    public String getEducationform() {
        return educationform;
    }

    public void setEducationform () {
        this.educationform=educationform;
    }

    @Override
    public void printinfo ( ) {
        System.out.println("Information: " + this.name + this.sex + this.nationality + this.age + this.specialty + this.educationform);
    }
}
