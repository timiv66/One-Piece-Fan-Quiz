package quiz;
import java.util.Random;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OP_Quiz_FX extends Application{
	
	public int numOfRightAns;
	DropShadow shadow = new DropShadow();
	
	public void reset() {
		numOfRightAns = 0;
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	ArrayList<Pane> list = new ArrayList<>();
	

	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		Scene t = new Scene(new Pane(),600,500);
		t.setFill(Color.BLACK);
		t.setRoot(openScreen(t));
		mainStage.setTitle("One Piece Quiz");
		mainStage.setScene(t);
		mainStage.show();
		
	}
	
	public Pane openScreen(Scene t) {
		t.setFill(Color.BLACK);
		Text openTxt = new Text("How much do you really know about the anime One Piece?");
		Text openTxt2 = new Text("Take this quiz to prove that you are the true number 1 fan!!!");
		openTxt.setFill(Color.RED);
		openTxt2.setFill(Color.RED);
		openTxt.setX(130);
		openTxt.setY(100);
		openTxt2.setX(130);
		openTxt2.setY(125);
		
	    ImageView openImg = new ImageView("https://static.wikia.nocookie.net/onepiece/images/c/cb/Chapters_999-1000_Full_Color_Spread.png/revision/latest/scale-to-width-down/1200?cb=20210103181120");
		openImg.setFitHeight(200);
		openImg.setFitWidth(300);
		openImg.setX(137);
		openImg.setY(150);
		
		Button nxtBtn = new Button("Next");
		nxtBtn.setTranslateX(260);
		nxtBtn.setTranslateY(400);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				t.setRoot(ques1(t));
			}
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
		
		
		
		
		
		Pane openPane = new Pane();
		openPane.getChildren().addAll(openTxt, openTxt2, openImg, nxtBtn);
		return openPane;
		
	}
	
	public Pane ques1(Scene t) {
		t.getWindow().setHeight(300);
		
		Text ques1 = new Text("Question 1: Which crewmate had a pre-existing bounty before joining the Strawhats");
		ques1.setFill(Color.RED);
		ques1.setX(5);
		ques1.setY(20);
		
		Text ansA = new Text("A)Zoro");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Brook");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Nami");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Franky");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		TextField ques1TxtF = new TextField();
		ques1TxtF.setTranslateX(5);
		ques1TxtF.setTranslateY(120);
		
		Text hint1 = new Text("HINT: He has an huge afro.");
		hint1.setX(5);
		hint1.setY(190);
		hint1.setVisible(false);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques1TxtF.getText().matches("A") || ques1TxtF.getText().matches("a")) {
					t.setRoot(ques2(t));
				}
				else if(ques1TxtF.getText().matches("B") || ques1TxtF.getText().matches("b")) {
					numOfRightAns++;
					t.setRoot(ques2(t));
				}
				else if(ques1TxtF.getText().matches("C") || ques1TxtF.getText().matches("c")) {
					t.setRoot(ques2(t));
				}
				else if(ques1TxtF.getText().matches("D") || ques1TxtF.getText().matches("d")) {
					t.setRoot(ques2(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
		
		ToggleButton hintBtn1 = new ToggleButton("Show Hint");
		hintBtn1.setTranslateX(5);
		hintBtn1.setTranslateY(150);
		
		hintBtn1.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				hint1.setVisible(true);
			}
		});
		
		 hintBtn1.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			           hintBtn1.setEffect(shadow);
			          }
			        });

			    hintBtn1.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            hintBtn1.setEffect(null);
			          }
			        });
		
		
		
		Pane ques1Pane = new Pane();
		ques1Pane.getChildren().addAll(ques1,ansA,ansB,ansC,ansD,ques1TxtF,nxtBtn,hintBtn1,hint1,errorMsg);
		return ques1Pane;
		
	}
	
	public Pane ques2(Scene t) {
		
		
		Text ques2 = new Text("Question 2: Who is the holder of the Hormone-Hormone Fruit");
		ques2.setFill(Color.RED);
		ques2.setX(5);
		ques2.setY(20);
		
		Text ansA = new Text("A)Mr.5");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Leo");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Dalton");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Ivankov");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint2 = new Text("HINT: NEVER CALL ME DOOKIE!!!");
		hint2.setX(5);
		hint2.setY(190);
		hint2.setVisible(false);
		
		TextField ques2TxtF = new TextField();
		ques2TxtF.setTranslateX(5);
		ques2TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques2TxtF.getText().matches("A") || ques2TxtF.getText().matches("a")) {
					t.setRoot(ques3(t));
				}
				else if(ques2TxtF.getText().matches("B") || ques2TxtF.getText().matches("b")) {
					t.setRoot(ques3(t));
				}
				else if(ques2TxtF.getText().matches("C") || ques2TxtF.getText().matches("c")) {
					t.setRoot(ques3(t));
				}
				else if(ques2TxtF.getText().matches("D") || ques2TxtF.getText().matches("d")) {
					numOfRightAns++;
					t.setRoot(ques3(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
			    
	    Button backBtn = new Button("Back");
	    backBtn.setTranslateX(270);
	    backBtn.setTranslateY(120);
	    
	    backBtn.setOnAction(new EventHandler <ActionEvent>() {
	    	@Override
	    	public void handle(ActionEvent args0) {
	    		t.setRoot(ques1(t));
	    	}
	    });
		
		Button hintBtn2 = new Button("Show Hint");
		hintBtn2.setTranslateX(5);
		hintBtn2.setTranslateY(150);
		
		hintBtn2.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				hint2.setVisible(true);
			}
		});
		
		hintBtn2.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	           hintBtn2.setEffect(shadow);
	          }
	        });

	    hintBtn2.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            hintBtn2.setEffect(null);
	          }
	        });
		
		Pane ques2Pane = new Pane();
		ques2Pane.getChildren().addAll(ques2,ansA,ansB,ansC,ansD,ques2TxtF,nxtBtn,hintBtn2,hint2,errorMsg,backBtn);
		return ques2Pane;
		
		
		
	}
	
	public Pane ques3 (Scene t) {
		Text ques3 = new Text("Question 3: On what date did the 1st chapter of One Piece come out");
		ques3.setFill(Color.RED);
		ques3.setX(5);
		ques3.setY(20);
		
		Text ansA = new Text("A)July 22nd,1997");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)April 3rd,1998");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)November 10th,1999");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)May 6th,1997");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint3 = new Text("HINT: IDK, You tell me");
		hint3.setX(5);
		hint3.setY(190);
		hint3.setVisible(false);
		
		TextField ques3TxtF = new TextField();
		ques3TxtF.setTranslateX(5);
		ques3TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques3TxtF.getText().matches("A") || ques3TxtF.getText().matches("a")) {
					numOfRightAns++;
					t.setRoot(ques4(t));
				}
				else if(ques3TxtF.getText().matches("B") || ques3TxtF.getText().matches("b")) {
					t.setRoot(ques4(t));
				}
				else if(ques3TxtF.getText().matches("C") || ques3TxtF.getText().matches("c")) {
					t.setRoot(ques4(t));
				}
				else if(ques3TxtF.getText().matches("D") || ques3TxtF.getText().matches("d")) {
					t.setRoot(ques4(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
		
		Button hintBtn3 = new Button("Show Hint");
		hintBtn3.setTranslateX(5);
		hintBtn3.setTranslateY(150);
		
		hintBtn3.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				hint3.setVisible(true);
			}
		});
		
		hintBtn3.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	           hintBtn3.setEffect(shadow);
	          }
	        });

	    hintBtn3.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            hintBtn3.setEffect(null);
	          }
	        });
		
		Pane ques3Pane = new Pane();
		ques3Pane.getChildren().addAll(ques3,ansA,ansB,ansC,ansD,ques3TxtF,nxtBtn,hintBtn3,hint3,errorMsg);
		return ques3Pane;
	
	}
	
	public Pane ques4 (Scene t) {
		Text ques4 = new Text("Question 4: What was the name of Usopp's home village");
		ques4.setFill(Color.RED);
		ques4.setX(5);
		ques4.setY(20);
		
		Text ansA = new Text("A)Syrup Village");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Cocoyasi Village");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Foosha Village");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Shimotsuki Village");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint4 = new Text("HINT: Ummmm, tasty");
		hint4.setX(5);
		hint4.setY(190);
		hint4.setVisible(false);
		
		TextField ques4TxtF = new TextField();
		ques4TxtF.setTranslateX(5);
		ques4TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques4TxtF.getText().matches("A") || ques4TxtF.getText().matches("a")) {
					numOfRightAns++;
					t.setRoot(ques5(t));
				}
				else if(ques4TxtF.getText().matches("B") || ques4TxtF.getText().matches("b")) {
					t.setRoot(ques5(t));
				}
				else if(ques4TxtF.getText().matches("C") || ques4TxtF.getText().matches("c")) {
					t.setRoot(ques5(t));
				}
				else if(ques4TxtF.getText().matches("D") || ques4TxtF.getText().matches("d")) {
					t.setRoot(ques5(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
		
		Button hintBtn4 = new Button("Show Hint");
		hintBtn4.setTranslateX(5);
		hintBtn4.setTranslateY(150);
		
		hintBtn4.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				hint4.setVisible(true);
			}
		});
		
		hintBtn4.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	           hintBtn4.setEffect(shadow);
	          }
	        });

	    hintBtn4.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            hintBtn4.setEffect(null);
	          }
	        });
		
		Pane ques4Pane = new Pane();
		ques4Pane.getChildren().addAll(ques4,ansA,ansB,ansC,ansD,ques4TxtF,nxtBtn,hintBtn4,hint4,errorMsg);
		return ques4Pane;
	}
	
	public Pane ques5 (Scene t) {
		Text ques5 = new Text("Question 5: Which one of these characters were at God Valley");
		ques5.setFill(Color.RED);
		ques5.setX(5);
		ques5.setY(20);
		
		Text ansA = new Text("A)Sengoku");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Fisher Tiger");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Kuma");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Buggy");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint5 = new Text("HINT:I love traveling");
		hint5.setX(5);
		hint5.setY(190);
		hint5.setVisible(false);
		
		TextField ques5TxtF = new TextField();
		ques5TxtF.setTranslateX(5);
		ques5TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques5TxtF.getText().matches("A") || ques5TxtF.getText().matches("a")) {
					t.setRoot(ques6(t));
				}
				else if(ques5TxtF.getText().matches("B") || ques5TxtF.getText().matches("b")) {
					t.setRoot(ques6(t));
				}
				else if(ques5TxtF.getText().matches("C") || ques5TxtF.getText().matches("c")) {
					numOfRightAns++;
					t.setRoot(ques6(t));
				}
				else if(ques5TxtF.getText().matches("D") || ques5TxtF.getText().matches("d")) {
					t.setRoot(ques6(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
		
		Button hintBtn5 = new Button("Show Hint");
		hintBtn5.setTranslateX(5);
		hintBtn5.setTranslateY(150);
		
		hintBtn5.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				hint5.setVisible(true);
			}
		});
		
		hintBtn5.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	           hintBtn5.setEffect(shadow);
	          }
	        });

	    hintBtn5.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            hintBtn5.setEffect(null);
	          }
	        });
		
		Pane ques5Pane = new Pane();
		ques5Pane.getChildren().addAll(ques5,ansA,ansB,ansC,ansD,ques5TxtF,nxtBtn,hintBtn5,hint5,errorMsg);
		return ques5Pane;
		
		
	}
	
	public Pane ques6(Scene t) {
		
		Text ques6 = new Text("Question 6: Which object is on top of Vegapunk's head");
		ques6.setFill(Color.RED);
		ques6.setX(5);
		ques6.setY(20);
		
		Text ansA = new Text("A)Book");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Pear");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Rectangle");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Apple");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint6 = new Text("HINT: Newton's 1st Law");
		hint6.setX(5);
		hint6.setY(190);
		hint6.setVisible(false);
		
		TextField ques6TxtF = new TextField();
		ques6TxtF.setTranslateX(5);
		ques6TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques6TxtF.getText().matches("A") || ques6TxtF.getText().matches("a")) {
					t.setRoot(ques7(t));
				}
				else if(ques6TxtF.getText().matches("B") || ques6TxtF.getText().matches("b")) {
					t.setRoot(ques7(t));
				}
				else if(ques6TxtF.getText().matches("C") || ques6TxtF.getText().matches("c")) {
					t.setRoot(ques7(t));
				}
				else if(ques6TxtF.getText().matches("D") || ques6TxtF.getText().matches("d")) {
					numOfRightAns++;
					t.setRoot(ques7(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
		
		Button hintBtn6 = new Button("Show Hint");
		hintBtn6.setTranslateX(5);
		hintBtn6.setTranslateY(150);
		
		hintBtn6.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				hint6.setVisible(true);
			}
		});
		
		hintBtn6.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	           hintBtn6.setEffect(shadow);
	          }
	        });

	    hintBtn6.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            hintBtn6.setEffect(null);
	          }
	        });
		
		Pane ques6Pane = new Pane();
		ques6Pane.getChildren().addAll(ques6,ansA,ansB,ansC,ansD,ques6TxtF,nxtBtn,hintBtn6,hint6,errorMsg);
		return ques6Pane;
	}
	
	public Pane ques7 (Scene t) {
		Text ques7 = new Text("Question 7: What did the skypians call dirt on Sky Island");
		ques7.setFill(Color.RED);
		ques7.setX(5);
		ques7.setY(20);
		
		Text ansA = new Text("A)Mud Mud");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Verath");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Brownie");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Brown Gold");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint7 = new Text("HINT: Don't think about it too hard");
		hint7.setX(5);
		hint7.setY(190);
		hint7.setVisible(false);
		
		TextField ques7TxtF = new TextField();
		ques7TxtF.setTranslateX(5);
		ques7TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques7TxtF.getText().matches("A") || ques7TxtF.getText().matches("a")) {
					t.setRoot(ques8(t));
				}
				else if(ques7TxtF.getText().matches("B") || ques7TxtF.getText().matches("b")) {
					numOfRightAns++;
					t.setRoot(ques8(t));
				}
				else if(ques7TxtF.getText().matches("C") || ques7TxtF.getText().matches("c")) {
					t.setRoot(ques8(t));
				}
				else if(ques7TxtF.getText().matches("D") || ques7TxtF.getText().matches("d")) {
					t.setRoot(ques8(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
			    
				Button hintBtn7 = new Button("Show Hint");
				hintBtn7.setTranslateX(5);
				hintBtn7.setTranslateY(150);
				
				hintBtn7.setOnAction(new EventHandler <ActionEvent>() {
					@Override
					public void handle(ActionEvent args0) {
						hint7.setVisible(true);
					}
				});
				
				hintBtn7.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			           hintBtn7.setEffect(shadow);
			          }
			        });

			    hintBtn7.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            hintBtn7.setEffect(null);
			          }
			        });
				
				Pane ques7Pane = new Pane();
				ques7Pane.getChildren().addAll(ques7,ansA,ansB,ansC,ansD,ques7TxtF,nxtBtn,hintBtn7,hint7,errorMsg);
				return ques7Pane;
		
		
	}
	
	public Pane ques8(Scene t) {
		Text ques8 = new Text("Question 8: Out of these 4 characters which one has the highest bounty");
		ques8.setFill(Color.RED);
		ques8.setX(5);
		ques8.setY(20);
		
		Text ansA = new Text("A)Jack");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Charlotte Katakuri");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Basil Hawkins");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Jinbe");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint8 = new Text("HINT: Gives off uncle vibes");
		hint8.setX(5);
		hint8.setY(190);
		hint8.setVisible(false);
		
		TextField ques8TxtF = new TextField();
		ques8TxtF.setTranslateX(5);
		ques8TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques8TxtF.getText().matches("A") || ques8TxtF.getText().matches("a")) {
					t.setRoot(ques9(t));
				}
				else if(ques8TxtF.getText().matches("B") || ques8TxtF.getText().matches("b")) {
					t.setRoot(ques9(t));
				}
				else if(ques8TxtF.getText().matches("C") || ques8TxtF.getText().matches("c")) {
					t.setRoot(ques9(t));
				}
				else if(ques8TxtF.getText().matches("D") || ques8TxtF.getText().matches("d")) {
					numOfRightAns++;
					t.setRoot(ques9(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
			    
			    Button hintBtn8 = new Button("Show Hint");
				hintBtn8.setTranslateX(5);
				hintBtn8.setTranslateY(150);
				
				hintBtn8.setOnAction(new EventHandler <ActionEvent>() {
					@Override
					public void handle(ActionEvent args0) {
						hint8.setVisible(true);
					}
				});
				
				hintBtn8.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			           hintBtn8.setEffect(shadow);
			          }
			        });

			    hintBtn8.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            hintBtn8.setEffect(null);
			          }
			        });
				
				Pane ques8Pane = new Pane();
				ques8Pane.getChildren().addAll(ques8,ansA,ansB,ansC,ansD,ques8TxtF,nxtBtn,hintBtn8,hint8,errorMsg);
				return ques8Pane;
	}
	
	public Pane ques9 (Scene t) {
		Text ques9 = new Text("Question 9: Which arc was the first mythical zoan introduced ");
		ques9.setFill(Color.RED);
		ques9.setX(5);
		ques9.setY(20);
		
		Text ansA = new Text("A)Water 7");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Marineford");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Punk Hazard");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Sabaody Archipelago");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint9 = new Text("HINT: Bad ending");
		hint9.setX(5);
		hint9.setY(190);
		hint9.setVisible(false);
		
		TextField ques9TxtF = new TextField();
		ques9TxtF.setTranslateX(5);
		ques9TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques9TxtF.getText().matches("A") || ques9TxtF.getText().matches("a")) {
					t.setRoot(ques10(t));
				}
				else if(ques9TxtF.getText().matches("B") || ques9TxtF.getText().matches("b")) {
					numOfRightAns++;
					t.setRoot(ques10(t));
				}
				else if(ques9TxtF.getText().matches("C") || ques9TxtF.getText().matches("c")) {
					t.setRoot(ques10(t));
				}
				else if(ques9TxtF.getText().matches("D") || ques9TxtF.getText().matches("d")) {
					t.setRoot(ques10(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
			    
			    Button hintBtn9 = new Button("Show Hint");
				hintBtn9.setTranslateX(5);
				hintBtn9.setTranslateY(150);
				
				hintBtn9.setOnAction(new EventHandler <ActionEvent>() {
					@Override
					public void handle(ActionEvent args0) {
						hint9.setVisible(true);
					}
				});
				
				hintBtn9.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			           hintBtn9.setEffect(shadow);
			          }
			        });

			    hintBtn9.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            hintBtn9.setEffect(null);
			          }
			        });
				
				Pane ques9Pane = new Pane();
				ques9Pane.getChildren().addAll(ques9,ansA,ansB,ansC,ansD,ques9TxtF,nxtBtn,hintBtn9,hint9,errorMsg);
				return ques9Pane;
	}
	
	public Pane ques10(Scene t) {
		Text ques10 = new Text("Question 10: Which move did Luffy use to defeat Crocodile in Alabasta ");
		ques10.setFill(Color.RED);
		ques10.setX(5);
		ques10.setY(20);
		
		Text ansA = new Text("A)Gum-Gum Axe");
		ansA.setFill(Color.RED);
		ansA.setX(5);
		ansA.setY(40);
		
		Text ansB = new Text("B)Gum-Gum Jet Gatling");
		ansB.setFill(Color.RED);
		ansB.setX(5);
		ansB.setY(60);
		
		Text ansC = new Text("C)Gum-Gum Storm");
		ansC.setFill(Color.RED);
		ansC.setX(5);
		ansC.setY(80);
		
		Text ansD = new Text("D)Gum-Gum Golden Rifle");
		ansD.setFill(Color.RED);
		ansD.setX(5);
		ansD.setY(100);
		
		Text errorMsg = new Text("ERROR: PLEASE PUT IN VALID ANSWER");
		errorMsg.setVisible(false);
		errorMsg.setX(270);
		errorMsg.setY(137);
		
		Text hint10 = new Text("HINT: ");
		hint10.setX(5);
		hint10.setY(190);
		hint10.setVisible(false);
		
		TextField ques10TxtF = new TextField();
		ques10TxtF.setTranslateX(5);
		ques10TxtF.setTranslateY(120);
		
		Button nxtBtn = new Button("Next Question");
		nxtBtn.setTranslateX(170);
		nxtBtn.setTranslateY(120);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (ques10TxtF.getText().matches("A") || ques10TxtF.getText().matches("a")) {
					t.setRoot(loading(t));
				}
				else if(ques10TxtF.getText().matches("B") || ques10TxtF.getText().matches("b")) {
					t.setRoot(loading(t));
				}
				else if(ques10TxtF.getText().matches("C") || ques10TxtF.getText().matches("c")) {
					numOfRightAns++;
					t.setRoot(loading(t));
				}
				else if(ques10TxtF.getText().matches("D") || ques10TxtF.getText().matches("d")) {
					t.setRoot(loading(t));
				}
				else {
					errorMsg.setVisible(true);
				}
			}	
		});
		
		 nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(shadow);
			          }
			        });

			    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            nxtBtn.setEffect(null);
			          }
			        });
			    
			    Button hintBtn10 = new Button("Show Hint");
				hintBtn10.setTranslateX(5);
				hintBtn10.setTranslateY(150);
				
				hintBtn10.setOnAction(new EventHandler <ActionEvent>() {
					@Override
					public void handle(ActionEvent args0) {
						hint10.setVisible(true);
					}
				});
				
				hintBtn10.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			           hintBtn10.setEffect(shadow);
			          }
			        });

			    hintBtn10.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			            hintBtn10.setEffect(null);
			          }
			        });
				
				Pane ques10Pane = new Pane();
				ques10Pane.getChildren().addAll(ques10,ansA,ansB,ansC,ansD,ques10TxtF,nxtBtn,hintBtn10,hint10,errorMsg);
				return ques10Pane;
	}
	
	public Pane loading(Scene t) {
		t.getWindow().setHeight(100);
		Text loadTxt = new Text("All questions have now been answered. Please press next to see your results");
		loadTxt.setX(5);
		loadTxt.setY(20);
		
		Button nxtBtn = new Button("Next");
		nxtBtn.setTranslateY(30);
		nxtBtn.setTranslateX(5);
		
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				if (numOfRightAns<=3) {
					t.setRoot(rookieLvl(t));
				}
				else if(numOfRightAns>3 && numOfRightAns<=6) {
					t.setRoot(warlordLvl(t));
				}
				else if(numOfRightAns>7) {
					t.setRoot(empLvl(t));
				}
			}
		});
		
		nxtBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            nxtBtn.setEffect(shadow);
	          }
	        });

	    nxtBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            nxtBtn.setEffect(null);
	          }
	        });
		
		Pane loadPane = new Pane();
		loadPane.getChildren().addAll(loadTxt,nxtBtn);
		return loadPane;
		
	}
	
	public Pane rookieLvl(Scene t) {
		t.getWindow().setHeight(600);
		Text resultTxt = new Text("The results of this quiz was a " + numOfRightAns + "/10");
		Text rookieTxt = new Text("You are a rookie pirate. Next time study a little bit before taking this quiz");
		Text thankTxt = new Text("Thank you for taking this quiz and you are welcome to take it again");
		
		ImageView rookieImg = new ImageView("https://static.wikia.nocookie.net/onepiece/images/6/6e/Worst_Generation_Infobox.png/revision/latest?cb=20220406052554");
		rookieImg.setFitHeight(300);
		rookieImg.setFitWidth(400);
		
		Button againBtn = new Button("Take Again");
		
		againBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            againBtn.setEffect(shadow);
	          }
	        });

	    againBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            againBtn.setEffect(null);
	          }
	        });
	    
		againBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				reset();
				t.setRoot(openScreen(t));
			}
		});
		
		VBox rookiePane = new VBox(30);
		rookiePane.setAlignment(Pos.CENTER);
		rookiePane.getChildren().addAll(resultTxt,rookieTxt,thankTxt,rookieImg,againBtn);
		return rookiePane;
		
	
	}
	
	public Pane warlordLvl(Scene t) {
		t.getWindow().setHeight(600);
		Text resultTxt = new Text("The results of this quiz was a " + numOfRightAns + "/10");
		Text warlordTxt = new Text("You are a warlord level pirate. Pretty good but I know you can do better");
		Text thankTxt = new Text("Thank you for taking this quiz and you are welcome to take it again");
		
		ImageView warlordImg = new ImageView("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/6323b97e-f17a-41a9-a056-369757a2e4fc/dftrkjb-65d85292-a921-44ce-afa3-d64afe9805d5.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzYzMjNiOTdlLWYxN2EtNDFhOS1hMDU2LTM2OTc1N2EyZTRmY1wvZGZ0cmtqYi02NWQ4NTI5Mi1hOTIxLTQ0Y2UtYWZhMy1kNjRhZmU5ODA1ZDUuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.khzm8BSRDjmCUe3M-g1UadxwVHsBf529yoofTP3MfY4");
		warlordImg.setFitHeight(300);
		warlordImg.setFitWidth(400);
		
		Button againBtn = new Button("Take Again");
		againBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            againBtn.setEffect(shadow);
	          }
	        });

	    againBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            againBtn.setEffect(null);
	          }
	        });
		
		againBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				reset();
				t.setRoot(openScreen(t));
			}
		});
		
		VBox warlordPane = new VBox(30);
		warlordPane.setAlignment(Pos.CENTER);
		warlordPane.getChildren().addAll(resultTxt,warlordTxt,thankTxt,warlordImg,againBtn);
		return warlordPane;
	}
	
	public Pane empLvl(Scene t) {
		t.getWindow().setHeight(600);
		Text resultTxt = new Text("The results of this quiz was a " + numOfRightAns + "/10");
		Text empTxt = new Text("You are a emperor level pirate. Damn is there anyting you don't know about One Piece.");
		Text thankTxt = new Text("Thank you for taking this quiz and you are welcome to take it again");
		
		ImageView empImg = new ImageView("https://static.wikia.nocookie.net/onepiece/images/2/23/Four_Emperors_Infobox.png/revision/latest?cb=20231022181033");
		empImg.setFitHeight(300);
		empImg.setFitWidth(400);
		
		Button againBtn = new Button("Take Again");
		againBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            againBtn.setEffect(shadow);
	          }
	        });

	    againBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            againBtn.setEffect(null);
	          }
	        });
		
		againBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent args0) {
				reset();
				t.setRoot(openScreen(t));
			}
		});
		
		VBox empPane = new VBox(30);
		empPane.setAlignment(Pos.CENTER);
		empPane.getChildren().addAll(resultTxt,empTxt,thankTxt,empImg,againBtn);
		return empPane;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}