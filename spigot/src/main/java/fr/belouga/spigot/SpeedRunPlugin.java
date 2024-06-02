package fr.belouga.spigot;

import fr.belouga.listener.RegisterListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class SpeedRunPlugin extends JavaPlugin {

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        RegisterListeners.register(this);
    }

    @Override
    public void onDisable() {

    }

}
