package state.book;

public class Reserved implements BookState {
    public Reserved() {
        System.out.println("예약중");
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
        book.setState(new InUse());
    }
}
