; Hello World Program (Count to 10 itoa)
; Compile with: nasm -f elf helloworld-itoa.asm
; Link with (64 bit systems require elf_i386 option): ld -m elf_i386 helloworld-itoa.o -o helloworld-itoa
; Run with: ./helloworld-itoa
 
%include        'functions.asm'
SECTION .bss
buff: resb 255
 SECTION .data
msg1        db      'Please enter your name: ', 0h 
msg2        db      ' ', 0h     
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
    call    sprint          ; call our print function

    mov     ecx, 0
    mov     eax, buff
nextchar1:
    cmp     byte [eax], 0
    jz      finished1
    inc     ecx
    inc     eax
    jmp     nextchar1
finished1:
    mov     eax, ecx
    call    iprintLF       

 
    call    quit