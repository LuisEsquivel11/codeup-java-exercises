import java.util.Arrays;

public class ServerNameGenerator {


    public static void main(String[] args) {

        String[] adjectives = {
            "Radiant",
            "Euphoric",
            "Sensational",
            "Stellar",
            "Lustrous",
            "Serendipitous",
            "Exquisite",
            "Formidable",
            "Enigmatic",
            "Charismatic"
    };

         String[] nouns = {
            "Adventure",
            "Galaxy",
            "Serenade",
            "Mystique",
            "Harmony",
            "Aurora",
            "Elixir",
            "Twilight",
            "Enigma",
            "Cascade"

    };
         String randomAdjective = generateName(adjectives);
         String randomNoun = generateName(nouns);
        System.out.printf("Generated Random name: %n%s-%n%s", randomAdjective, randomNoun);
    }


    public static String generateName(String[] array) {
        int randomIndex = (int) (Math.random() * array.length);
        String randomElement = array[randomIndex];
        return randomElement;
    }



}

















