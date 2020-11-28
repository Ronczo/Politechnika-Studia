#include<iostream>
#include<time.h>
using namespace std;

void random_test(int m, int n) {
	int choose, left;

	choose = m;
	left = n;

	srand(time(NULL)); 

	for (int i = 1; i <= n; i++) {
		double probability = (double)choose / (double)left;
		double fortune = (double)rand() / ((double)RAND_MAX + 1.0);
		if (fortune < probability) {
			cout << i << endl;
			choose--;
		}
		left--;
	}

}


int main() {
	int m;  
	int n;  
	cout << "Generowanie podciagow metoda testu losowego\n";

	cout << "Podaj dlugosc podciagu m, = ";
	cin >> m;
	cout << "Podaj zakres losowania, n = ";
	cin >> n;

	if (m <= n && m > 0 && n > 0) {
		random_test(m, n);
	}
	else {
		cout << "Podano bledne dane" << endl;
	}

	return 0;
}