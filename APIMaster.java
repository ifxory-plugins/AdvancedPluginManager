package ru.witwar.apm.apimaster;

import ru.witwar.advancedpluginmanager.AdvancedPluginManager;
import ru.witwar.advancedpluginmanager.PluginIniter;

public class APIMaster {
	
	public static AdvancedPluginManager instanceOfMain = AdvancedPluginManager.getInstance();
	public static APIMaster instanceOfAPIMaster;
	public static PluginIniter instanceOfPluginIniter = PluginIniter.getInstance();
	
	public static APIMaster getAPIMaster() {
		return instanceOfAPIMaster;
	}
	
	public AdvancedPluginManager getInstanceOfMain() {
		return instanceOfMain;
	}

	public PluginIniter getInstanceOfIniter() {
		return instanceOfPluginIniter;
	}

}
