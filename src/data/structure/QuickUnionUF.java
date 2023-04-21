package data.structure;

public class QuickUnionUF {

	private int[] id;

	public QuickUnionUF(int n) {
		id = new int[n];
		// set the id of each object to it self
		for (int i = 0; i < n; i++) {
			id[i] = i;
		}
	}
	// chases the parent pointer until we find the root
	private int root(int i) {
		while (id[i] != i) {
			i = id[i];
		}
		return i;
	}
	// checks if p and q has same root.
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	// change the root of p to point to the root of q
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		
		id[i] = j;
	}
}
