#pragma once

#include<iostream>
#include<string>
#include"my_classes.h"

using namespace std;

class Customer {
	string customerName;
	Address customerAddress;

public:
	Customer();
	Customer(string cusotmerName, Address customerAddress);

	void setCustomerName(string);
	void setCustomerAddress(Address);

	string getCustomerName();
	Address getCustomerAddress();
};

