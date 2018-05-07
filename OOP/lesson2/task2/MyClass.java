import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        final StudentList sl = new StudentList();
        sl.add(new Student("Vova", "Ivanov", new Date (1986, 1 ,1)));
        sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3,28)));
        sl.add(new Student("Sasha", "Petrov", new Date(1975,4,15)));
        sl.add(new Student("Petya", "Sidorov", new Date(1980, 7,5)));
        sl.getAlllist();
        System.out.println("------------------------------");
        int n = sl.find("Vova");
        int m = sl.findSurname("Petrov");
        int k = sl.findBirth(new Date (1970, 3, 28));
                System.out.println(sl.get(n).getBirth().toString());
                System.out.println("------------------------------");
                System.out.println(sl.get(m).getBirth().toString());
                System.out.println("------------------------------");
                System.out.println((sl.get(k).getSurname().toString()));
                System.out.println("------------------------------");
        int x = sl.findSurname("Petrov");
        sl.delStudent(x); // delete student "Petrov"
        sl.getAlllist();
    }
}
