package domasno2;

public class Covek {
	private String ime;
	private String prezime;
	public Covek(String ime, String prezime) {
		this.ime=ime;
		this.prezime=prezime;
	}
		public Covek() {
	
		ime=" ";
		prezime=" ";
	}
	public String getime() {
		return ime;
	}
	public void setime(String ime) {
		this.ime=ime;
	}
	public String getprezime() {
		return prezime;
	}
	public void setprezime(String prezime) {
		this.prezime=prezime;
	}
	public String toString()
	{
		String	c=("Covek:"+ime+" "+prezime);
		return c;
	}

}
