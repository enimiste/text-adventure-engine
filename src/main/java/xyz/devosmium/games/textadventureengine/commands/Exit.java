package xyz.devosmium.games.textadventureengine.commands;

import xyz.devosmium.games.textadventureengine.mobiles.Player;
import xyz.devosmium.games.textadventureengine.util.MessageQueue;

/**
 * Command that shutdown the app (Should implements some save in the future)
 */
@CommandAnnotation(command = "exit", description = "Closes the game")
public class Exit implements Command{
    @Override
    public void execute(Player player) {
        MessageQueue.add("Bye!");
        System.exit(-1);
    }
}