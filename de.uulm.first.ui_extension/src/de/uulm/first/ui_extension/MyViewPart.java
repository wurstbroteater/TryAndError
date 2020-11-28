package de.uulm.first.ui_extension;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.part.ViewPart;

public class MyViewPart extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		parent.setLayout(new GridLayout(2, false));
		Label myLabel = new Label(parent, SWT.LEFT);
		myLabel.setText("DO NOT PUSH THIS BUTTON!");
		
		myLabel.setText("DO NOT PUSH!");
		Button myButton = new Button(parent, SWT.NONE);
		myButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				if(event.type == SWT.Selection) {
					System.err.println("Eric says: The cake is a lie!");
				}
				
			}
		});
		myButton.setText("Do not push");

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
