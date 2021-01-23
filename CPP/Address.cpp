#pragma once
#include<iostream>
#include"my_classes.h"

using namespace std;

Address::Address() {
	street = "Lincolns";
	buildingNumber = 1;
	flatNumber = 1;
	postCode[0] = 10;
	postCode[1] = 100;
	city = "New York";
}
Address::Address(string _street, int _buildingNumber, int _flatNumber, int* _postCode, string _city) :
	street(_street),
	buildingNumber(_buildingNumber),
	flatNumber(_flatNumber),
	city(_city)
{
	for (int i = 0; i < (sizeof(postCode) / sizeof(postCode[0])); i++) {
		postCode[i] = _postCode[i];
	}

}

// Getters and setters

void Address::setStreet(string _street) { street = _street; }
void Address::setBulding_number(int _buildingNumber) { buildingNumber = _buildingNumber; }
void Address::setFlat_numer(int _flatNumber) { flatNumber = _flatNumber; }
void Address::setPost_code(int* _postCode) {
	postCode[0] = _postCode[0];
	postCode[1] = _postCode[1];
}
void Address::setCity(string _city) { city = _city; }

string Address::getStreet() { return street; }
int Address::getBuldingNumber() { return buildingNumber; }
int Address::getFlatNumber() { return flatNumber; }
int* Address::getPostCode() { return postCode; }
string Address::getCity() { return city; }
