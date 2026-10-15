public class AmericanFootball {
    public static void main(String[] args) {
        // array of Strings
        // String[] players = new String[5000]; //declaring and creating an array

        //initialize an array
        String[] players = {"Allen", "Benford", "Cook", "Dawkins"};
        int[] numbers = {17, 47, 4, 73};

        //multi-dimensional arrays
        String[][] playersBySoccerTeam = { {"Marta", "Angelina", "Rafaelle", "Anna"} ,
                                 {"Lorena", "Cristiane", "Tamires", "Gabi"} };

        //standard for-loop -> READING or WRITING
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i] + "  ");
        }

        System.out.println(); // go to next line in output

        //for-each loop a.k.a. enhanced for-loop <- READ ONLY
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println(); // next line

        // nested for-loops to step through multi-dimensional arrays
        // standard for loops
        for (int i = 0; i < playersBySoccerTeam.length; i++) {
            for (int j = 0; j < playersBySoccerTeam[i].length; j++) {
                System.out.print(playersBySoccerTeam[i][j] + "  ");
            }
            System.out.println(); // next line
        }
        System.out.println("===========================");

        // enhanced for loops
        for (String[] pbt : playersBySoccerTeam) {
            for(String p: pbt) {
                System.out.print(p + "  ");
            }
            System.out.println(); // next line
        }
    }
}