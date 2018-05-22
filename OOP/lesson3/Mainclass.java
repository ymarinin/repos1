public class Mainclass {
    public static void main(String[] args) {

        final Group gr = new Group();
        gr.add(new Student("Петр", "Петров", "Украина", 19, "IT", "очная"));
        gr.add(new Student("Иван", "Иванов", "Украина", 20, "IT", "очная"));
        gr.add(new Student("Ольга", "Сидорова", "Украина", 18, "IT", "очная"));
        System.out.println("Список группы студентов: \n");
        gr.getAllgroup();
        System.out.println("--------------------------------------");
        gr.sortGroup();
        System.out.println("Отсортированый по фамилии список группы студентов: \n");
        gr.getAllgroup();
        System.out.println("--------------------------------------");
        System.out.println("Результаты поиска по фамилии Сидорова: \n");
        int t = gr.findSurname("Сидорова");
        gr.printinfo(t);
        System.out.println("--------------------------------------");
        System.out.println("Удаление студента Петрова \n");
        int k = gr.findSurname("Петров");
        gr.del(k);
        System.out.println("--------------------------------------");
    }
}
