#include <stdio.h>
#include <stdlib.h>

void intercambiar_ptrs(int **ptr1, int **ptr2);

int main(){
    int a = 3, b = 6;
    int *ptra = &a, *ptrb = &b;
    
    printf("a: %d, b: %d\n",a,b);
    printf("ptra: %p, ptrb: %p\n",ptra,ptrb);

    intercambiar_ptrs(&ptra,&ptrb);

    printf("a: %d, b: %d\n",a,b);
    printf("ptra: %p, ptrb: %p\n",ptra,ptrb);

    return 0;
}

void intercambiar_ptrs(int **ptr1, int **ptr2){
    int* temp = *ptr1; 
    *ptr1 = *ptr2;     
    *ptr2 = temp;      
}