package state.book;

public class Available implements BookState {
    public Available() {
        System.out.println("이용가능");
    }

    @Override
    public void borrow(Book book) {
        book.setState(new InUse());
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
        System.out.println("X");
    }
}
