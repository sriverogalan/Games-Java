package connecta4.player;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter @Setter
public class PlayerManager {
    private static List<Player> players = new ArrayList<>();
    public static void addPlayer(Player player) {
        player.setId(players.size() + 1);
        players.add(player);
    }
    public static Player getPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }
}
