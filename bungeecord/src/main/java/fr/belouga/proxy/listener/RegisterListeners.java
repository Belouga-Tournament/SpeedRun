package fr.belouga.proxy.listener;

import fr.belouga.Constants;
import fr.belouga.proxy.bungee.SpeedRunProxyPlugin;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.PluginManager;

public class RegisterListeners {

    public static void register(final SpeedRunProxyPlugin plugin) {
        final ProxyServer proxyServer;
        final PluginManager pluginManager;

        if (plugin == null)
            return;
        proxyServer = plugin.getProxy();
        pluginManager = proxyServer.getPluginManager();

        proxyServer.registerChannel(Constants.CUSTOM_PAYLOAD_CHANNEL);
    }

}
