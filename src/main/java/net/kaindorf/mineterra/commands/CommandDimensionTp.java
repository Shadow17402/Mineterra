package net.kaindorf.mineterra.commands;

import com.google.common.collect.Lists;
import net.kaindorf.mineterra.Mineterra;
import net.kaindorf.mineterra.commands.util.Teleport;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.List;

public class CommandDimensionTp extends CommandBase {

    private final List<String> aliases = Lists.newArrayList(Mineterra.MODID,"tp","tpdim","tpdimension","teleportdimension","teleport");

    @Override
    public String getName() {
        return "tpdimension";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "tpdimension <id>";
    }

    @Override
    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args.length<1) return;
        String s = args[0];
        int dimid;

        try{
            dimid = Integer.parseInt(s);
        }catch(NumberFormatException e){
            sender.sendMessage(new TextComponentString(TextFormatting.RED+"DimensionID invalid"));
            return;
        }
        if(sender instanceof EntityPlayer){
            Teleport.teleportToDim((EntityPlayer) sender,dimid,sender.getPosition().getX(),sender.getPosition().getY(),sender.getPosition().getZ());
        }
    }
}
