//C code for DDA line algorithm

/*
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
#include<stdlib.h>

void main(){

	int gd=DETECT;
	int gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\bgi");

	int x1,y1,x2,y2;
	float dx,dy,steps,xinc,yinc,x,y;

	printf("Enter values of x1 and y1: ");
	scanf("%d%d",&x1,&y1);
	printf("Enter values of x2 and y2: ");
	scanf("%d%d",&x2,&y2);

	dx=(float)(x2-x1);
	dy=(float)(y2-y1);

	if(fabs(dx)>fabs(dy)){
		steps=fabs(dx);
	}else{
		steps=fabs(dy);
	}

	xinc=dx/steps;
	yinc=dy/steps;

	x=x1;
	y=y1;

	for(int i=1;i<=steps;i++){
		putpixel(x,y,RED);
		x+=xinc;
		y+=yinc;
	}
getch();
closegraph();
}
*/