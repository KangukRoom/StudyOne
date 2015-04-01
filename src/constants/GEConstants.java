package constants;

import java.awt.Color;

public class GEConstants {
	//GEMainFrame
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "�׷��� ������-Iteration 1";
	//GEMenu
	public static final String TITLE_FILEMENU = "����";
	public static final String TITLE_EDITMENU = "����";
	public static final String TITLE_COLORMENU = "�÷�";
	//GEMenuItems ���������� �̸� ��� ���� �� �Ҵ�
	public static enum EFileMenuItems { ���θ����, ����, ����, �ٸ��̸���������, ����};
	public static enum EEditMenuItems { Undo, Redo, ����, �߶󳻱�, ����, ���̱�, �׷�, �׷�����};
	public static enum EColorMenuItems { SetLineColor, CelarLineColor, SetFillColor, ClearFileColor};
	//GEToolbarShape
	public static final String TITLE_SHAPETOOLBAR = "Shape Tools";
	public static int WIDTH_SHAPETOOLBAR = 30;
	public static int HEIGHT_SHAPETOOLBAR = 200;
	public static enum EToolBarButtons { Select, Rectangle, Line, Ellipse, Polygon };
	public static final String IMG_URL = "images/";
	public static final String SUFFIX_TOOLBAR_BTN = ".gif";
	public static final String SUFFIX_TOOLBAR_BTN_SLT = "SLT.gif";
	
	//GEDrawingPanel
	public static final Color FOREGROUND_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;
}
