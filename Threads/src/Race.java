public class Race {

    //This class controls the race and uses synchronization.

    private final int totalLaps = 10;

    private int tortoiseLap = 0;
    private int hareLap = 0;

    private String winner = null;

    //Controls whose turn it is.
    private boolean tortoiseTurn = true;

    //If true, tortoise wins. If false, hare wins.
    private final boolean tortoiseShouldWin;

    public Race(boolean tortoiseShouldWin) {
        this.tortoiseShouldWin = tortoiseShouldWin;
    }

    public synchronized String getWinner() {
        return winner;
    }

    //Called by the tortoise thread.
    public synchronized void tortoiseRunLap() {

        while (!tortoiseTurn && winner == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        if (winner != null) return;

        tortoiseLap++;
        System.out.println("Tortoise running lap " + tortoiseLap);

        if (tortoiseLap == totalLaps) {
            winner = "Tortoise";
            notify();
            notifyAll();
            return;
        }

        if (tortoiseShouldWin) {
            tortoiseTurn = (tortoiseLap % 2 == 0) ? false : true;
        } else {
            tortoiseTurn = false;
        }

        notifyAll();
    }

    //Called by the hare thread.
    public synchronized void hareRunLap() {

        while (tortoiseTurn && winner == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        if (winner != null) return;

        hareLap++;
        System.out.println("Hare running lap " + hareLap);

        if (hareLap == totalLaps) {
            winner = "Hare";
            notify();
            notifyAll();
            return;
        }

        if (!tortoiseShouldWin) {
            tortoiseTurn = (hareLap % 2 == 0) ? true : false;
        } else {
            tortoiseTurn = true;
        }

        notifyAll();
    }
}