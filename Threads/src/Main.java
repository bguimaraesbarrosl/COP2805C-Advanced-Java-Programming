public class Main {

    public static void main(String[] args) throws InterruptedException {

        //True of false
        Race race = new Race(false);

        Tortoise tortoise = new Tortoise(race);
        tortoise.start();

        Hare hareRunnable = new Hare(race);
        Thread hareThread = new Thread(hareRunnable);
        hareThread.start();

        tortoise.join();
        hareThread.join();

        System.out.println("Winner: " + race.getWinner());
    }
}