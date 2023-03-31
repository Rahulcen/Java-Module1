package structural.adaptor.phoneimpl;

import structural.adaptor.phoneinterfaces.Lightningphones;

public class Iphone implements Lightningphones {
 private boolean connector;
	@Override
	public void recharge() {
		if(connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}else {
			System.out.println("connect lightning");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void uselighting() {
		connector=true;
		System.out.println("lightning connected");
		// TODO Auto-generated method stub

	}

}
