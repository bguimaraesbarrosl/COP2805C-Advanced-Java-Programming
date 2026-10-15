public class Highlander extends Toyota {

    public Highlander() {
        setEstablishedYear(2023);
        setPrice(36620.0);
        setType('s');
    }

    @Override
    public void sound() {
        System.out.println("Highlander sound: shhhh");
    }

    // Inner / Nested class
    class ThirdRow {
        private Integer seats;

        public ThirdRow(Integer seats) {
            this.seats = (seats == 7 || seats == 8) ? seats : 8;
        }

        public Integer getSeats() {
            return seats;
        }
    }
}
