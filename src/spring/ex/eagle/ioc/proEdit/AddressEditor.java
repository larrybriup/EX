package spring.ex.eagle.ioc.proEdit;

import java.util.StringTokenizer;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class AddressEditor extends PropertiesEditor {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		StringTokenizer st= new StringTokenizer(text, ",");
		String city=st.nextToken();
		int zip=Integer.parseInt(st.nextToken());
		String street=st.nextToken();
		Address add= new Address(city, zip, street);
		setValue(add);
	}
}
