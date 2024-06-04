package fr.belouga.spigot;

import fr.belouga.listener.PlayerEvent;
import fr.belouga.listener.RegisterListeners;
import fr.mrmicky.fastboard.FastBoard;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SpeedRunPlugin extends JavaPlugin {

    @Getter
    private static SpeedRunPlugin instance;
    @Getter
    private final Map<UUID, FastBoard> boards = new HashMap<>();

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        instance = this;
        RegisterListeners.register(this);
        registerListeners();
        getServer().getScheduler().runTaskTimer(this, () -> {
            for (FastBoard board : this.boards.values()) {
                updateBoard(board);
            }
        }, 0, 20);
    }

    @Override
    public void onDisable() {

    }
    private void registerListeners(){
        getServer().getPluginManager().registerEvents(new PlayerEvent(), this);
    }
    public void updateBoard(FastBoard board){
        assert board != null;
        board.updateLines(
                "ligne 1",
                "ligne 2"
        );
    }
}
