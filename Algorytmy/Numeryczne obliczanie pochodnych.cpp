#include <iostream>
using namespace std;

double f(double x) {
	// Funkcja, ktorej liczymy pochodna
	return x * x * x + 5;
}

double fp_an(double x) {
	// Analityczny wzor na pierwsza pochodna funkcji f(x)
	return 3 * x * x;
}

double fpp_an(double x) {
	//Analityczny wzor na durga pochodna funkcji f(x)
	return 6 * x;
}

double fp_num(double x, double h) {
	//Numeryczny wzor na pierwsza pochodna funkcji f(x)
	double result = (f(x + h) - f(x - h)) / (2 * h);

	return result;
}

double fpp_num(double x, double h) {
	//Numeryczny wzor na druga pochodna funkcji f(x)
	double result = (f(x + h) + f(x - h) - 2 * f(x)) / (h * h);

	return result;
}


int main() {
	cout << "Program oblicza 1 i 2 pochodna funkcji f(x) = x^3 + 5" << endl;
	cout << "Podaj x: ";
	double x;
	cin >> x;

	
	double h;
	do {
		cout << "Podaj h (odleglosc od punktu - im mniejsza tym dokladniejszy bedzie wynik): ";
		cin >> h;
	} while (h < 0);


	cout << "Wyniki analicztynie \n";
	cout << "f'(" << x << ") =" << fp_an(x) << endl;
	cout << "f''(" << x << ") =" << fpp_an(x) << endl;

	cout << "Wyniki numerycznie \n";
	cout << "f'(" << x << ") =" << fp_num(x, h) << endl;
	cout << "f''(" << x << ") =" << fpp_num(x, h) << endl;



	return 0;
}
