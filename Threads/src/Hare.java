public class Hare implements Runnable {

    //Option 2: implement Runnable.

    private final Race race;

    public Hare(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        while (race.getWinner() == null) {
            race.hareRunLap();
        }
    }
}