package pl.vatiaz.core;

import org.bukkit.plugin.java.JavaPlugin;

import pl.vatiaz.core.listener.PlayerJoinListener;

public class CorePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Rejestrujemy klasę obsługującą zdarzenia
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Kod wykonywany podczas wyłączania pluginu
    }
}
