//
// Created by Igor Popov on 15.03.2023.
//
#include <iostream>
int main ()
{
    int i,k;
    int s,c;
    std::cout<<"input degree\n";
    std::cin >> s;
    std::cout<<"input foundation degree\n";
    std::cin >> c;
    int power (int, int);
    for (i=0; i<s; i++)
    {
        k=power(c,i);
        std::cout<<"i = "<<i<<", k = "<<k<<std::endl;
    }
    return 0;
}

int power (int x , int n)
{
    int i, p=1;
    for (i=1; i<=n; i++) p*=x;
    return p;
}