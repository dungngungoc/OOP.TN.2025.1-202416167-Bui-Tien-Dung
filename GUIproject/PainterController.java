package com.hust.kstn.javafx;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {
	@FXML
    private RadioButton eraserButton;

    @FXML
    private RadioButton penButton;
    
    @FXML
    private ToggleGroup buttonsGroup;
    
	@FXML
	private Pane drawingAreaPane;
	
	private Color color;
	
	
	@FXML
	void clearButtonPressed(ActionEvent event) {
		drawingAreaPane.getChildren().clear();
		
	}
	
	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {		
		int radius = 4;
		
		if (event.getX() < radius || event.getY() < radius) return;
		if (event.getX() >= drawingAreaPane.getLayoutBounds().getMaxX()-radius || event.getY() >= drawingAreaPane.getLayoutBounds().getMaxY()-radius) return;
		
		Circle newCircle = new Circle(event.getX(), event.getY(), radius, color);
		drawingAreaPane.getChildren().add(newCircle);
	}
	
	@FXML
    void toolsButtonPressed(ActionEvent event) {
		if (event.getSource() instanceof RadioButton) {
			RadioButton btn = (RadioButton)event.getSource();
			if (btn.getText().equals("Pen")) {
				color = Color.BLACK;
			}
			else {
				color = Color.WHITE;
			}
		}
    }
	
}
