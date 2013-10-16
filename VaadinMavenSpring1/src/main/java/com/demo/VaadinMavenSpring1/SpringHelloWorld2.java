package com.demo.VaadinMavenSpring1;

import com.vaadin.Application;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class SpringHelloWorld2 extends Application {
    
	private Window window;
	
    @Override
    public void init() {
        
        // NullPointerException is in this line:
    	SpringContextHelper helper = new SpringContextHelper(VaadinServlet.getCurrent().getServletContext());
        //
    	        
        window = new Window("My Vaadin Application");
        setMainWindow(window);
        // final MyBeanInterface bean = (MyBeanInterface) helper.getBean("myBean");
        
        Button button = new Button("Click Me");
        button.addListener(new Button.ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				//window.addComponent(new Label(bean.myMethod()));
				window.addComponent(new Label("vot"));
			}
		});
        window.addComponent(button);
               }

	public void markAsDirty() {
		
		}


}
