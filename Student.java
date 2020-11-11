package domasno2;

import java.util.Scanner;

public class Student extends Covek {
	Ocenka o[]=new Ocenka[100];
  int n;
  public Student(String ime, String prezime, int n, Ocenka o[]) {
	  super(ime,prezime);
	  this.n=n;
	  this.o=o;
  }
  public Student() {
	  super();
	  n=0;
	  
  }
  public int getn() {
	  return n;
  }
  public void setn(int n) {
	  this.n=n;
  }
  public Ocenka[] geto() {
	  return o;
  }
  public void setOcenka(Ocenka o1) {
	o[n-1]=o1;
	  n++;
  }
  public double getprosek() {
	  double p=0;
	  for(int i=0;i<n;i++) {
		  p=p+o[i].getocenka();
	  }
	  p=p/n;
	  return p;
  }

}