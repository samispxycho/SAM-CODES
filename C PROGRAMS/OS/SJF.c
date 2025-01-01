#include<stdio.h>

int main(){

    int pID[20];
    int AT[20];
    int BT[20];
    int CT[20];
    int TAT[20];
    int totalTAT=0;
    int WT[20];
    int totalWT=0;

    int n;
    printf("Enter number of processes: ");
    scanf("%d",&n);

    printf("\nEnter Process ID: ");
    for(int i=0;i<n;i++){
        scanf("%d",&pID[i]);
    }

    printf("\nEnter Arrival Time: ");
    for(int i=0;i<n;i++){
        scanf("%d",&AT[i]);
    }

    printf("\nEnter Burst Time of processes: ");
    for(int i=0;i<n;i++){
        scanf("%d",&BT[i]);
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(BT[j] > BT[j+1]){
                int tempBT = BT[j];
                BT[j] = BT[j+1];
                BT[j+1] = tempBT;

                int tempPID = pID[j];
                pID[j] = pID[j+1];
                pID[j+1] = tempPID; 

                int temAT = AT[j];
                AT[j] = AT[j+1];
                AT[j+1] = temAT;
            }
        }
    }

    int sum = AT[0];
    for(int i=0;i<n;i++){
        sum = sum + BT[i];
        CT[i] = sum;
    }

    for(int i=0;i<n;i++){
        TAT[i] = CT[i] - AT[i];
        totalTAT += TAT[i];
    }

    for(int i=0;i<n;i++){
        WT[i] = TAT[i] - BT[i];
        totalWT+=WT[i];
    }

    printf("\n\nProcesses\tAT\tBT\tCT\tTAT\tWT\t");
    for(int i=0;i<n;i++){
        printf("\n\t%d\t%d\t%d\t%d\t%d\t%d",pID[i],AT[i],BT[i],CT[i],TAT[i],WT[i]);
        printf("\n");
    }

    printf("\nAverage TAT is: %f",(float)totalTAT/n);
    printf("\nAverage WT is: %f",(float)totalWT/n);



    return 0;
}