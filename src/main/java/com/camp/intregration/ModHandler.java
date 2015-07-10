package com.camp.intregration;

import java.util.HashMap;

import net.minecraftforge.fml.common.Loader;

public class ModHandler {
	private HashMap<String, Boolean> _available = new HashMap();
	 private HashMap<String, Boolean> _config = new HashMap();
	 
	 
	 public void detectMods()
	 {
		 if (Loader.isModLoaded("tinkers' construct"))
		    {
		      this._available.put("AE", Boolean.valueOf(true));
		      Debug.message("Tinkers' Construct Detected");
		      if (!((Boolean)this._config.get("TC")).booleanValue()) {
		        Debug.message("Tinkers' Construct disabled in config");
		      }
		    }
	 }

public boolean isEnabled(String mod)
{
  return (((Boolean)this._available.get(mod)).booleanValue()) && (((Boolean)this._config.get(mod)).booleanValue());
}

public void configSetting(String mod, boolean enabled)
{
  this._config.put(mod, Boolean.valueOf(enabled));
}
}
