/*
 * AppFrame.java

 *
 * Created on 2008. március 14., 15:22
 */

package smartsettlers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JScrollBar;
import smartsettlers.boardlayout.*;

/**
 *
 * @author  szityu
 */
public class AppFrame extends javax.swing.JFrame implements GameStateConstants {
    
    BoardLayout boardlayout;
    DefaultListModel listModel;
//    ListSelectionListener selChanged;
    
    /** Creates new form AppFrame */
    public AppFrame() {
        initComponents();
        listModel = new DefaultListModel();
        
        jList1.setModel(listModel);
        
        
        boardlayout = new BoardLayout(settlersPanel1.getWidth(),settlersPanel1.getHeight());
        settlersPanel1.SetBoardLayout(boardlayout);
        boardlayout.InitBoard();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settlersPanel1 = new smartsettlers.display.SettlersPanel();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        settlersPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jTextField1.setEditable(false);
        jTextField1.setText("state");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(statusMessageLabel))
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusMessageLabel)
                            .addComponent(statusAnimationLabel)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton3.setText(">> 10");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Play One Game");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("1000 games");
        //jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField2.setText("0");

        jButton6.setText("Data Collection");
        jButton6.setEnabled(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Experiment");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settlersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)))
                    .addComponent(settlersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boardlayout.NewGame(boardlayout.state, true);
        jTextField1.setText(boardlayout.gamelog.toString());
        listModel.clear();
        //listModel.addElement(boardlayout.gamelog.toString());
        
//        boardlayout.GameTick(boardlayout.state,boardlayout.action);
        settlersPanel1.repaint();        
    }//GEN-LAST:event_jButton2ActionPerformed
    private void makeOneStep()
    {
        int ind;
        int[] action_cp = null;// Take a closer look
        JScrollBar scrollbar = jScrollPane1.getVerticalScrollBar();
        
        ind = jList1.getSelectedIndex();
        if ((ind == -1) || (ind == listModel.getSize() - 1)) {
            boardlayout.GameTick(boardlayout.state, boardlayout.action);
            //Copy the action from boardlayout.action and state of the game here
            for(int i = 0; i< boardlayout.action.length; i++){
            	action_cp[i] = boardlayout.action[i];
            }
            jTextField1.setText(boardlayout.gamelog.toString());
            listModel.addElement(boardlayout.gamelog.toString());
            jList1.validate();
            jScrollPane1.validate();

            jList1.setSelectedIndex(listModel.getSize() - 1);
            scrollbar.setValue(scrollbar.getMaximum());
        } else {
            jList1.setSelectedIndex(ind + 1);
            scrollbar.setValue(scrollbar.getValue() + scrollbar.getUnitIncrement(1));
        }

//        settlersPanel1.repaint();
        settlersPanel1.paintAll(settlersPanel1.getGraphics());
        jList1.paintAll(jList1.getGraphics());
        //boardlayout.recalcLongestRoad(boardlayout.state);
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        makeOneStep();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int i;
        for (i=0; i<10; i++)
            makeOneStep();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        int ind = jList1.getSelectedIndex();
        
        if (ind==-1)
            return;
        int max_lenght = boardlayout.gamelog.states.size();
        if(ind+1 < max_lenght - 1 ){
        	boardlayout.setState((int [])boardlayout.gamelog.states.get(ind+1));
        	jTextField1.setText(boardlayout.gamelog.toString(ind));
        }
            
        settlersPanel1.repaint();        
                
    }//GEN-LAST:event_jList1ValueChanged

    public void playOneGame()
    {
        JScrollBar scrollbar = jScrollPane1.getVerticalScrollBar();
        int round = 0;
        do
        {
            boardlayout.GameTick(boardlayout.state,boardlayout.action);
            //jTextField1.setText(boardlayout.gamelog.toString());
            listModel.addElement(boardlayout.gamelog.toString());

            jList1.validate();
            jScrollPane1.validate();

            jList1.setSelectedIndex(listModel.getSize() - 1);
            scrollbar.setValue(scrollbar.getMaximum());
            settlersPanel1.paintAll(settlersPanel1.getGraphics());
            jList1.paintAll(jList1.getGraphics());
            round++;
            if(round>1000){
            	break;
            }
            //this.paintAll(this.getGraphics());
        } while (boardlayout.getWinner(boardlayout.state) == -1);
        
        //print number trad and trad offer
        /*
        if(round<1000){
        	System.out.println("Trading Accepted: " + boardlayout.tradingAccepte);
            System.out.println("Tradning offer: "+ boardlayout.tradingOffer);
            //boardlayout.GameTick(boardlayout.state,boardlayout.action);
            listModel.addElement(boardlayout.gamelog.toString());
        }
        try {
        	String content = "";
			for(int pl = 0; pl < NPLAYERS; pl++){
				for(int ind_type = 0; ind_type < N_DEVCARDTYPES; ind_type++){
					for(int ind_card = 0; ind_card < NCARDS; ind_card++){
						
						if(boardlayout.playingAveragingTime[pl][ind_type][ind_card] != 0){
							content = content.concat("Type: "+ind_type + " "+boardlayout.playingAveragingTime[pl][ind_type][ind_card]+"\n");
						}
					}
				}
			}
			System.out.println(content);
			File file = new File("C:\\Users\\AILAB\\Documents\\gameStatistic.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}*/
        boardlayout.GameTick(boardlayout.state,boardlayout.action);
        listModel.addElement(boardlayout.gamelog.toString());
        
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JScrollBar scrollbar = jScrollPane1.getVerticalScrollBar();
        
        playOneGame();
        jList1.validate();
        jScrollPane1.validate();

        jList1.setSelectedIndex(listModel.getSize()-1);
        scrollbar.setValue(scrollbar.getMaximum());
        
        settlersPanel1.repaint();     
        //boardlayout.recalcLongestRoad(boardlayout.state);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JScrollBar scrollbar = jScrollPane1.getVerticalScrollBar();

        long starttime = System.currentTimeMillis();
        for(int i=0; i<10000; i++)
        {
//            jTextField2.setText("" + (i + 1));
//            jTextField2.validate();
//            jTextField2.repaint();
//            validate();
            boardlayout = new BoardLayout(settlersPanel1.getWidth(),settlersPanel1.getHeight());
            boardlayout.InitBoard();
            boardlayout.NewGame(boardlayout.state, false);
//            listModel.clear();
            do
            {
                boardlayout.GameTick(boardlayout.state,boardlayout.action);
//                listModel.addElement(boardlayout.gamelog.toString());
            } while (boardlayout.getWinner(boardlayout.state) == -1);
            boardlayout.GameTick(boardlayout.state,boardlayout.action);
            playOneGame();
        }
        long totaltime = System.currentTimeMillis() - starttime;
        jList1.validate();
        jScrollPane1.validate();

        jList1.setSelectedIndex(listModel.getSize()-1);
        scrollbar.setValue(scrollbar.getMaximum());
        
        settlersPanel1.repaint();     
            jTextField2.setText("" + (totaltime/1000.0));
            jTextField2.validate();

    }//GEN-LAST:event_jButton5ActionPerformed
    public void addIntMatrix(int[][] first_matrix, int[][] second_matrix){
    	for(int i = 0; i < first_matrix.length; i++){
    		for(int j = 0; j<first_matrix[0].length; j++){
    			first_matrix[i][j] += second_matrix[i][j];
    		}
    	}
    }
    public void addIntMatrix(int[][] first_matrix, double[][] second_matrix){
    	for(int i = 0; i < first_matrix.length; i++){
    		for(int j = 0; j<first_matrix[0].length; j++){
    			first_matrix[i][j] += (int)second_matrix[i][j];
    		}
    	}
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    	//boardlayout.UCTsimulateGame(boardlayout.state);
    	//int[][] game_data_offer = new int[10][1];
    	//int[][] game_data_accepted = new int[10][1];
    	int[][] conditional_probability_matrix = new int[N_DEVCARDTYPES][15];
     	//int player1win = 0;
    	//int player2win = 0;
    	for(int i =0; i<100;i++){
        	JScrollBar scrollbar = jScrollPane1.getVerticalScrollBar();
        	initComponents();
            listModel = new DefaultListModel();
            jList1.setModel(listModel);
            boardlayout = new BoardLayout(settlersPanel1.getWidth(),settlersPanel1.getHeight());
           
            settlersPanel1.SetBoardLayout(boardlayout);
            boardlayout.InitBoard();
            playOneGame();
            jList1.validate();
            jScrollPane1.validate();

            jList1.setSelectedIndex(listModel.getSize()-1);
            scrollbar.setValue(scrollbar.getMaximum());
                
            settlersPanel1.repaint();
            int winner = boardlayout.getWinner(boardlayout.state);
            boardlayout.final_update_conditionalpro();
            this.addIntMatrix(conditional_probability_matrix, boardlayout.cardPlayingTimetimeStamp);
		}
    	try {
    		this.addIntMatrix(conditional_probability_matrix,boardlayout.hmmPredictor.getConditionalPro());
			String content = "";

			File file = new File("C:\\Users\\AILAB\\Documents\\hmmData.txt");
			for(int i = 0; i < conditional_probability_matrix.length; i++){
	    		for(int j = 0; j<conditional_probability_matrix[0].length; j++){
	    			content = content.concat(Integer.toString(conditional_probability_matrix[i][j])+',');
	    		}
	    		content = content.concat("\n");
	    	}
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
    	//Write data into text file
    	/*
		float rate = 0;
		float total_offer = 0, total_accepted = 0;
		int i;
    	for( i=0 ;i<10;i++){
    		total_offer += (float)game_data_offer[i][0];
    		total_accepted += (float)game_data_accepted[i][0];
    		rate = (float)(total_accepted/total_offer);
    		
    	}
    	
    	try {

			String content = "Final Game Statistic with Number of Iteration "+ boardlayout.NUM_IT +": Rate: "
							+rate;

			File file = new File("C:\\Users\\AILAB\\Documents\\data_from_2_game.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}*/
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int winner;
        int[] winlist = new int[4];
        int[][] scorelist = new int[4][13];
        int j, k;
        
        String s;

        PrintStream f;
        String fname = "winstats.txt";

        listModel.clear();
        long starttime, totaltime;
        for(int i=0; i<1000; i++)
        {
            starttime = System.currentTimeMillis();
            boardlayout.NewGame(boardlayout.state, false);
            do
            {
                boardlayout.GameTick(boardlayout.state,boardlayout.action);
                winner = boardlayout.getWinner(boardlayout.state);
            } while (winner == -1);
            boardlayout.GameTick(boardlayout.state,boardlayout.action);
            totaltime = System.currentTimeMillis() - starttime;
            winlist[winner]++;
            s = String.format("N=%d \t %d/%d/%d/%d \t time: %d s \t @ ", i, winlist[0],winlist[1],winlist[2],winlist[3],totaltime/1000);
            int score;
            for (j=0; j<4; j++)
            {
                score = boardlayout.state[OFS_PLAYERDATA[j]+OFS_SCORE];
                scorelist[j][score]++;
                for (k=1; k<=12; k++)
                {
                    s = s + scorelist[j][k] + " ";
                }
                s = s + "| ";
            }
            try 
            {            
                f = new PrintStream(new FileOutputStream(fname, true));
                f.println(s);
                f.close();
            } 
            catch (FileNotFoundException ex1) 
            {
                Logger.getLogger(AppFrame.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        settlersPanel1.repaint();     

        
        
    }//GEN-LAST:event_jButton7ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JProgressBar progressBar;
    private smartsettlers.display.SettlersPanel settlersPanel1;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    // End of variables declaration//GEN-END:variables
    
}
