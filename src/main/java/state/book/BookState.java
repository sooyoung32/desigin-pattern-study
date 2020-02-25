package state.book;

public interface BookState {

    void borrow(Book book);

    void back(Book book);

    void reserve(Book book);

    void cancelReserve(Book book);

}
