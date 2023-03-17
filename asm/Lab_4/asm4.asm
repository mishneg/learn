%include        'functions.asm'
SECTION .bss
buff: resb 255
data: resb 8
 SECTION .data
msg1        db      'Please enter your char: ',13,0h 
msg2        db      'Your char: ',0h
msg3        db      13,'ASCII: ',0h  
SECTION .text
global  main
 
main:
    mov ebp, esp; for correct debugging

    mov     eax, msg1
    call    sprint
 
    mov     edx, 255        ; number of bytes to read
    mov     ecx, buff     ; reserved space to store our input (known as a buffer)
    mov     ebx, 0          ; write to the STDIN file
    mov     eax, 3          ; invoke SYS_READ (kernel opcode 3)
    int     80h
 
    mov     eax, msg2
    call    sprint
 
    mov     eax, buff      ; move our buffer into eax (Note: input contains a linefeed)
    call    sprint         ; call our print function

    mov     eax, msg3
    call    sprint
    
    mov     ecx, 0
    mov     ebx, buff
  
    inc     ecx 
    movzx   ax, byte [buff] 
    mov     bl, 100 
    div     bl 
    add     al, 48 
    mov     [data], al 
    movzx   ax, ah 
    mov     bl, 10 
    div     bl 
    add     al, 48 
    add     ah, 48 
    mov     [data+1], al 
    mov     [data+2], ah

    
    mov     eax, data
    call    sprint
    
    call    quit            ; call our quit function