package Stratergy.impl;

import Stratergy.iface.ISocialMediaStratergy;

public class OrkutStratergy implements ISocialMediaStratergy {
	public void connectTo(String friendName) 
	  {
	    System.out.println("Connecting with " + friendName + " through Orkut");
	  }

}
