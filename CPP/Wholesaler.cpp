#pragma once
#include<iostream>
#include"my_classes.h"

using namespace std;

//getters and setters

Wholesaler::Wholesaler(){
	name = "Domyslna nazwa hurtowni";
	wholesaleAddress = Address();
	nameOfTheOwner = "Domyslne nazwisko wlasciciela";
	productsOnStock = 0;
	canDeliverOrderToTheCustomer = true;
}



Wholesaler::Wholesaler(string _nameOfNetwork, string country, string _name, Address _address, string _nameOfTheOwner, int _productsOnStock, bool _canDeliver){
	nameOfTheNetwork = _nameOfNetwork;
	countryOfTheNetwork = country;
	name = _name;
	wholesaleAddress = _address;
	nameOfTheOwner = _nameOfTheOwner;
	productsOnStock = _productsOnStock;
	canDeliverOrderToTheCustomer = _canDeliver;
}

void Wholesaler::addProductOnStock(int qty){
	productsOnStock = productsOnStock + qty;
	cout << "Przyjeto material(y) do magazynu\n";
}

void Wholesaler::deleteProductFromStock(int qty){
	productsOnStock = productsOnStock - qty;
	cout << "Wydano material(y) z magazynu\n";
}

void Wholesaler::sellProducts(double money){
	cash = cash + money;
}

void Wholesaler::buyProducts(double money){
	cash = cash + money;
}


void Wholesaler::setName(string _name) {
	name = _name;
}

void Wholesaler::setAdress(Address _address) {
	wholesaleAddress = _address;
}

void Wholesaler::setNameOfTheOwner(string _owner) {
	nameOfTheOwner = _owner;
}

void Wholesaler::setProductsOnStock(int _onStock) {
	productsOnStock = _onStock;
}

void Wholesaler::setCanDeliverOrderToTheCustomer(bool _canThey) {
	canDeliverOrderToTheCustomer = _canThey;
}

void Wholesaler::setCash(double _cash){
	cash = _cash;
}

string Wholesaler::getName()
{
	return name;
}

Address Wholesaler::getAddress()
{
	return wholesaleAddress;
}

string Wholesaler::getNameOfTheOwner()
{
	return nameOfTheOwner;
}

int Wholesaler::getProductsOnStock()
{
	return productsOnStock;
}

bool Wholesaler::getCanDeliverOrderToTheCustomer()
{
	return canDeliverOrderToTheCustomer;
}

int Wholesaler::getCash()
{
	return cash;
}
