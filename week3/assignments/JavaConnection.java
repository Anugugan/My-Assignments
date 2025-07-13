package week3.assignments;

public class JavaConnection extends MySqlConnection implements DatabseConnection {
	// DAY 2 assignment 3A ,3B
	@Override
	public void connect() {
		System.out.println("DB is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("DB is dis connected");
		
	}

	@Override
	public void executeUpdate() {
System.out.println("update is executed");		
	}
public static void main(String[] args) {
	JavaConnection JC=new JavaConnection();
	JC.connect();
	JC.disconnect();
JC.executeUpdate();
JC.ExecuteQuery();
}

@Override
public void ExecuteQuery() {
	System.out.println("Query has been executed");
	
}

}
