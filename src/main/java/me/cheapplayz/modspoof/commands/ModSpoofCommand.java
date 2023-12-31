package me.cheapplayz.modspoof.commands;

import com.google.common.collect.Lists;
import me.cheapplayz.modspoof.ModSpoof;
import me.cheapplayz.modspoof.utils.Utils;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.List;

public class ModSpoofCommand implements ICommand {
    @Override
    public String getName() {
        return "modspoof";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/modspoof";
    }

    @Override
    public List<String> getAliases() {
        List<String> aliases = Lists.<String>newArrayList();
        aliases.add("/modspoof");
        return aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        sender.sendMessage(new TextComponentString("ModSpoof"));
        sender.sendMessage(new TextComponentString("Version: " + ModSpoof.VERSION));
        sender.sendMessage(new TextComponentString("Authors: CheapPlayz"));
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}