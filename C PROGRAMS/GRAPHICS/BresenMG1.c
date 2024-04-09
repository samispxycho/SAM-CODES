//Bresenham's Line algo for m>=1 (dy>=dx)

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
	int dx,dy,p,x,y;
	
	printf("Enter value of x1 and y1: ");
	scanf("%d%d",&x1,&y1);
	printf("Enter value of x2 and y2: ");
	scanf("%d%d",&x2,&y2);

	dx=x2-x1;
	dy=y2-y1;

	p=(2*dx)-dy;
	x=x1;
	y=y1;

	while(y<=y2){
		
		putpixel(x,y,RED);
		
		if(p<0){
			p=p+(2*dx);
			y++;
		}else{
			p=p+(2*dx)-(2*dy);
			x++;
			y++;
		}
	
	}
getch();
closegraph();	

}

*/