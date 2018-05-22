public class Mainclass {
    public static void main(String[] args) {

        final Group gr = new Group();
        gr.add(new Student("Петр", "Петров", "муж", "Украина", 19, "IT", "очная"));
        gr.add(new Student("Иван", "Иванов", "муж", "Беларусь", 20, "IT", "очная"));
        gr.add(new Student("Ольга", "Сидорова", "жен", "Армения", 22, "IT", "очная"));
        gr.addInteractive();
        gr.sortGroupbySurname();
        System.out.println("Сортировка по фамилии");
        gr.getAllgroup();
        System.out.println("---------------------------------------------");
        gr.sortGroupbyName();
        System.out.println("Сортировка по имени");
        gr.getAllgroup();
        System.out.println("---------------------------------------------");
        gr.sortGroupbyNationality();
        System.out.println("Сортировка по национальности");
        gr.getAllgroup();
        System.out.println("---------------------------------------------");
        gr.sortGroupbyAge();
        System.out.println("Сортировка по возрасту");
        gr.getAllgroup();
        System.out.println("---------------------------------------------");
        System.out.println("Список призывников :");
        gr.prizyv();
    }
}
