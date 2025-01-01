#include<stdio.h>
int main(){

    int arrivalTime[20];
    int burstTime[20];
    int completion[20];
    int TAT[20];
    int totalTAT=0;
    int WT[20];
    int totalWT=0;

    int n;
    printf("Enter number of processes: ");
    scanf("%d",&n);

    printf("\nEnter Arrival time: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arrivalTime[i]);
    }

    printf("\nEnter burst time of processes: ");
    for(int i=0;i<n;i++){
        scanf("%d",&burstTime[i]);
    }

    int sum=arrivalTime[0];
    for(int i=0;i<n;i++){
        sum = sum + burstTime[i];
        completion[i] = sum;
    }

    for(int i=0;i<n;i++){
        TAT[i] = completion[i] - arrivalTime[i];
        totalTAT += TAT[i];
    }

    for(int i=0;i<n;i++){
        WT[i] = TAT[i] - burstTime[i];
        totalWT+=WT[i];
    }

    printf("\n\nProcesses\tAT\tBT\tCT\tTAT\tWT");
    for(int i=0;i<n;i++){
        printf("\n\t%d\t%d\t%d\t%d\t%d\t%d",i+1,arrivalTime[i],burstTime[i],completion[i],TAT[i],WT[i]);
        printf("\n");
    }

    printf("\nAverage TAT: %d", totalTAT/n);
    printf("\nAverage WT: %d", totalWT/n);

    return 0;
}
