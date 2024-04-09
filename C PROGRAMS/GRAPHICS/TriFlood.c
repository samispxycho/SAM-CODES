//Flood fill algo to colour a triangle

/*
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
#include<stdlib.h>

void flood(int x,int y,int fill,int old){
	int curr=getpixel(x,y);
	if(curr==old){
		putpixel(x,y,fill);
		flood(x,y+1,fill,old);
		flood(x,y-1,fill,old);
		flood(x+1,y,fill,old);
		flood(x-1,y,fill,old);
	}
}


void main(){
	
	int gd=DETECT;
	int gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\bgi");

	line(10,30,20,10);
	line(20,10,30,30);
	line(30,30,10,30);
	flood(20,20,WHITE,BLACK);

getch();
closegraph();
}
*/