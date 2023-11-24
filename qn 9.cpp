#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

typedef union {
    unsigned w[16];
    char b[64];
} MD5union;

typedef unsigned DigestArray[4];
typedef unsigned (*DgstFctn)(unsigned a[]);

unsigned func0(unsigned abcd[]) {
    return (abcd[1] & abcd[2]) | (~abcd[1] & abcd[3]);
}

unsigned func1(unsigned abcd[]) {
    return (abcd[3] & abcd[1]) | (~abcd[3] & abcd[2]);
}

unsigned func2(unsigned abcd[]) {
    return abcd[1] ^ abcd[2] ^ abcd[3];
}

unsigned func3(unsigned abcd[]) {
    return abcd[2] ^ (abcd[1] | ~abcd[3]);
}

typedef unsigned (*DgstFctn)(unsigned a[]);
unsigned *calctable(unsigned *k);

unsigned rol(unsigned r, short N);

unsigned *md5(const char *msg, int mlen);

int main() {
    int j, k;
    const char *msg = "The quick brown fox jumps over the lazy dog";
    unsigned *d = md5(msg, strlen(msg));
    printf("\t MD5 ENCRYPTION ALGORITHM IN C \n\n");
    printf("Input String to be Encrypted using MD5 : \n\t%s", msg);
    printf("\n\nThe MD5 code for the input string is: \n");
    printf("\t= 0x");
    for (j = 0; j < 4; j++) {
        for (k = 0; k < 4; k++) {
            printf("%02x", (d[j] >> (k * 8)) & 0xFF);
        }
    }
    printf("\n");
    printf("\n\t MD5 Encryption Successfully Completed!!!\n\n");

    return 0;
}
unsigned *md5(const char *msg, int mlen);
unsigned *calctable(unsigned *k);
unsigned rol(unsigned r, short N);
unsigned *md5(const char *msg, int mlen) {
}

