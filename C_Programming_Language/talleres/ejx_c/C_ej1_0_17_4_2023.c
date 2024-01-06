#include <stdio.h>
#include <stdlib.h>

void intercambiar_ptrs(int *ptr1, int *ptr2);

int main(){
    int a = 3, b = 6;
    
    printf("a: %d, b: %d\n",a,b);

    intercambiar_ptrs(&a,&b);

    printf("a: %d, b: %d\n",a,b);

    return 0;
}

void intercambiar_ptrs(int *ptr1, int *ptr2){
    int temp = *ptr1; 
    *ptr1 = *ptr2;     
    *ptr2 = temp;      
}