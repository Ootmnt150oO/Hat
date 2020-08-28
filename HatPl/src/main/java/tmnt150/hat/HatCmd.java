package tmnt150.hat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class HatCmd implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        PlayerInventory playerInventory =  player.getInventory();
        ItemStack hand = playerInventory.getItemInMainHand();
        ItemStack armor = playerInventory.getHelmet();
        //檢測手上物品是否超過一個
        if (hand.getAmount() !=1){
            player.sendMessage("手上物品只能有一個");
            return true;
        }
        //戴上帽子
        if (hand.getAmount() == 1){
            playerInventory.setHelmet(hand);
            playerInventory.setItemInMainHand(armor);
            player.updateInventory();
            player.sendMessage("成功帶上");
        }

        return true;
    }
}
