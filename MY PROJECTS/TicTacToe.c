// Coding a Tic Tac Toe game//

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <time.h>

char board[3][3];
const char PLAYER = 'X';
const char COMPUTER = 'O';

void resetBoard(); // for resetting the board as new
void printBoard(); // to print the layout of a tic tac toe game
int checkFreeSpaces(); //for checking the blank spots
void playerMove();      //player's choice
void computerMove();    //computer's choice (auto generated)
char checkWinner();     //checks the winning condition
void printWinner(char); //declares the winner

int main()
{
    char winner = ' ';

    resetBoard();
    while (winner == ' ' && checkFreeSpaces() != 0)
    {
        printBoard();
        playerMove();
        winner = checkWinner();

        if (winner != ' ' || checkFreeSpaces() == 0)
        {
            break;
        }

        computerMove();
        winner = checkWinner();

        if (winner != ' ' || checkFreeSpaces() == 0)
        {
            break;
        }
    }

    printBoard();
    printWinner(winner);

    printf("THANKS FOR PLAYING");

    return 0;
}

// Function Declaration//

void resetBoard()
{
    for (int i = 0; i < 3; i++) // for the rows
    {
        for (int j = 0; j < 3; j++) // for the columns
        {
            board[i][j] = ' ';
        }
    }
}

void printBoard()
{

    // for first row
    printf(" %c | %c | %c ", board[0][0], board[0][1], board[0][2]);
    printf("\n---|---|---\n");

    // for second row
    printf(" %c | %c | %c ", board[1][0], board[1][1], board[1][2]);
    printf("\n---|---|---\n");

    // for third row
    printf(" %c | %c | %c ", board[2][0], board[2][1], board[2][2]);
    printf("\n");
}

int checkFreeSpaces()
{
    int freeSpaces = 9;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (board[i][j] != ' ')
            {
                freeSpaces--;
            }
        }
    }
    return freeSpaces;
}

void playerMove()
{
    int x; // player's move for the rows
    int y; // player's move for the columns

    do
    {
        printf("Enter row number(1 to 3): ");
        scanf("%d", &x);
        x--;

        printf("Enter column number(1 to 3): ");
        scanf("%d", &y);
        y--;

        if (board[x][y] != ' ')
        {
            printf("Invalid Move, Space Already Occupied\n");
        }

        else
        {
            board[x][y] = PLAYER;
            break;
        }
    } while (board[x][y] != ' ');
}

void computerMove()
{
    // creates a random seed based on current time
    srand(time(0));
    int x;
    int y;

    if (checkFreeSpaces() > 0)
    {
        do
        {
            x = rand() % 3;
            y = rand() % 3;
        } while (board[x][y] != ' ');

        board[x][y] = COMPUTER;
    }

    else
    {
        printWinner(' ');
    }
}

char checkWinner()
{

    // checking rows
    for (int i = 0; i < 3; i++)
    {
        if (board[i][0] == board[i][1] && board[i][0] == board[i][2])
        {
            return board[i][0];
        }
    }

    // checking columns
    for (int i = 0; i < 3; i++)
    {
        if (board[0][i] == board[1][i] && board[0][i] == board[2][i])
        {
            return board[0][i];
        }
    }

    // checking diagonals

    // diagonal 1st
    if (board[0][0] == board[1][1] && board[0][0] == board[2][2])
    {
        return board[0][0];
    }

    // diagonal 2nd
    if (board[0][2] == board[1][1] && board[0][2] == board[2][0])
    {
        return board[0][2];
    }

    return ' ';
}

void printWinner(char winner)
{
    if (winner == PLAYER)
    {
        printf("YOU WIN! \n");
    }

    else if (winner == COMPUTER)
    {
        printf("YOU LOST! \n");
    }

    else
    {
        printf("IT'S A DRAW! \n");
    }
}

// TIC TAC TOE GAME COMPLETE
