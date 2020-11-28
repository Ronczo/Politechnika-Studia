#include<iostream>
using namespace std;

double left_end, right_end, eps;

void data_input();
void data_verification();
double function(double);
double bisection(double, double, double);


int main() {
	// Hello!
	cout << "Searching zero of a function by bisection method..." << endl; 

	//Entering data
	data_input();  

	// Running the function, checking if the condition is fulfilled and showing the result
	if (function(left_end) * function(right_end) <= 0) {
		double result = bisection(left_end, right_end, eps);
		cout << "Zero of a function is for x = " << result << endl;
	}
	else {
		cout << "There is no zero of a function in mentiod interval." << endl;
	}

	return 0;
}

void data_verification() {
	/*
	The function verify data enter by user
	*/
	if (eps == 0) {
		cout << "The accuracy can't be equal 0. I am changin accuracy into 0.1..." << endl;
		eps = 0.1;
	}
	if (left_end > right_end || eps < 0) {
		cout << "Data is wrong. Please, enter data again:" << endl;
		cout << "Right end must be greater than left end, Accuracy must be greater than 0." << endl;
		data_input();
	}
	else {
		cout << "Data is correct. Running the funcition..." << endl;
	}
}

void data_input() {
	/*
	The function allows user to enter data
	*/
	cout << "Enter the left end of the interval: ";
	cin >> left_end;

	cout << "Enter the right end of the interval: ";
	cin >> right_end;

	cout << "Enter the accuracy (epsilon): ";
	cin >> eps;
	data_verification();
}

double function(double x) {
	return x - 5;  // Zero place for x = 5
}

double bisection(double first_point, double second_point, double eps) {
	/*
	The function calculates the zero of a function by bisection method
	*/
	double middle;

	do {
		// Calculating the middle
		middle = (first_point + second_point) / 2;

		if (function(middle) == 0) {
			break;  // If the middle is zero, break the loop
		}

		if (function(first_point) * function(middle) < 0) {
			second_point = middle; // if middle in on left side
		}
		else {
			first_point = middle;  //if middle is on right side
		}

	} while ((second_point - first_point) > eps);

	return middle;
}