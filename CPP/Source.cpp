//Zalicznie przedmiotu "Programowanie w C++" - Marcin Jarosiñski

#include <iostream>
#include"my_classes.h"

using namespace std;

int main() {
	//Naprawde nie mialem lepszego pomyslu na pola :)
	// Na wiecej zabraklo czasu :(

	NetworkOfWholesales net1("Gracja", "Polska");

	int kod[] = { 33, 100 };
	Address cust1Address("Stokrotkowa", 1, 56, kod, "Olsztyn");
	Address ws1Address("Ladna", 1, 56, kod, "Olsztyn");
	Customer cust1("Michelin", cust1Address);
	Wholesaler ws1(net1.getNameOfTheNetwork(), net1.getCuntryOfTheNetwork(), "Malwa", ws1Address, "Cieslak", 100, true);

	cout << "W hurtowni " << ws1.getName() << " Z sieci: " << ws1.getNameOfTheNetwork() << " bylo na stanie "
		<< ws1.getProductsOnStock() << " sztuk towaru"<< endl;
	cout << "Hurtownie odwiedzil klient: " << cust1.getCustomerName() <<endl;
	cout << "Kupil 2 sztuki towaru za 100 PLN" << endl;
	cout << "Pieniadze wplacil od razu " << endl;
	ws1.sellProducts(100);
	cout << "Towar wyslano nastepnego dnia na adres (ulice) wskazany przez klienta tj.: " << cust1.getCustomerAddress().getStreet() << endl;
	ws1.deleteProductFromStock(2);
	cout << "Po wszystkim zostalo " << ws1.getProductsOnStock() << " towaru" << endl;

	cout << "Po kilku dniach zarzad spolki " << ws1.getNameOfTheNetwork() << " zmienil wlasciciela hurtowni " << ws1.getName()
		<< endl;
	ws1.setNameOfTheOwner("Jarosinski");
	cout << "Od dzis wlascicielem hurtowni jest Pan: " << ws1.getNameOfTheOwner();


	return 0;
}