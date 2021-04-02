package com.levi.team;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Team extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("Team plugin enabled!");

        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new QuitListener(), this);

    }
}
