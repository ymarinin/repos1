import java.util.Scanner;

public class Group implements Recrut {
    private Student[] list = new Student[10];

    public Group () {

    }

    public void add (Student s) {
        try {
        if (s.surname == null || s.name == null || s.nationality == null || s.age == 0 || s.sex == null|| s.specialty == null || s.educationform == null)
            throw new IllegalArgumentException();
            } catch (IllegalArgumentException f) {
            System.out.println("Ошибка ввода данных. Заполните, пожалуйста, все поля");
            return;
        }
            try {
                for (int i = 0; i < list.length; i++) {
                    if (list[i] == null) {
                        list[i] = s;
                        return;
                    } else if (i == list.length-1) throw new GroupFullException();
                }
            } catch (GroupFullException e) {
                System.out.println(e);
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

    public Student findSurname(String surname) {

        for (int i = 0; i < list.length; i++) {
                if (list[i] != null && list[i].getSurname().equalsIgnoreCase(surname)) {
//                System.out.println("Фамилия: " + list[i].getSurname() + " | " + "Имя: " + list[i].getName() + " | " + "Национальность: " + list[i].getNationality() + " | " + "Возраст: " + list[i].getAge() + " | " + "Специальность: " + list[i].getSpecialty() + " | " + "Форма обучения: " + list[i].getEducationform());
                return list[i];
                }
           }
           System.out.println("Студент не найден.");
           return null;
    }


    public void del (String surname) {
        Student d = this.findSurname(surname);
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].equals(d)) {
                list [i] = null;
            }
        }
    }

    public Student get(int n) {
        return list[n];
    }

    public void getAllgroup () {
    for (int i = 0; i < list.length; i++) {
        if (list[i] != null)
        System.out.println("Фамилия: " + get(i).getSurname() + " | " + "Имя: " + get(i).getName() + " | " + "Национальность: " + get(i).getNationality() + " | " + "Возраст: " + get(i).getAge() + " | " + "Пол: " + get(i).getSex() + " | " + "Специальность: " + get(i).getSpecialty() + " | " + "Форма обучения: " + get(i).getEducationform());
    }
}

    public void sortGroupbySurname ()  {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] != null && list[j] != null &&list[i].getSurname().compareTo(list[j].getSurname()) > 0 ) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public void sortGroupbyName ()  {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] != null && list[j] != null &&list[i].getName().compareTo(list[j].getName()) > 0 ) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public void sortGroupbyNationality ()  {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] != null && list[j] != null &&list[i].getNationality().compareTo(list[j].getNationality()) > 0 ) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public void sortGroupbyAge() {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] != null && list[j] != null && list[i].getAge() > (list[j].getAge())) {
                    Student tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }

    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sortGroupbySurname();
        for (int i = 0; i < list.length; i++ ) {
            if (list[i] != null) {
                sb.append(list[i].surname + "\n");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public Student [] prizyv () {
        int n = 0;
        Student [] list2 = new Student [10];
        for (int i = 0; i < list.length; i++) {
            if(list[i]!= null && (list[i].getAge() > 18) && (list[i].getSex().equalsIgnoreCase("муж"))) {
                n++;
                list2[n] = list[i];
                System.out.println("Фамилия: " + get(i).getSurname() + " | " + "Имя: " + get(i).getName() + " | " + "Пол: " + get(i).getSex() + " | " + "Национальность: " + get(i).getNationality() + " | " + "Возраст: " + get(i).getAge() + " | " + "Специальность: " + get(i).getSpecialty() + " | " + "Форма обучения: " + get(i).getEducationform());
            }
        }
        for (n =0 ; n < list2.length; n++) {
            if (list2[n] != null)
            System.out.println(list2[n].getSurname()+ "\n");
        }
        return list2;
    }

  }


