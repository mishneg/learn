%include        'functions.asm'
 SECTION .data
msg1        db      'Please enter your test: ',13,0h 
msg2        db      'AX: ',0h
SECTION .bss
buff: resb 8
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
    
    mov     cx, 0
    movzx     bx, buff
    mov     ax, 0
netchar:
    cmp     byte [bx], 0
    jz      finished1
    cmp     bx, cx
    jz     fin
    inc     cx
    inc     bx
    jmp     netchar
 fin:
 or  ax, cx
 jmp netchar
finished1:
    
    
    movzx     eax,ax
    call    iprintLF
    
    call    quit            ; call our quit function