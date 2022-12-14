class Node {
	// linked list attributes
	private final DraftCover attempt;
	private final Node next;

	public Node(DraftCover value, Node next) {
		this.attempt = value;
		this.next = next;
	}
	public Node getNext() {
		return next;
	}

	public DraftCover getValue() {
		return attempt;
	}

	public  String toString() {
		StringBuilder Sequence = new StringBuilder();
		for (Node cursor = this;
			 cursor != null;
			 cursor = cursor.getNext()) {
			 Sequence.append(cursor.getValue()).append("\n");

		}
		//checks the lineup that is outputted
		//System.out.println(Sequence);

		return Sequence.toString();
	}
}



