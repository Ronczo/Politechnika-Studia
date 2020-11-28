#include<iostream>
using namespace std;

bool is_table_sorted(int [], int);
int binary_research(int[], int, int);
void insertionsort(int*, int);

int main() {
	// Hello!
	cout << "Binary search..." << endl;

	//Creating table
	int n;
	do {
		cout << "Eneter number of elements in table: ";
		cin >> n;
	} while (n <= 0);

	int* T = new int[n];  

	//Entering elements of table
	if (n <= 5) {
		for (int i = 0; i < n; i++) {
			cout << "Enter element " << i << ": ";
			cin >> T[i];
		}
	}
	// or randomly choose if n is greater than 5
	else {
		for (int i = 0; i < n; i++) {
			T[i] = rand();
		}
	}

	//Asking user for number to find
	int number_to_find;
	cout << "Enter numer to find: ";
	cin >> number_to_find;

	//Sort table, if it's not sorted
	if (is_table_sorted(T, n) == false) {
		cout << "The table is not sorted." << endl << "Sorting..." << endl;
		insertionsort(T, n);
	}

	cout << "Looking for number " << number_to_find << " in: ";
	for (int i = 0; i < n; i++) {
		cout << T[i] << ", ";
	}

	int result = binary_research(T, n, number_to_find);

	if (result == -1) {
		cout << "\nThis number is not in table" << endl;
	}
	else {
		cout << "\nNumber " << number_to_find << " was found on position " << result++ << endl;
	}


	return 0;
}

bool is_table_sorted(int Table[],int n) {
	/*
	The function checks if the table is sorted
	*/
	bool is_sorted = true;
	for (int i = 0; i < n - 1; i++) {  
		if (Table[i] > Table[i + 1]) {
			is_sorted = false;
			break;
		}
	}
	return is_sorted;
}

void insertionsort(int* T, int n) {
	/*
	The funciton sorts Table using insertion sort
	*/
	for (int i = 1; i < n; i++) {
		for (int j = i; j >= 1; j--) {
			if (T[j] < T[j - 1]) {
				int tmp = T[j];
				T[j] = T[j - 1];
				T[j - 1] = tmp;
			}
		}
	}
}

int binary_research(int T[], int n, int p) {
	/*
	The function finds element using binary research
	*/
	int down = 0;
	int top = n - 1;
	int result;
	while (true) {
		if (down > top) {
			result = -1;
			break;
		}

		int middle = (down + top) / 2;

		if (T[middle] < p) {
			down = middle + 1;
		}
		else if (T[middle] == p) {
			result = middle;
			break;
		}
		else if (T[middle] > p) {
			top = middle - 1;
		}
	}

	return result;
}