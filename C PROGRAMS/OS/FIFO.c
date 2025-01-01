#include<stdio.h>

int main(){

    int pageLength;
    printf("Enter number of pages: ");
    scanf("%d",&pageLength);

    int pages[pageLength];
    printf("\nEnter page sequence: ");
    for(int i=0;i<pageLength;i++){
        scanf("%d",&pages[i]);
    }

    int frameSize;
    printf("\nEnter the frame size: ");
    scanf("%d",&frameSize);

    int frames[frameSize];
    for(int i=0;i<frameSize;i++){
        frames[i] = -1;
    }

    int index = 0;
    int pagefault=0;
    for(int i=0;i<pageLength;i++){

        int found = 0;
        for(int j=0; j<frameSize;j++){
            if(frames[j] == pages[i]){
                found = 1;
                break;
            }
        }

        if(found==0){
            frames[index] = pages[i];
            index = (index+1)%frameSize;
            pagefault++;
        }

        printf("%d\t", pages[i]);             
        for (int j = 0; j < frameSize; j++) {
            if (frames[j] == -1)              
                printf("[ ] \t");
            else
                printf("[%d] \t", frames[j]);   
        }
        if (found == 0)
            printf("Page Fault");
        else
            printf("No Page Fault");
        printf("\n");


    }


    return 0;
}