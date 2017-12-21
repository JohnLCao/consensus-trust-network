import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {
	private double probGraph;
	private double probMalicious;
	private double probTxDistribution;
	private int numRounds;
	private boolean[] followees;
	private Set<Transaction> pendingTxs;
	
    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
        // IMPLEMENT THIS
    	probGraph = p_graph;
    	probMalicious = p_malicious;
    	probTxDistribution = p_txDistribution;
    	this.numRounds = numRounds;
    }

    public void setFollowees(boolean[] followees) {
        // IMPLEMENT THIS
    	this.followees = followees;
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        // IMPLEMENT THIS
    	this.pendingTxs = pendingTransactions;
    }

    public Set<Transaction> sendToFollowers() {
        // IMPLEMENT THIS
    	return pendingTxs; 
    }

    public void receiveFromFollowees(Set<Candidate> candidates) {
        // IMPLEMENT THIS
    	for(Candidate c : candidates) {
    		pendingTxs.add(c.tx);
    	}
    }
}
