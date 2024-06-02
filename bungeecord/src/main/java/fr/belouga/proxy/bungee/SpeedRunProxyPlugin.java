package fr.belouga.proxy.bungee;

import fr.belouga.proxy.listener.RegisterListeners;
import net.md_5.bungee.api.plugin.Plugin;

public class SpeedRunProxyPlugin extends Plugin {

    @Override
    public void onEnable() {
        RegisterListeners.register(this);
    }

    @Override
    public void onDisable() {

    }

}
