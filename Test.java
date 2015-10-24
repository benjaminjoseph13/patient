class Test {
	public static void main (String[] args) {

		Sorting sort = new Sorting(3);
		sort.getValue(0,"Benjamin Joseph", "Longakit", 17, "Marilao, Bulacan");
		sort.getValue(1,"Jean Arlha", "Rodrin", 17, "Naic, Cavite");
		sort.getValue(2,"Ericka", "Urriza", 19, "Majayjay, Laguna");

		System.out.println("\n**** ORIGINAL ****");
		sort.display();

		System.out.println("\n **** Sorted By AGE ****");
		sort.bubbleSort();
		sort.display();
	}
}

