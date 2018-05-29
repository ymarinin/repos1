public class GroupFullException extends Exception {
    @Override
    public String getMessage() {
        return "Невозможно добавить запись";
    }
}
