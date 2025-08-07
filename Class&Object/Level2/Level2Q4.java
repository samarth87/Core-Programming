public class Level2Q4 {
    static class MovieTicket {
        String movieName;
        int seatNumber;
        double price;

        MovieTicket(String movieName) {
            this.movieName = movieName;
        }

        void bookTicket(int seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!");
        }

        void displayTicket() {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: ₹" + price);
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Oppenheimer");
        ticket.bookTicket(45, 250.0);
        ticket.displayTicket();
    }
}
