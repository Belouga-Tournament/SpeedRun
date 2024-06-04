package fr.belouga.listener;

import fr.belouga.spigot.SpeedRunPlugin;
import fr.mrmicky.fastboard.FastBoard;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvent implements Listener {

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent e){
        FastBoard board = new FastBoard(e.getPlayer());
        board.updateTitle("§cTest");//Je définie le nom du scoreboard
        SpeedRunPlugin.getInstance().getBoards().put(e.getPlayer().getUniqueId(), board);
        e.setJoinMessage("§8[§a+1§8]§f [RANK] "+e.getPlayer().getDisplayName());
    }
    @EventHandler
    private void onPlayerLeave(PlayerQuitEvent e){
        FastBoard board = SpeedRunPlugin.getInstance().getBoards().remove(e.getPlayer().getUniqueId());
        assert board != null;
        board.delete();
    }
}
