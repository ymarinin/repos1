public class Student extends Human {
    public String specialty;
    public String educationform;

    Student (String name, String surname, String nationality, int age, String specialty, String educationform) {
        this.name=name;
        this.surname=surname;
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
        System.out.println("Имя: " + this.name+ "\n" + "Фамилия: " + this.surname + "\n" + "Национальность:" +  this.nationality + "\n" + "Возраст: " + this.age + "\n" + "Специальность: " +  this.specialty + "\n" + "Форма обучения: " + this.educationform + "\n");
    }
}
