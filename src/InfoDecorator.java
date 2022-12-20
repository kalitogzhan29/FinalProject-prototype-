package Classes;

public abstract class InfoDecorator implements ViewPersonalInfo{
	
	public ViewPersonalInfo data;
	
	InfoDecorator(ViewPersonalInfo data){
		this.data = data;
	}
	
	public void view(Object o) {
		data.view(o);
	}
}
