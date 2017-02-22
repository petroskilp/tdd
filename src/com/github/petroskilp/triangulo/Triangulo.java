package com.github.petroskilp.triangulo;

public class Triangulo {
	
	public Triangulo(){
	}
	public int tipoTriangulo(double a, double b, double c){
		int tipo =0;
		if(a<0||a>99||b<0||b>99||c<0||c>99){
			return tipo;
		}
		if(a==b && b==c)
            tipo=1;

        else if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
            tipo=4;

        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
            tipo=2;

        else if(a!=b && b!=c && c!=a)
            tipo=3;
		return tipo;
	}

}
