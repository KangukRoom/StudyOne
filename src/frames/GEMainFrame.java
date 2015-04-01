package frames;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import menus.GEMenuBar;
import constants.GEConstants;

@SuppressWarnings("serial")
public class GEMainFrame extends JFrame{
	
	private static GEMainFrame uniqueMainFrame =
			new GEMainFrame(GEConstants.TITLE_MAINFRAME);
	private GEDrawingPanel drawingPanel;
	private GEMenuBar menuBar;
	
	private GEToolbar shapeToolbar;
	
	GEMainFrame(String title){
		super(title);
		
		drawingPanel = new GEDrawingPanel();
		add(drawingPanel);
		
		menuBar = new GEMenuBar();
		setJMenuBar(menuBar);
		
		shapeToolbar = new GEToolbar(GEConstants.TITLE_SHAPETOOLBAR);
		add(BorderLayout.NORTH, shapeToolbar);
	}
	
	public static GEMainFrame getInstance(){
		return uniqueMainFrame;
	}
	
	public void init(){
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(GEConstants.WIDTH_MAINFRAME,GEConstants.HEIGHT_MAINFRAME);
		setVisible(true);
	}
}
