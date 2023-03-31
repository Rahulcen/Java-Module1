package Stratergy.text;

import Stratergy.content.SocialMediaContext;
import Stratergy.iface.ISocialMediaStratergy;
import Stratergy.impl.FacebookStratergy;
import Stratergy.impl.GooglePlusStratergy;
import Stratergy.impl.OrkutStratergy;
import Stratergy.impl.TwitterStratergy;

public class TestStratergy {

	public static void main(String[] args) {
	    SocialMediaContext context = new SocialMediaContext();
		 
	    // Setting Facebook strategy.
	    context.setSocialmediaStrategy(new FacebookStratergy());
	    context.connect("James Gosling");
	 
	    System.out.println("====================");
	 
	    // Setting Twitter strategy.
	    context.setSocialmediaStrategy(new TwitterStratergy());
	    context.connect("Rod Johnson");
	 
	    System.out.println("====================");
	 
	    // Setting GooglePlus strategy.
	    context.setSocialmediaStrategy(new GooglePlusStratergy());
	    context.connect("Larry Page");
	 
	    System.out.println("====================");
	  
	    // Setting Orkut strategy.
	    context.setSocialmediaStrategy(new OrkutStratergy());
	    context.connect("Sundar");
		// TODO Auto-generated method stub

	}

}
