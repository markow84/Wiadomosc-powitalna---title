package pl.vatiaz.core.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Tytuł i podtytuł z możliwością formatowania kolorów
        String title = ChatColor.translateAlternateColorCodes('&', "&cWitaj na serwerze");
        String subtitle = ChatColor.translateAlternateColorCodes('&', "&7:)");

        // Wyświetl tytuł i podtytuł graczowi
        event.getPlayer().sendTitle(title, subtitle, 10, 70, 20);
    }
}
