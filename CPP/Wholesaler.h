#pragma once
#include<iostream>

using namespace std;

class Wholesaler : public NetworkOfWholesales {
	string name;
	Address wholesaleAddress;
	string nameOfTheOwner;
	int productsOnStock;
	bool canDeliverOrderToTheCustomer;
	double cash;
public:
	Wholesaler();
	Wholesaler(string _nameOfNetwork, string country, string name, Address address, string nameOfTheOwner, int productsOnStock, bool canDeliver);

	void addProductOnStock(int qty);
	void deleteProductFromStock(int qty);
	void sellProducts(double);
	void buyProducts(double);


	void setName(string);
	void setAdress(Address);
	void setNameOfTheOwner(string);
	void setProductsOnStock(int);
	void setCanDeliverOrderToTheCustomer(bool);
	void setCash(double);

	string getName();
	Address getAddress();
	string getNameOfTheOwner();
	int getProductsOnStock();
	bool getCanDeliverOrderToTheCustomer();
	int getCash();
};