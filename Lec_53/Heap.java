package Lec_53;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> Al = new ArrayList<Integer>();

	public int size() {
		return Al.size();
	}

	public boolean isEmpty() {
		return Al.isEmpty();
	}

	public void disp() {
		System.out.println(Al);
	}

	public void add(int ele) {
		Al.add(ele);
		int child = Al.size() - 1;
		UpHeapify(child);
	}

	private void UpHeapify(int child) {
		// TODO Auto-generated method stub
		int parent = (child - 1) / 2;

		if (Al.get(parent) > Al.get(child)) {
//			Jado!! swap!!
			swap(child, parent);
			UpHeapify(parent);
		}
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = Al.get(i);
		Al.set(i, Al.get(j));
		Al.set(j, temp);
	}

	public int peek() {
		return Al.get(0);
	}

	public int poll() {
		int temp = Al.get(0);
//		Sweap 0th with last element Al.get(Al.size()-1)

		Al.set(0, Al.get(Al.size() - 1));
		Al.remove(Al.size() - 1);

		DownHeapify(0);

		return temp;
	}

	private void DownHeapify(int parent) {
		// TODO Auto-generated method stub
		int c1 = parent * 2 + 1;
		int c2 = parent * 2 + 2;

		int min_idx = parent;

		if (c1 < Al.size() && Al.get(min_idx) > Al.get(c1)) {
			min_idx = c1;
		}

		if (c2 < Al.size() && Al.get(min_idx) > Al.get(c2)) {
			min_idx = c2;
		}

		if (min_idx != parent) {
			swap(min_idx, parent);
			DownHeapify(min_idx);
		}

	}

}
