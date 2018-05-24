public class Group {
    private Student[] list = new Student[10];

    public Group () {

    }

    public void add (Student s) {
        try {
        if (s.surname == null || s.name == null || s.nationality == null || s.age == 0 || s.specialty == null || s.educationform == null)
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
        System.out.println("Фамилия: " + get(i).getSurname() + " | " + "Имя: " + get(i).getName() + " | " + "Национальность: " + get(i).getNationality() + " | " + "Возраст: " + get(i).getAge() + " | " + "Специальность: " + get(i).getSpecialty() + " | " + "Форма обучения: " + get(i).getEducationform());
    }
}

    public void sortGroup ()  {
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

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sortGroup();
        for (int i = 0; i < list.length; i++ ) {
            if (list[i] != null) {
                sb.append(list[i].surname + "\n");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
  }


