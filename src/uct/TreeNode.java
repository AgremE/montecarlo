/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uct;

import smartsettlers.boardlayout.GameStateConstants;

/**
 *
 * @author szityu
 */
/*
 * Improve by Agrem_E(@Makara Phav)
 * */
public class TreeNode implements GameStateConstants {

    public int nvisits;
    public int[][] nwins;
    public double[][] values;
    public int nactions;
    public int[] nactionvisits;
    public int timeStamp;
    public double[] rewardActionStep;
    public double[][] expectedReward;
    public int[][] count;
    public int first_action = 0;
    public double nodeReward = 0;
    
    public TreeNode(int nactions)
    {
        nvisits = 0;
        nwins = new int[nactions][];
        values = new double[nactions][];
        rewardActionStep = new double[1001]; // 20000 is MAXTRACE
        expectedReward = new double[NPLAYERS][nactions];
        count = new int[NPLAYERS][nactions];
        for (int i=0; i<nactions; i++)
        {
            nwins[i] = new int[NPLAYERS];
            values[i] = new double[NPLAYERS];
        }
        this.nactions = nactions;
        nactionvisits = new int [nactions];
    }
    
    public TreeNode(int nactions, int player, int[] virtualwins)
    {
        this(nactions);// This one call above function
        for (int i=0; i<nactions; i++)
            nwins[i][player] = virtualwins[i];
    }
    // Just to get the number of win for each action corresponding to each player
    public int[][] getNumWin(){
    	
    	return this.nwins;
    }
    public double[] getRward(){
    	return this.rewardActionStep;
    }
    public int[][] getCount(){
    	return this.count;
    }
    public void setExpectedReward(int pl, int action_ind,double reward){
    	
    	this.expectedReward[pl][action_ind] = reward;
    	
    }
}
