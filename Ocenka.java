package domasno2;

public class Ocenka {
	private String predmet;
	private String datumNaIspit;
	private  int ocenka;
	public Ocenka(String predmet, String datumNaIspit, int ocenka) {
		this.predmet=predmet;
		this.datumNaIspit=datumNaIspit;
		this.ocenka=ocenka;
	}
public Ocenka() {
	predmet=" ";
	datumNaIspit=" ";
	ocenka=0;
}
public String getpredmet() {
	return predmet;
}
public void setpredmet(String predmet) {
	this.predmet=predmet;
}
public String getdatumNaIspit() {
	return datumNaIspit;
}
public void setdatumNaIspit(String datumNaIspit) {
	this.datumNaIspit=datumNaIspit;
}
public int getocenka() {
	return ocenka;
}
public void setocenka(int ocenka) {
	this.ocenka=ocenka;
}
public String toString()
{
	String	o=("ocenka: "+predmet+" "+datumNaIspit+" "+ocenka);
	return o;
}
}
