package fr.belouga.spigot;

import fr.belouga.listener.PlayerEvent;
import fr.belouga.listener.RegisterListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class SpeedRunPlugin extends JavaPlugin {

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        RegisterListeners.register(this);
        registerListeners();
    }

    @Override
    public void onDisable() {

    }
    private void registerListeners(){
        getServer().getPluginManager().registerEvents(new PlayerEvent(), this);
    }

}
