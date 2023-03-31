package Stratergy.content;

import Stratergy.iface.ISocialMediaStratergy;

public class SocialMediaContext {
	ISocialMediaStratergy smStrategy;
	 
	  public void setSocialmediaStrategy(ISocialMediaStratergy
			  smStrategy) 
	  {
	    this.smStrategy = smStrategy;
	  }
	 
	  public void connect(String name) 
	  {
	    smStrategy.connectTo(name);
	  }


}
