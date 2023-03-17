//
// Created by Igor Popov on 15.03.2023.
//
#define PR(x) printf("x=%u, *x=%d, &x=%u\n",x,*x,&x)
#include <stdio.h>
int main()
{
    printf("int date\n");
    int mas[]={100, 200, 300};
    int *ptr1, *ptr2;
    ptr1=mas;
    ptr2=&mas[2];
    PR(ptr1);
    ptr1++;
    PR(ptr1);
    PR(ptr2);
    ++ptr2;
    printf("ptr2-ptr1=%u\n",ptr2-ptr1);
    printf("Float date\n");
    double mass[]={100.100, 200.200, 300.300};
    double *ptf1, *ptf2;
    ptf1=mass;
    ptf2=&mass[2];
    PR(ptf1);
    ptf1++;
    PR(ptf1);
    PR(ptf2);
    ++ptf2;
    printf("ptr2-ptr1=%u\n",ptf2-ptf1);
    return 0;
}