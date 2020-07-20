package structuralPatterns;

public class WebAdapter implements WebDriver {
	IEDriver e;

	public WebAdapter(IEDriver e) {
		super();
		this.e = e;
	}

	public void getElement() {
		// TODO Auto-generated method stub
		e.findElement();
	}

	public void selectElement() {
		// TODO Auto-generated method stub
		e.clickElement();
	}
}
