#pragma once
#include<iostream>

using namespace std;

class Address {
	string street;
	int buildingNumber;
	int flatNumber;
	int postCode[2];
	string city;

public:
	Address();
	Address(string street, int buldingNumber, int flatNumber, int* postCode, string city);

	void setStreet(string);
	void setBulding_number(int);
	void setFlat_numer(int);
	void setPost_code(int*);
	void setCity(string);

	string getStreet();
	int getBuldingNumber();
	int getFlatNumber();
	int* getPostCode();
	string getCity();
};
