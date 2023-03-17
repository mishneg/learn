//
// Created by Igor Popov on 15.03.2023.
//
#include <iostream>
#include <tuple>

int main() {
    int a = 2, b = 5;
    std::tuple<int, int> obmen1(int, int);
    void obmen2(int *, int *);
    void obmen3(int &, int &);
    std::cout << "before the exchange: a=" << a << " b=" << b << std::endl;
    //Вызов obmen1(int,int)
    auto dataFromObmen = obmen1(a,b);
    a = std::get<0>(dataFromObmen);
    b = std::get<1>(dataFromObmen);
    std::cout << "after the exchange 1: a=" << a << " b=" << b << std::endl;
    //Вызов obmen2(int *, int *)
    obmen2(&a, &b);
    std::cout << "after the exchange 2: a=" << a << " b=" << b << std::endl;
    //Вызов obmen3(int &, int &)
    obmen3(a, b);
    std::cout << "after the exchange 3: a=" << a << " b=" << b << std::endl;
    return 0;
}
std::tuple<int, int> obmen1(int x, int n) {return {n, x};}
void obmen2(int *x, int *n)
{
 int s = *x;
 *x=*n;
 *n=s;
}
void obmen3(int &x, int &n)
{
    int s = x;
    x=n;
    n=s;
}