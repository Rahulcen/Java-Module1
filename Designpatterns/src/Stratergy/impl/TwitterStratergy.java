package Stratergy.impl;

import Stratergy.iface.ISocialMediaStratergy;

public class TwitterStratergy implements ISocialMediaStratergy {
	public void connectTo(String friendName) 
	  {
	    System.out.println(
	    "Connecting with " + friendName + " through Twitter");
	  }

}
