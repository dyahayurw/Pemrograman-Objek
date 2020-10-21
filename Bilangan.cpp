#include<iostream> 

using namespace std; 

class Bilangan { 
    public: 
        Bilangan(int); 
        void setBilangan(int);
        int getBilangan(); 
    private: 
        int number; 
    }; 
    
Bilangan::Bilangan(int numb){ 
    number=numb; 
    cout<<"Angka "<<numb<<" adalah bilangan";
        if(numb>0){
            cout<<" positif ";
        }
        else { 
            cout<<" negatif "; 
        } 
        
        if(numb%2==0){
            cout<<"genap"<<endl;
        }
        else{
            cout<<"ganjil"<<endl;
        }
        
    cout<<endl;
} 
        
void Bilangan::setBilangan(int numb){ 
   number=numb;
} 
            
int Bilangan::getBilangan(){
    return number;
} 
            
int main(){ 
    Bilangan Bilangan1(-1); 
    Bilangan Bilangan2(8); 
    Bilangan Bilangan3(45); 
    Bilangan Bilangan4(-12); 
}
