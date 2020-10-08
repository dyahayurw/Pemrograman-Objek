#include<iostream> 
#include <string> 

using namespace std; 

class Employee { 
    public: 
        Employee( string, string, int ); 
        void setFirstName(string);
        void setLastName(string);
        void setMonthlySalary(int);
        string getFirstName(); 
        string getLastName(); 
        int getMonthlySalary(); 
    private: 
        string firstName; 
        string lastName; 
        int monthlySalary; 
    }; 
    
Employee::Employee(string first, string last, int gaji){ 
    firstName=first; 
    lastName=last; 
        if(gaji>0){
            monthlySalary=gaji;
        }
        else { 
            monthlySalary=0; 
            cout<<"Error"<<endl; 
        } 
} 
        
void Employee::setFirstName(string first){ 
    firstName = first;
} 
        
void Employee::setLastName(string last ){ 
    lastName = last;
} 
            
void Employee::setMonthlySalary(int gaji){ 
    if(gaji>0) {
        monthlySalary=gaji;
    }
    else { 
        monthlySalary=0; cout<<"Error"<<endl;
    } 
} 
            
string Employee::getFirstName(){
    return firstName;
} 
            
string Employee::getLastName(){ 
    return lastName;
} 
            
int Employee::getMonthlySalary(){
    return monthlySalary;
} 
            
int main(){ 
    Employee Employee1("Dyahayu","Retno",2000); 
    Employee Employee2("Retno","Wulan",3500); 
        cout << "Nama : "<< Employee1.getFirstName()<<" "<< Employee1.getLastName()<<endl; 
        cout<< "Gaji Bulanan : "<< Employee1.getMonthlySalary()<< endl;
        cout<< "Gaji Tahunan : "<< Employee1.getMonthlySalary()*12<< endl; 
        cout<<"Ditambah 10%"<<endl; 
            
    int naikGaji1=Employee1.getMonthlySalary(); 
        naikGaji1=naikGaji1+(naikGaji1*0.1); 
        Employee1.setMonthlySalary(naikGaji1); 
            cout<< "Gaji Bulanan : "<< Employee1.getMonthlySalary()<< endl;
            cout<<"Gaji Tahunan : "<< Employee1.getMonthlySalary()*12<<endl<<endl;
                
            cout << "Nama : "<< Employee2.getFirstName()<<" "<< Employee2.getLastName()<<endl; 
            cout<< "Gaji Bulanan : "<< Employee2.getMonthlySalary()<<endl;
            cout<<"Gaji Tahunan : "<< Employee2.getMonthlySalary()*12<<endl; 
            cout<<"Ditambah 10%"<<endl; 
                
    int naikGaji2=Employee1.getMonthlySalary(); 
        naikGaji2=naikGaji2+(naikGaji2*0.1); 
        Employee2.setMonthlySalary(naikGaji2); 
            cout<<"Gaji Bulanan : "<< Employee1.getMonthlySalary()<<endl;
            cout<<"Gaji Tahunan : "<< Employee1.getMonthlySalary()*12<< endl; 
}
