package BlackJack;

public enum wartoœci {
	Dwa(2),
	Trzy(3),
	Cztery(4),
	Piêæ(5),
	Szeœæ(6),
	Siedem(7),
	Osiem(8),
	Dziewiêæ(9),
	Dziesiêæ(10),
	Walet(10),
	Dama(10),
	Król(10),
	As(11);
	
	private final int value;
	
	private wartoœci(int value) {
		this.value = value;
	}
	
	public int getwartoœci() {
		return value;
	}

}
