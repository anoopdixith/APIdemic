/**
 * Created by adixith on 1/2/17.
 */
public class SampleTune {
    public String getSampleTune() {
        String tune;
        tune = "C D E F G A B C  D E F G";
        return tune;
    }

    public String getSampleTune(String theme, String instrument) {
        String tune = new String();
        switch (theme.toLowerCase()) {
            case "grim": return getGrimTune(instrument);
        }
        return tune;
    }

    public String getGrimTune(String instrument) {
        String tune;
        tune = "I["+instrument+"] Ab Bb Cb Ab Bb Cb Ab Bb Cb Ab Bb Cb Ab Bb Cb Ab Bb";
        return tune;
    }

    public String getFamousTunes(String famousTune, String instrument) {
        String tune = "";
        switch (famousTune.toLowerCase().replace(" ", "")) {
            case "furelise":
                tune = getFurElise(instrument);
                break;
            case "default":
                tune = getFurElise(instrument);
        }
        return tune;
    }

    public String getFurElise(String instrument) {
        String tune = "I[" + instrument + "] " + " T[Vivace] ";
        tune += "e d# e d# e b d c a, " +
                "c e a b, e a b c; " +
                "e d# e d# e b d c a, " +
                "c e a b, e c b a. " +
                "b c d e, g f e d, e e d c, e d c e; " +
                "e d# e d# e e d c a, " +
                "c e a b, e a b c; " +
                "e d# e d# e b d c a, " +
                "c e a b, e c b a. ";
        return tune;
    }

    private String constructTune(String tune, String instrument,
                                 String tempo, String voice,
                                 String layer, String controller,
                                 String key, String signature) {
        return "";
    }
}
