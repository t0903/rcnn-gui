package main;

import java.awt.EventQueue;

import controller.RCNN_Controller;

import nodeModel.RCNN_Model;

import userInterface.NewNodeDialog;
import userInterface.RCNN_View;

public class MainDriver {
	public static void main(String[] args) {
		
		// Initialize
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					// Instantiate Model
					RCNN_Model model = new RCNN_Model();
					
					// Instantiate View
					RCNN_View view = new RCNN_View();
					
					// Instantiate Controller
					RCNN_Controller controller = new RCNN_Controller();
					
					// Register MVC components so they can interact
					model.registerView(view);
					view.registerModel(model);
					view.registerController(controller);
					controller.registerModel(model);
					controller.registerView(view);
					
					// Enable the view
					view.setVisible(true);
			}
		});
		
		// TODO: Build the model
		
		
		// TODO: Build the controller
		
		
	}
}
