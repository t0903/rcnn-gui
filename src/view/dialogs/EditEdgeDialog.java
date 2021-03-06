package view.dialogs;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;

import resources.datatypes.Edge;

import controller.RCNN_Controller;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditEdgeDialog {
	private Edge editEdge;
	//private RCNN_Controller controller;
	private JDialog mainDialog;
	private JTextField textField_1;
	private JTextField textField;

	public EditEdgeDialog(JFrame mainFrame, RCNN_Controller controller, Edge editEdge) {
		//this.controller = controller;
		this.editEdge = editEdge;
		initialize(mainFrame);
	}
	
	public void initialize(JFrame mainFrame){
		mainDialog = new JDialog(mainFrame,"Add New Node", true);
		mainDialog.setType(Type.POPUP);
		mainDialog.setAlwaysOnTop(true);
		mainDialog.setResizable(false);
		mainDialog.setTitle("Create New Edge");
		mainDialog.setBounds(100, 100, 257, 160);
		mainDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainDialog.getContentPane().setLayout(new BoxLayout(mainDialog.getContentPane(), BoxLayout.X_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setDividerSize(0);
		mainDialog.getContentPane().add(splitPane);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setDividerSize(0);
		splitPane.setLeftComponent(splitPane_1);
		
		JPanel panel = new JPanel();
		splitPane_1.setLeftComponent(panel);
		
		JLabel lblOrigin = new JLabel("Origin:");
		panel.add(lblOrigin);
		
		JLabel lblProperOrigin;
		JLabel lblProperDestination;
		if(editEdge == null) {
			lblProperOrigin = new JLabel("INVALID EDGE");
			lblProperDestination = new JLabel("INVALID EDGE");
		} else {
			lblProperOrigin = new JLabel(editEdge.getSource());
			lblProperDestination = new JLabel(editEdge.getDestination());	
		}
		
		panel.add(lblProperOrigin);
		
		JPanel panel_1 = new JPanel();
		splitPane_1.setRightComponent(panel_1);
		
		JLabel lblDestination = new JLabel("Destination:");
		panel_1.add(lblDestination);
		

		panel_1.add(lblProperDestination);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_3.setDividerSize(0);
		splitPane.setRightComponent(splitPane_3);
		
		JPanel panel_4 = new JPanel();
		splitPane_3.setLeftComponent(panel_4);
		
		JLabel lblPropagationDelay = new JLabel("Propagation Delay:");
		panel_4.add(lblPropagationDelay);
		
		textField = new JTextField();
		panel_4.add(textField);
		textField.setColumns(3);
		
		JPanel panel_5 = new JPanel();
		splitPane_3.setRightComponent(panel_5);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO: Wait for Propagation Delay to be implemented
				JOptionPane.showMessageDialog(mainDialog, "Invalid Data Entered");
				
			}
		});
		panel_5.add(btnAdd);
		
		Component horizontalStrut = Box.createHorizontalStrut(105);
		panel_5.add(horizontalStrut);
		
		JButton btnCancel = new JButton("Cancel");
		panel_5.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainDialog.dispose();
			}
		});
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setDividerSize(0);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		
		JPanel panel_2 = new JPanel();
		splitPane_2.setLeftComponent(panel_2);
		
		JPanel panel_3 = new JPanel();
		splitPane_2.setRightComponent(panel_3);
		
		JLabel lblActivationLevel = new JLabel("Activation Level:");
		lblActivationLevel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblActivationLevel);
		
		textField_1 = new JTextField();
		
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(50);
		panel_3.add(horizontalStrut_2);
	}

	public void setVisible(boolean setting){
		mainDialog.setVisible(setting);
	}
}