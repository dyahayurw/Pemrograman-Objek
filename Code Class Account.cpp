#include<iostream> 
#include <string> 

using namespace std; 

class Account { 
    public: 
        Account( int); 
        void debit(int );
        void credit(int ); 
        int getAccountBalance(); 
    private: 
    int accountBalance; 
    }; 
    
Account::Account(int balance){ 
    if(balance>0)
		accountBalance=balance; 
        
    else { 
    	accountBalance=0;         
        cout<<"Error"<<endl; 
    } 
} 
     
void Account::credit( int balance){ 
    accountBalance = accountBalance + balance; 
} 
     
void Account::debit( int balance){ 
    if(accountBalance>=balance){
        accountBalance = accountBalance - balance;
    } 
    else{ 
        cout<<"Nominal pengambilan melebihi jumlah tabungan"<<endl; 
    } 
    } 
       
int Account::getAccountBalance(){ 
	return accountBalance; 
} 
       
int main(){ 
	Account Account1(90); 
    cout <<"Account 1"<<endl;
    cout <<"Tabungan Awal : "<<Account1.getAccountBalance()<<endl;
        
    Account1.credit(50); 
    cout <<"Saldo Credit : "<<Account1.getAccountBalance()<<endl; 
       
    Account1.debit(100); 
    cout <<"Saldo Debit : "<<Account1.getAccountBalance()<<endl<<endl; 
       
    Account Account2(-25); 
    cout <<"Account 2"<<endl;
    cout <<"Tabungan Awal : "<<Account2.getAccountBalance()<<endl;
       
    Account2.credit(100); 
    cout<<"Saldo Credit : "<<Account2.getAccountBalance()<<endl; 
       
    Account2.debit(200); 
    cout<<"Saldo Debit : "<<Account2.getAccountBalance()<<endl; 
    
    return 0;
}
