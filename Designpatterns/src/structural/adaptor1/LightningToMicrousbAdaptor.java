package structural.adaptor1;

public class LightningToMicrousbAdaptor {
	public class LightningToMicroUsbAdapter implements MicroUsbPhone {
		
	    private final LightningPhone lightningPhone;
		private LightningPhone LightningPhone;

	    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
	        this.LightningPhone = lightningPhone;
	    }

	    public void useMicroUsb() {
	        System.out.println("MicroUsb connected");
	        lightningPhone.useLightning();
	    }

	    @Override
	    public void recharge() {
	        lightningPhone.recharge();
	    }
	}

}
