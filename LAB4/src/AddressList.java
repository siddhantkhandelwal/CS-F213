class AddressList{
public static int countAddressWithCity(Address[] addressList, String city){
/*This method returns the count of the addresses from addressList which have the city
attribute equals to city parameter passed for this method. If the length of any passed
argument is zero or value of any passed argument is null then it returns -1.*/
	int count = 0;
	for (int i=0;i<addressList.length;i++){
		if(addressList[i].getcity() == city){
			count++;
		}
	}
	return count;
}// End of method countAddressWithCity()
public static int countAddressWithPin(Address[] addressList, String strP){
/*This method returns the count of the addresses from addressList which have the pin
attribute starting with strP parameter passed for this method. If the length of any
passed argument is zero or value of any passed argument is null then it returns -1.*/
	
}// End of method countAddressWithCity()
public static Address[] getAddressWithCity(Adress[] addressList, String city){
/*This method returns all the addresses from addressList by storing them in String[]
which have the city attribute equals to city parameter passed for this method. If the
length of any passed argument is zeroor value of any passed argument is null then it
returns null. If addressList does not contain any address with city attribute value
equal to city parameter passed for this method even then it returns null.*/
}// End of method getAddressWithCity()
public static Address[] getAddressWithPin(Adress[] addressList, String strP){
/*This method returns all the addresses from addressList by storing them in String[]
which have their pin attribute starting with strP parameter passed for this method. If
the length of any passed argument is zero or value of any passed argument is null then
it returns null. If addressList does not contain any address whose pins attribute value
starts with strP parameter passed for this method even then it returns null.*/
}// End of method getAddressWithCity()
}// End of class AddressList
