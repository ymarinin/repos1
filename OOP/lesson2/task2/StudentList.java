import sun.awt.AWTAccessor;

import java.util.Date;

public class StudentList {
    private Student[] list = new Student[100];
    private int p = 0;

    public void add(Student s) {
        list[p++] = s;
        if (p+1 == list.length) {
            Student [] list2 = new Student[list.length +1];
            System.arraycopy(list, 0, list2, 0, list.length);
            list=list2;
        }
    }

    public Student get(int n) {
        return list[n];
    }

    public void getAlllist () {
        for (int i = 0; i < p; i++)
            System.out.println(get(i).getSurname() +  " " + get(i).getName() + " " + get(i).getBirth());
    }

    public int find(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public int findSurname(String surname) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }
        return -1;
    }

    public int findBirth(Date birth) {
        for (int i = 0; i < p; i++) {
            if (list[i].getBirth().equals(birth))
                return i;
        }
        return -1;
    }

    public void delStudent(int x) {
            Student [] list1 = new Student[list.length-1];
                System.arraycopy(list,0, list1,0, x);
                System.arraycopy(list, x+1, list1, x, list1.length-x);
                list=list1;
            }
        }


