#pragma once
#include<iostream>
#include"my_classes.h"

using namespace std;

class NetworkOfWholesales {
protected:
	string nameOfTheNetwork;
	string countryOfTheNetwork;
public:
	NetworkOfWholesales();
	NetworkOfWholesales(string nameOfTheNetwork, string countryOfTheNetwork);

	void setNameOfTheNetwork(string);
	void setCuntryOfTheNetwork(string);

	string getNameOfTheNetwork();
	string getCuntryOfTheNetwork();
};
