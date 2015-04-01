package frames;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import constants.GEConstants;
import constants.GEConstants.EToolBarButtons;

public class GEToolbar extends JToolBar{
	private ButtonGroup buttonGroup;
	
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

			this.add(rButton);
			buttonGroup.add(rButton);
		}
		
	}

}
