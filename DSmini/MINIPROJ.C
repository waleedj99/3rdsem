#include <stdio.h>
#include <string.h>
#include <ctype.h>
char *strrev(char *str){
    char c, *front, *back;

    if(!str || !*str)
        return str;
    for(front=str,back=str+strlen(str)-1;front < back;front++,back--){
        c=*front;*front=*back;*back=c;
    }
    return str;
}
void main()
{   int num=0;
    int i=0,j=0,k=0;
    char poststr[20]={},str[30][30]={{}},stk[10]={};
    char prestr[20] = "-126+980";
    strrev(prestr);
    printf("Hello, World!\n");
        for(int j=0;j<strlen(prestr);j++)
        {   
            if(isalnum(prestr[j])){
                str[i][k++] = prestr[j];
            }
            else{
                stk[i++] = prestr[j];
                k=0;
            }
        }
   printf("stklen%d\n",strlen(stk));
   for(j=i-1;j>=0;j--)
    {
        strcat(poststr,strrev(str[j]));
        strncat(poststr,&stk[j],1);
    }
    if(strlen(stk)>2)
    {   printf("true\n");
        strcat(poststr,&stk[strlen(stk)-1]);
        printf("%s",&poststr[1]);
    }else{
        printf("false");
        printf("%s",poststr);
    }
}