package structuralPatterns;

public class AdapterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.selectElement();
		chromeDriver.getElement();
		IEDriver e = new IEDriver();
		e.clickElement();
		e.findElement();
		WebAdapter webAdapter = new WebAdapter(e);
		webAdapter.selectElement();
		webAdapter.getElement();
	}

}
