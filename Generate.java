import org.jfugue.player.Player;

/**
 * Created by adixith on 1/2/17.
 */
public class Generate {
    public static void main(String[] args) {
        String furEliseTune = new SampleTune().getFamousTunes("Fur Elise", "VOICE_OOHS");
        Player player = new Player();
        player.play(furEliseTune);
    }
}
