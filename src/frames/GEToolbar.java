package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import shapes.GEEllipse;
import shapes.GELine;
import shapes.GERectangle;
import constants.GEConstants;
import constants.GEConstants.EToolBarButtons;

public class GEToolbar extends JToolBar{
	private ButtonGroup buttonGroup;
	
	private GEDrawingPanel drawingPanel;
	private GEToolBarHandler shapeTooleBarHandler;
	
	public GEToolbar(String label){
		super(label);
		buttonGroup = new ButtonGroup();
		JRadioButton rButton = null;
		for (EToolBarButtons btn : EToolBarButtons.values()){
			rButton = new JRadioButton();
			rButton.setIcon(new ImageIcon(GEConstants.IMG_URL + btn.toString() +
															GEConstants.SUFFIX_TOOLBAR_BTN));
			
			rButton.setSelectedIcon(new ImageIcon(GEConstants.IMG_URL +
													btn.toString() + GEConstants.SUFFIX_TOOLBAR_BTN_SLT));

			rButton.addActionListener(shapeTooleBarHandler);
			rButton.setActionCommand(btn.toString());
			this.add(rButton);
			buttonGroup.add(rButton);
		}
		
	}
	
	public void init(GEDrawingPanel dp) {
		drawingPanel = dp;
		setSize(GEConstants.WIDTH_SHAPETOOLBAR,
				GEConstants.HEIGHT_SHAPETOOLBAR);	
		clickDefaultButton();
	}
	
	public void clickDefaultButton(){
		JRadioButton rButton = (JRadioButton)this.getComponent(EToolBarButtons.Rectangle.ordinal());
		rButton.doClick();
	}
	
	private class GEToolBarHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton button = (JRadioButton)e.getSource();
			if(button.getActionCommand().equals(EToolBarButtons.Rectangle.name())){
				drawingPanel.setCurrentShape(new GERectangle());
			}else if(button.getActionCommand().equals(EToolBarButtons.Ellipse.name())){
				drawingPanel.setCurrentShape(new GEEllipse());
			}else if(button.getActionCommand().equals(EToolBarButtons.Line.name())){
				drawingPanel.setCurrentShape(new GELine());
			}
		}
		
	}

}
