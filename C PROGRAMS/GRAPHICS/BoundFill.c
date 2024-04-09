//Boundary fill algorithm 

/*
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
#include<stdlib.h>

void bound(int x,int y,int fill,int boundary){
	
	int curr=getpixel(x,y);
	if(curr!=fill && curr!=boundary){
		putpixel(x,y,fill);
		bound(x,y+1,fill,boundary);
		bound(x,y-1,fill,boundary);
		bound(x+1,y,fill,boundary);
		bound(x-1,y,fill,boundary);		
	}

}

void main(){

	int gd=DETECT;
	int gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\bgi");

	rectangle(100,100,150,150);
	bound(105,105,WHITE,WHITE);

getch();
closegraph();
}
*/