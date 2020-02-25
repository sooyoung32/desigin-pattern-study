package state.book;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();

        book.borrow();
        book.reserve();
        book.cancelReservation();
        book.back();
    }
}
