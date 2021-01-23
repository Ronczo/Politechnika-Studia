#pragma once
#include<iostream>
#include"my_classes.h"

using namespace std;

NetworkOfWholesales::NetworkOfWholesales(){
	nameOfTheNetwork = "Nazwa domyslna";
	countryOfTheNetwork = "Kraj domyslny";
}

NetworkOfWholesales::NetworkOfWholesales(string _nameOfTheNetwork, string _countryOfTheNetwork){
	nameOfTheNetwork = _nameOfTheNetwork;
	countryOfTheNetwork = _countryOfTheNetwork;
}

void NetworkOfWholesales::setNameOfTheNetwork(string _name){
	nameOfTheNetwork = _name;
}

void NetworkOfWholesales::setCuntryOfTheNetwork(string _country){
	countryOfTheNetwork = _country;
}

string NetworkOfWholesales::getNameOfTheNetwork(){
	return nameOfTheNetwork;
}

string NetworkOfWholesales::getCuntryOfTheNetwork(){
	return countryOfTheNetwork;
}
