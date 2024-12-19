package souhail;

public class FIZZBIZZ {
    public static String think(int nbr) {
        String output = "";
        for(int i = 1; i <= nbr; i++) {
            if(i % 5 == 0) {
                output = output + "Buzz";
            }
        }
        return output;
    }
    }
  
