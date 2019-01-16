package test1;

import javax.swing.*;
import java.awt.*;

public class mainClass {
	
	private static JToolBar myJToolBar;
	private static JButton bt_choose;
	private static JButton bt_add_state;
	private static JButton bt_connect;
	private static JButton bt_delete;
	
	public static void main(String[] args) {
		JFrame window = new JFrame(); 
		window.setSize(640,480);
		window.setTitle("hello world");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		myJToolBar = new JToolBar();
		window.add(myJToolBar);
		myJToolBar.setBounds(29, 12, 320, 38);
		myJToolBar.setBackground(new java.awt.Color(255, 255, 255));
		{
			bt_choose = new JButton();
			myJToolBar.add(bt_choose);
			bt_choose.setText("选择");
			bt_choose.setPreferredSize(new java.awt.Dimension(80, 34));
			bt_choose.setIcon(new ImageIcon("images//AddNode.jpg"));
			bt_choose.setFont(new java.awt.Font("楷体", 0, 14));
			bt_choose.setToolTipText("点此可拖动对象");
			bt_choose.setBackground(new java.awt.Color(255, 255, 128));
		}
		{
			bt_add_state = new JButton();
			myJToolBar.add(bt_add_state);
			bt_add_state.setText("添加状态");
			bt_add_state.setToolTipText("点此可切换为状态输入情景");
			bt_add_state.setIcon(new ImageIcon("images//AddSide.jpg"));
			bt_add_state.setFont(new java.awt.Font("楷体", 0, 14));
			bt_add_state.setBackground(new java.awt.Color(255, 255, 128));
			bt_add_state.setToolTipText("首次点击结束结点输入,然后增加一条边");
			bt_add_state.setPreferredSize(new java.awt.Dimension(78, 34));
		}
		{
			bt_connect = new JButton();
			myJToolBar.add(bt_connect);
			bt_connect.setText("连线");
			bt_connect.setIcon(new ImageIcon("images//DrawFigure.jpg"));
			bt_connect.setFont(new java.awt.Font("楷体", 0, 14));
			bt_connect.setBackground(new java.awt.Color(255, 255, 128));
			bt_connect.setToolTipText("点此可输入连线");
			bt_connect.setPreferredSize(new java.awt.Dimension(94, 34));
			bt_connect.addActionListener(new HandleControlButton(3));

		}
		{
			bt_delete = new JButton();
			myJToolBar.add(bt_delete);
			bt_delete.setText("删除");
			bt_delete.setIcon(new ImageIcon("images//ShortestPath.jpg"));
			bt_delete.setFont(new java.awt.Font("楷体", 0, 14));
			bt_delete.setBackground(new java.awt.Color(255, 255, 128));
			bt_delete.setToolTipText("点此可删除对象");
			bt_delete.setPreferredSize(new java.awt.Dimension(95, 34));
			bt_delete.addActionListener(new HandleControlButton(4));
		}
		
//		drawingComponent dc = new drawingComponent();
//		window.add(dc);
		

		
	}

}
