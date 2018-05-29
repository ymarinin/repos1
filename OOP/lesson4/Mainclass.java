import java.util.Arrays;

public class Mainclass {
    public static void main(String[] args) {

        final Group gr = new Group();
        gr.add(new Student("Петр", "Петров","муж", "Украина", 19, "IT", "очная"));
        gr.add(new Student("Иван", "Иванов","муж", "Украина", 20, "IT", "очная"));
        gr.add(new Student("Ольга", "Сидорова","жен", "Украина", 17, "IT", "очная"));
        gr.add(new Student("Ольга", "Аидорова","жен", "Украина", 18, "IT", "очная"));
        gr.add(new Student("Ольга", "Дидорова","жен", "Украина", 22, "IT", "очная"));
        gr.add(new Student("Ольга", "Бидорова","жен", "Украина", 21, "IT", "очная"));
        gr.addInteractive();
        System.out.println("Список группы студентов: \n");
        gr.getAllgroup();
        System.out.println("--------------------------------------");
        gr.sortGroupbySurname();
        System.out.println("Отсортированый по фамилии список группы студентов: \n");
        gr.getAllgroup();
        System.out.println("--------------------------------------");
        System.out.println("Отсортированый по имени список группы студентов: \n");
        gr.sortGroupbyName();
        gr.getAllgroup();
        System.out.println("--------------------------------------");
        gr.sortGroupbyNationality();
        System.out.println("Отсортированый по национальности список группы студентов: \n");
        gr.getAllgroup();
        System.out.println("--------------------------------------");
        gr.sortGroupbyAge();
        System.out.println("Отсортированый по возрасту список группы студентов: \n");
        gr.getAllgroup();
        System.out.println("Список студентов для военкомата: \n");
        gr.prizyv();
    }
}
