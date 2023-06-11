#include<iostream>
using namespace std; 
int main(){
    cout<<"Enter the number of terms you want:"<<endl;
    int n;
    cin>>n;
    /*for(int i=1;i<=2*n-1;i=i+2){
        cout<<i<<endl;
    }*/

    //Method-2
    int a=1;
    for(int i=1;i<=n;i++){
        cout<<a<<endl; 
        a=a+2;
    }
}