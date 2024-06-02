package fr.belouga.listener;

import fr.belouga.Constants;
import fr.belouga.listener.server.SpeedRunPluginMessageListener;
import fr.belouga.spigot.SpeedRunPlugin;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.messaging.Messenger;

public class RegisterListeners {

    public static void register(final SpeedRunPlugin plugin) {
        final Server server;
        final Messenger messenger;
        final PluginManager pluginManager;

        if (plugin == null)
            return;
        server = plugin.getServer();
        messenger = server.getMessenger();
        pluginManager = server.getPluginManager();

        messenger.registerIncomingPluginChannel(plugin, Constants.CUSTOM_PAYLOAD_CHANNEL, new SpeedRunPluginMessageListener());
        messenger.registerOutgoingPluginChannel(plugin, Constants.CUSTOM_PAYLOAD_CHANNEL);
    }

}
