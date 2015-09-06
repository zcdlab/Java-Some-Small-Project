
class LinkList {
	private class Node {
		public Object item;
		public Node next;
	}

	private Node head;
	private Node slider;
	private int count;

	public LinkList() {
		clear();
	}

	public void clear() {
		head = null;
		slider = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void gotoFirst() {
		slider = head;
	}

	public Object nextItem() {
		if (slider == null) {
			return null;
		}

		Object o = slider.item;

		slider = slider.next;

		return o;
	}

	public Object getFirst() {
		return head.item;
	}

	public Object getAt(int index) {
		if (index < 0 || index >= count) {
			return null;
		}

		Node g = head;

		for (int i = 0; i < index; i++) {
			g = g.next;
		}

		return g.item;

	}

	public void addAt(Object item, int index) {
		Node g = head;
		Node ag = head;

		if (index < 0) {
			addFirst(item);
		} else if (index >= count) {
			addLast(item);
		} else {
			for (int i = 0; i < index; i++) {
				if (g == ag) {
					g = g.next;
				} else {
					ag = g;
					g = g.next;
				}
			}

			if (index == 0) {
				head = new Node();
				head.item = item;
				head.next = g;
			} else {
				ag = new Node();
				ag.item = item;
				ag.next = g;
			}

			count++;
		}
	}

	public Object removeAt(int index) {
		if (index < 0 || index >= count) {
			return null;
		}

		Node g = head;
		Node ag = head;

		for (int i = 0; i < index; i++) {
			if (g == ag) {
				g = g.next;
			} else {
				ag = g;
				g = g.next;
			}
		}

		if (index == 0) {
			head = head.next;
		} else {
			ag.next = g.next;
		}

		count--;

		return g.item;
	}

	public void addFirst(Object item) {
		Node g = head;

		head = new Node();
		head.item = item;
		head.next = g;

		count++;
	}

	public void addLast(Object item) {
		if (head == null) {
			head = new Node();
			head.next = null;
			head.item = item;
		} else {
			Node s = head;

			for (int i = 0; i < count; i++) {
				if (s.next == null) {
					break;
				}

				s = s.next;
			}

			s.next = new Node();
			s = s.next;
			s.next = null;
			s.item = item;
		}

		count++;
	}

	public int length() {
		return count;
	}

	public Object removeFirst() {
		return removeAt(0);
	}

	public Object removeLast() {
		return removeAt(count - 1);
	}
}