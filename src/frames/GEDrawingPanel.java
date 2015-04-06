package frames;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

import shapes.GEShape;
import constants.GEConstants;
import constants.GEConstants.EToolBarButtons;

public class GEDrawingPanel extends JPanel{
	private MouseDrawingHandler drawingHandler;
	
	private GEShape currentShape;
	
	private EToolBarButtons selectShape;
	
	public GEDrawingPanel(){
		super();
		drawingHandler = new MouseDrawingHandler();
		addMouseListener(drawingHandler);
		addMouseMotionListener(drawingHandler);
	
		this.setForeground(GEConstants.FOREGROUND_COLOR);
		this.setBackground(GEConstants.BACKGROUND_COLOR);
	}
	
	public void setCurrentShape(GEShape currentShape){
		this.currentShape = currentShape;
	}
	
	private void initDraw(Point startP){
		currentShape.initDraw(startP);
	}
	
	private void animateDraw(Point currentP){
		Graphics2D g2D = (Graphics2D)getGraphics();
		g2D.setXORMode(g2D.getBackground());
		currentShape.draw(g2D);
		currentShape.setCoordinate(currentP);
		currentShape.draw(g2D);
	}
	
	private class MouseDrawingHandler extends MouseInputAdapter{
		public void mousePressed(MouseEvent e){
			initDraw(e.getPoint());
		}
		public void mouseDragged(MouseEvent e){
			animateDraw(e.getPoint());
		}
	}
}
