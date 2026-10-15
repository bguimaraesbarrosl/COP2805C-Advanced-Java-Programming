public class Tortoise extends Thread {

    //Option 1: extend Thread.

    private final Race race;

    public Tortoise(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        while (race.getWinner() == null) {
            race.tortoiseRunLap();
        }
    }
}