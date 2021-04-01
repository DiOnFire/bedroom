package me.srgantmoomoo.bedroom.command.commands;

import me.srgantmoomoo.bedroom.api.util.TextFormatting;
import me.srgantmoomoo.bedroom.command.Command;
import me.srgantmoomoo.bedroom.command.CommandManager;
import me.srgantmoomoo.bedroom.module.Module;
import me.srgantmoomoo.bedroom.module.ModuleManager;

public class Toggle extends Command {
	
	public Toggle() {
		super("Toggle", "Toggles a module by name.", "toggle <name>", "t");
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(args.length > 0) {
			String moduleName = args[0]; 
			boolean moduleFound = false;
			for(Module module : ModuleManager.modules) {
				String moduleIn = module.name;
				moduleIn = moduleIn.replaceAll("\\s", "");
				if(moduleIn.equalsIgnoreCase(moduleName)) {
					module.toggle();
					CommandManager.addChatMessage(module.name + " " + (module.isEnabled() ? TextFormatting.GREEN + "enabled" + TextFormatting.GRAY + "." : TextFormatting.RED + "disabled" + TextFormatting.GRAY + "."));
					moduleFound = true;
					break;
				}
			}
			if(!moduleFound) {
				CommandManager.addChatMessage(TextFormatting.DARK_RED + "module not found.");
			}
		}else {
			CommandManager.addChatMessage("correct usage of toggle command -> " + CommandManager.prefix + "toggle <module>");
		}
	}

}