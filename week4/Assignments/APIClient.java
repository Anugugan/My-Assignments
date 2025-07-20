package week4.Assignments;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("endpoint is"+" "+ endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println(endpoint +" "+ requestBody + " "+requestStatus);
		
	}
public static void main(String[] args) {
	APIClient obj=new APIClient();
	obj.sendRequest("Broswer");
	obj.sendRequest("Browser", "Loaded successfully", true);
}
}
