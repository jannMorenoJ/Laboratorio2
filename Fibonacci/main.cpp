#include <iostream>
#include<limits.h>

using namespace std;

void fibShort(){
        unsigned short p=1;
        unsigned short f=1;
        bool c=true;
        int nterm=2;
        while(c){
            if(((unsigned int)p+ (unsigned int)f)>SHRT_MAX){
                c=false;
                cout<<"el termino n-esimo para el tipo short es: "<<nterm<<endl;

                return;
            }
            unsigned short aux=p;
            p=f;
            f+=aux;
            nterm++;
        }
     }


void fibInt(){
    unsigned int p=1;
    unsigned int f=1;
    unsigned int nterm=2;
    bool c=true;
    while(c){

        unsigned int aux= p;
        p=f;
        f+=aux;
        nterm++;
        if(((unsigned long)p+(unsigned long)f)>INT_MAX){
            c=false;
            cout<<"el termino n-esimo para el tipo int es: "<<nterm<<endl;
        }
    }
}
// pasar todo a unsigned
void fibLong(){
    unsigned long p=1;
    unsigned long f=1;
    int nterm=2;
    bool c=true;
    while(c){
        if(((unsigned long long)p+(unsigned long long)f)>LONG_MAX){
            cout<<"el termino n-esimo para el tipo long es: "<<nterm<<endl;
            c=false;
        }
        unsigned long aux=p;
        p=f;
        f+=aux;
        nterm++;
    }
}

void fibLongLong(){
    unsigned long long p=1;
    unsigned long long f=1;
    int nterm=2;
    bool c=true;
    while(c){
        if((LONG_LONG_MAX-f)<p){
            cout<<"el termino n-esimo para el tipo long long es: "<<nterm<<endl;
            c=false;
        }
        unsigned long long aux=p;
        p=f;
        f+=aux;
        nterm++;
    }
}
int main()
{
    fibShort();
    fibInt();
    fibLong();
    fibLongLong();


    return 0;
}
