%include        'functions.asm'
SECTION .data
msg1:db -13
msg2:db  25    
msg3:dw  58.18
msg4:dd  1.3     
msg5:db  'asd'
msg6:db   10001001b
SECTION .text
global  main
 
main:
    mov ebp, esp; for correct debugging
    mov ecx,'B'
    mov eax,1
    mov ebx,0
    int 80h