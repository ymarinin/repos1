import sun.security.util.Length;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Recrut {
    private Student[] list = new Student[10];
    private int p = 0;

    public Group() {

    }

    public void add(Student s) {
        if (s != null) {
            try {
                list[p++] = s;
            } catch (ArrayIndexOutOfBoundsException l) {
//        Выход за пределы массива. Добавляю новую строку
            } finally {
                Student[] list2 = new Student[list.length + 1];
                System.arraycopy(list, 0, list2, 0, list.length);
                list = list2;
            }
        }
    }

    public void addInteractive() {
        Student st = new Student();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, фамилию студента :");
        st.setSurname(sc1.nextLine());
        System.out.println("Введите, пожалуйста, имя студента :");
        st.setName(sc1.nextLine());
        System.out.println("Введите, пожалуйста, пол студента :");
        st.setSex(sc1.nextLine());
        System.out.println("Введите, пожалуйста, национальность студента :");
        st.setNationality(sc1.nextLine());
        System.out.println("Введите, пожалуйста, специальность студента :");
        st.setSpecialty(sc1.nextLine());
        System.out.println("Введите, пожалуйста, форму обучения студента :");
        st.setEducationform(sc1.nextLine());
        System.out.println("Введите, пожалуйста, возраст студента :");
        st.setAge(sc1.nextInt());
        add(st);
    }

    public void del(int x) {
        Student[] list1 = new Student[list.length - 1];
        System.arraycopy(list, 0, list1, 0, x);
        System.arraycopy(list, x + 1, list1, x, list1.length - x);
        list = list1;
    }

    public int findSurname(String surname) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }
        System.out.println("Студент не найден");
        return -1;
    }

    public Student get(int n) {
        return list[n];
    }

    public void printinfo(int n) {
        System.out.println("Фамилия: " + get(n).getSurname() + " | " + "Имя: " + get(n).getName() + " | " + "Пол: " + get(n).getSex() + " | " + "Национальность: " + get(n).getNationality() + " | " + "Возраст: " + get(n).getAge() + " | " + "Специальность: " + get(n).getSpecialty() + " | " + "Форма обучения: " + get(n).getEducationform());
    }

    public void getAllgroup() throws NullPointerException {
        for (int i = 0; i < p; i++)
            System.out.println("Фамилия: " + get(i).getSurname() + " | " + "Имя: " + get(i).getName() + " | " + "Пол: " + get(i).getSex() + " | " + "Национальность: " + get(i).getNationality() + " | " + "Возраст: " + get(i).getAge() + " | " + "Специальность: " + get(i).getSpecialty() + " | " + "Форма обучения: " + get(i).getEducationform());

    }

    public void sortGroupbySurname() {
        for (int i = 0; i < p - 1; i++) {
            for (int j = i + 1; j < p; j++) {
                if (list[i].getSurname().compareTo(list[j].getSurname()) > 0) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public void sortGroupbyName() {
        for (int i = 0; i < p - 1; i++) {
            for (int j = i + 1; j < p; j++) {
                if (list[i].getName().compareTo(list[j].getName()) > 0) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public void sortGroupbyNationality() {
        for (int i = 0; i < p - 1; i++) {
            for (int j = i + 1; j < p; j++) {
                if (list[i].getNationality().compareTo(list[j].getNationality()) > 0) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }

    }

    public void sortGroupbyAge() {
        for (int i = 0; i < p - 1; i++) {
            for (int j = i + 1; j < p; j++) {
                if (list[i].getAge() > (list[j].getAge())) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }

    }

    public void prizyv() {
        for (int i = 0; i < p; i++) {
            if((list[i].getAge() > 18) && (list[i].getSex().equalsIgnoreCase("муж")))
              System.out.println("Фамилия: " + get(i).getSurname() + " | " + "Имя: " + get(i).getName() + " | " + "Пол: " + get(i).getSex() + " | " + "Национальность: " + get(i).getNationality() + " | " + "Возраст: " + get(i).getAge() + " | " + "Специальность: " + get(i).getSpecialty() + " | " + "Форма обучения: " + get(i).getEducationform());
        }

    }

    }


