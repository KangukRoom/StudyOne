package frames;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

import shapes.GERectangle;
import constants.GEConstants;

public class GEDrawingPanel extends JPanel{
	private MouseDrawingHandler drawingHandler;
	private GERectangle rectangle;
	
	public GEDrawingPanel(){
		super();
		drawingHandler = new MouseDrawingHandler();
		addMouseListener(drawingHandler);
		addMouseMotionListener(drawingHandler);
		this.setForeground(GEConstants.FOREGROUND_COLOR);
		this.setBackground(GEConstants.BACKGROUND_COLOR);
	}
	
	private void initDraw(Point originP){
		rectangle = new GERectangle();
		rectangle.initDraw(originP);
	}
	
	private void animateDraw(Point currentP){
		Graphics2D g2D = (Graphics2D)getGraphics();
		g2D.setXORMode(g2D.getBackground());
		g2D.draw(rectangle.getRectangle());
		rectangle.setCoordinate(currentP);
		g2D.draw(rectangle.getRectangle());
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
