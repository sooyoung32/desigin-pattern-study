package state.book;

public class Holding implements BookState {
    public Holding() {
        System.out.println("보관중");
    }

    @Override
    public void borrow(Book book) {
        System.out.println("X");
    }

    @Override
    public void back(Book book) {
        System.out.println("X");
    }

    @Override
    public void reserve(Book book) {
        System.out.println("X");
    }

    @Override
    public void cancelReserve(Book book) {
        book.setState(new Available());
    }
}
