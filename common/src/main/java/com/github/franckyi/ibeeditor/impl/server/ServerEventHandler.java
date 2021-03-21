package com.github.franckyi.ibeeditor.impl.server;

import com.github.franckyi.minecraft.api.common.world.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ServerEventHandler {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void onPlayerJoin(Player player) {
        LOGGER.debug("Notifying {} that this server has IBE Editor", player);
        ServerNetworkEmitter.sendServerNotification(player);
    }

    public static void onPlayerLeave(Player player) {
        LOGGER.debug("Player {} left the server", player);
        ServerContext.removeModdedClient(player);
    }
}
