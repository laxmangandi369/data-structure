package data.structure;

public class QuickFindUF {

	private int[] id;

	//constructor for initialization the int array with the same value as their index
	public QuickFindUF(int n) {
		id = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i;
		}
	}

	//checking if the two objects are connect or not will return true or false
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	// making connection between two objects
	public void union(int p, int q) {
		
		int pid = id[p];
		int qid = id[q];
		
		for(int i=0;i<id.length;i++) {
			if(id[i] == pid) {
				id[i] = qid;
			}
		}
	}

}
