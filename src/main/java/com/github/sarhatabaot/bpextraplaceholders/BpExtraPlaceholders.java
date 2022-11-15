package com.github.sarhatabaot.bpextraplaceholders;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BpExtraPlaceholders extends PlaceholderExpansion {


    @Override
    public @Nullable String onRequest(final OfflinePlayer player, @NotNull final String params) {
        if("tiers".equals(params)) {
            final String tier = PlaceholderAPI.setPlaceholders(player,"%battlepass_tier%");
            return "%img_tiered_"+tier+"%";
        }
        return null;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "extra-bp";
    }

    @Override
    public @NotNull String getAuthor() {
        return "sarhatabaot";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }
}
