#include <iostream>
#include <string>

using namespace std;

class Invoice {
    public:
        Invoice (string , string , int , int);
        string getInfo();
        string getDesc();
        int getQuan();
        int getPrice();
        int getTotal();
        int getInvoiceAmount();
        void setInfo (string);
        void setDesc (string);
        void setQuan (int);
        void setPrice (int);
    private:
        string info;
        string desc;
        int quantity;
        int price;
        int total;
        
};

Invoice::Invoice (string w, string x, int y, int z){
    info=w;
    desc=x;
        if (y>0)
            quantity=y;
        else{
            quantity=0;
            cout<<"Error"<<endl;
        }
        
        if (z>0)
            price=z;
        else{
            price=0;
            cout<<"Error"<<endl;
        }
}

void Invoice::setInfo (string w){
    info=w;
}

void Invoice::setDesc (string x){
    desc=x;
}

void Invoice::setQuan (int y){
    quantity=y;
}

void Invoice::setPrice (int z){
    price=z;
}

string Invoice::getInfo(){
    return info;
}

string Invoice::getDesc(){
    return desc;
}

int Invoice::getQuan(){
    return quantity;
}
        
int Invoice::getPrice(){
    return price;
}

int Invoice::getInvoiceAmount(){
    return quantity*price;
}

int main() {
    Invoice Invoice1("Kopi", "Vanilla Latte", 2, 20000);
    
    cout<<""<<Invoice1.getInfo()<<endl;
    cout<<""<<Invoice1.getDesc()<<endl;
    cout<<"Banyaknya : "<<Invoice1.getQuan()<<endl;
    cout<<"Harga/cup : "<<Invoice1.getPrice()<<endl;
    cout<<"Total : "<<Invoice1.getInvoiceAmount();
    
    return 0;
}
