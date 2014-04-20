package myproject.dashboard.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class GraphicsController {
	 
		private String value = "TEste managedBean";
	 
		public String getValue() {
			System.out.println("VALOR: "+value);
			return value;
		}
	 
		public void setValue(String value) {
			this.value = value;
		}

}
