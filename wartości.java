package BlackJack;

public enum warto�ci {
	Dwa(2),
	Trzy(3),
	Cztery(4),
	Pi��(5),
	Sze��(6),
	Siedem(7),
	Osiem(8),
	Dziewi��(9),
	Dziesi��(10),
	Walet(10),
	Dama(10),
	Kr�l(10),
	As(11);
	
	private final int value;
	
	private warto�ci(int value) {
		this.value = value;
	}
	
	public int getwarto�ci() {
		return value;
	}

}
