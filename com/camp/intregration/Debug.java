package com.camp.intregration;

import java.util.Map;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
	

public class Debug
{
  private static boolean _DEBUG_MODE = false;
  private static Logger _LOGGER;
  
  public static void setDebugMode(boolean debug)
  {
    _DEBUG_MODE = debug;
  }
  
  public static void message(String message)
  {
    _LOGGER.log(Level.INFO, message);
  }
  
  public static void warnning(String message)
  {
    _LOGGER.log(Level.WARN, message);
  }
  
  public static void debugWarnning(String message)
  {
    if (_DEBUG_MODE) {
      _LOGGER.log(Level.WARN, "[DEBUG WARNNING] " + message);
    }
  }
  
  public static void fatalError(String message)
  {
    _LOGGER.log(Level.FATAL, message);
  }
  
  public static void DumpFluidRegistry()
  {
    Map<String, Fluid> theFluids = FluidRegistry.getRegisteredFluids();
    for (Map.Entry<String, Fluid> entry : theFluids.entrySet())
    {
      String output = "[FluidRegistry Dump] key: " + (String)entry.getKey();
      output = output + " name: " + ((Fluid)entry.getValue()).getName();
      String fluidLocalizedName = ((Fluid)entry.getValue()).getLocalizedName();
      output = output + " Fluid Displayed Name: " + fluidLocalizedName;
      message(output);
    }
  }
  

  
  public static void setLogger(Logger modLog)
  {
    _LOGGER = modLog;
  }
}