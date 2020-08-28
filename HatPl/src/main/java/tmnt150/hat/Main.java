package tmnt150.hat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        System.out.println("插件開啟");
        //註冊指令
        getCommand("hat").setExecutor(new HatCmd());
    }
}
