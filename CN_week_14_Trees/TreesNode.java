package CN_week_14_Trees;

import java.util.ArrayList;

public class TreesNode<T> {
	T data;
	ArrayList<TreesNode<T>>children;

	public TreesNode(T data) {
		this.data=data;
		children =new ArrayList();
	}
}
