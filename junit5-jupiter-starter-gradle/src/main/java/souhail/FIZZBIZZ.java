package souhail;

public class FIZZBIZZ {
    public static String think(int nbr) {
        String output = "";
        for(int i = 1; i <= nbr; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                output = output + "FizzBuzz";
            } else if(i % 3 == 0) {
                output = output + "Fizz";
            } else if(i % 5 == 0) {
                output = output + "Buzz";
            } else {
                output = output + i;
            }
            if(i < nbr) {
                output = output + " ";  // Ajouter un espace entre les résultats
            }
        }
        return output;
    }

}
