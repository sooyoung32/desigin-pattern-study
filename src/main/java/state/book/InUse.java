package state.book;

public class InUse implements BookState {
    public InUse() {
        System.out.println("대여중");
    }

    @Override
    public void borrow(Book book) {
        System.out.println("X");
    }

    @Override
    public void back(Book book) {
        if (book.getState() instanceof  Reserved) {
            book.setState(new Holding());
        } else {
            book.setState(new Available());
        }
    }

    @Override
    public void reserve(Book book) {
        book.setState(new Reserved());
    }

    @Override
    public void cancelReserve(Book book) {
        System.out.println("예약취소 대여");
        book.setState(this);
    }
}
