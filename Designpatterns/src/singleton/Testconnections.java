package singleton;

public class Testconnections {
	public static void main(String[] args) {
		for (int i = 1;i<=10;i++) {
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("connection is singleton");
		}else {
			System.out.println("not singleton");
		}
		
	}

}}
