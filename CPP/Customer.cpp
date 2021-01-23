#pragma once
#include<iostream>
#include"my_classes.h"

using namespace std;

Customer::Customer(){
	customerName = "domyslna nazwa";
	customerAddress = Address();
}

Customer::Customer(string _customerName, Address _customerAddress){
	customerName = _customerName;
	customerAddress = _customerAddress;
}

// Getters and setters

void Customer::setCustomerName(string _customerName){
	customerName = _customerName;
}

void Customer::setCustomerAddress(Address _customerAddress){
	customerAddress = _customerAddress;
}

string Customer::getCustomerName()
{
	return customerName;
}

Address Customer::getCustomerAddress()
{
	return customerAddress;
}
