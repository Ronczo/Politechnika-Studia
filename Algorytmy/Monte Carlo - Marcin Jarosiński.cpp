#include<iostream>
using namespace std;

double f(double x) {
	return 2 * x;
}

double monte_carlo(double a, double b, int n) {

	double sum = 0;
	for (int i = 1; i <= n; i++) {
		double xlos = (double)rand() / (double)RAND_MAX * (b - a) + a;
		sum = sum + f(xlos);
	}
	double result = (b - a) / n * sum;
	return result;
}


int main() {
	// wczytanie a, b, n
	cout << "Calkowanie metoda Monte-Carlo" << endl;
	cout << "Podaj a = ";
	double a;
	cin >> a;
	cout << "Podaj b = ";
	double b;
	cin >> b;

	//Kontrola poprawnosci danych  a <= b , n > 0. - praca domowa. 

	int n;
	do {
		cout << "Podaj n = ";
		cout << "n musi byc wieksze od 0";
		cin >> n;
	} while (n < 0);
	
	
	if (a <= b) {
		double integral = monte_carlo(a, b, n);
		cout << "Calka wynosi: " << integral;
	}
	else {
		cout << "Niepoprawne dane. Uruchom program ponownie";
	}


	return 0;

}