package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
			System.out.println("Inserte la longitud del arreglo");
			int n = sc.nextInt(), suma;
			int a[] = new int[n];
			System.out.println("inserte los datos");
			for (int i = 0; i < a.length; i++) {
				n = sc.nextInt();
				a[i] = n;
			}
			System.out.println("ahora inserte la suma meta");

			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, 0, suma));
		sc.close();
	}

	boolean esSubconjuntoSumaExt(int a[], int n, int suma)
	{
		if (suma == 0 ){
			return true;}
		if (n == a.length){
			return false;}
		if(n<a.length-1){
			if ((a[n]% 7)==0 && a[n+1]==1){
				return esSubconjuntoSumaExt(a, n + 1, suma ); 
			} 
			if ((a[n]% 7)==0 &&a[n+1]!=1){
				return esSubconjuntoSumaExt(a, n + 1, suma - a[n]);
			}
		}
		return esSubconjuntoSumaExt(a, n + 1, suma - a[n])
		|| esSubconjuntoSumaExt(a, n + 1, suma );
	}
}