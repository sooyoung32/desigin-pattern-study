package state.book;

public class Book {

    public BookState state;

    public Book() {
        this.state = new Available();
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public BookState getState() {
        return state;
    }

    public void borrow() {
        state.borrow(this);
    }

    public void reserve() {
        state.reserve(this);
    }

    public void back() {
        state.back(this);
    }


    public void cancelReservation() {
        state.cancelReserve(this);
    }


}
