package fr.belouga.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEvent implements Listener {

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent e){
        e.setJoinMessage("§8[§a+1§8]§f [RANK] "+e.getPlayer().getDisplayName());
    }

}
