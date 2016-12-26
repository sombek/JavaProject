package sa.edu.yuc;

import java.io.Serializable;

public interface LinkedList<T> extends Serializable {

	public void add(T acc);

	public void removeByIndex(int index);

	public Node<T> findByIndex(int index);

	public void removeById(T id);

	public Node<T> findById(T id);

	public String toString();

}
