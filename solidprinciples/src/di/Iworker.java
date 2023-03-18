package di;

public interface Iworker {
	public void word();
	

}
class Worker1 implements Iworker{
	
	@Override
	public void word() {
		// TODO Auto-generated method stub
		
	}
}
class SuperWorker1 implements Iworker{
	
	@Override
	public void word() {
		// TODO Auto-generated method stub
	}
	
	}
class Manager1 {
	Iworker worker;
	public void setWorker(Iworker w) {
		worker=w;
	}
	public void manage() {
		worker.word();
	}
}