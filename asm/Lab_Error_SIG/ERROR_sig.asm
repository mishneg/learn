SECTION .data
a1: db 0x1b, '[10;5000]', 0 ; устанавливаем частоту 800 Гц
a1Len: equ $-a1
        
a2: db 0x1b, '[11;100000000000]', 7 ; длительность 100 мс
a2Len: equ $-a2
    
a3: db 0x1b, '[10;5000]', 0 ; устанавливаем частоту 800 Гц
a3Len: equ $-a3
    
a4: db 0x1b, '[11;100000000000]', 7 ; длительность 300 мс
a4Len: equ $-a4
SECTION .text
global  _start
 
_start:

    mov eax, 4 
    mov ebx, 1 
    mov ecx, a1
    mov edx, a1Len 
    int 80h 

    mov eax, 4 
    mov ebx, 1 
    mov ecx, a2
    mov edx, a2Len
    int 80h 
    
    mov eax, 4 
    mov ebx, 1 
    mov ecx, a3
    mov edx, a3Len 
    int 80h 
    
    mov eax, 4 
    mov ebx, 1 
    mov ecx, a4
    mov edx, a4Len 
    int 80h 

   mov eax,1
    mov ebx,0
    int 80h