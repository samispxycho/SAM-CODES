#include <stdio.h>

void firstFit(int blocks[], int blockLen, int processess[], int proLen)
{

    int allocated[proLen];
    for (int i = 0; i < proLen; i++)
        allocated[i] = -1;

    for (int i = 0; i < proLen; i++)
    {

        for (int j = 0; j < blockLen; j++)
        {
            if (blocks[j] >= processess[i])
            {
                allocated[i] = j;
                blocks[j] = blocks[j] - processess[i];
                break;
            }
        }
    }

    printf("Process No.\tProcess Size\tBlock No.\n");
    for (int i = 0; i < proLen; i++)
    {
        printf("%d\t\t%d\t\t", i + 1, processess[i]);
        if (allocated[i] != -1)
            printf("%d\n", allocated[i] + 1);
        else
            printf("Not Allocated\n");
    }
}

int main()
{

    int blocks[] = {200, 300, 100, 400, 500};
    int processes[] = {455, 544, 233, 766, 122};

    int blockLen = sizeof(blocks) / sizeof(blocks[0]);
    int proLen = sizeof(processes) / sizeof(processes[0]);

    firstFit(blocks,blockLen,processes,proLen);

    return 0;
}