package aulas;

public class Log implements Comparable<Log> {
	
	private Integer pk;

	public Log(Integer pk) {
		super();
		this.pk = pk;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	@Override
	public int compareTo(Log p) {
		
		return pk.compareTo(p.getPk());
	}

}