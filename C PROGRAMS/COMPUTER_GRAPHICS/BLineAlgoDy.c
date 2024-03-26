//Bresenham's Line Algo for condition dx<=dy

/*
#include<stdio.h>
#include<graphics.h>
#include<conio.h>

void main(){
	int gd=DETECT;
	int gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\bgi");
	
	float x1,y1,x2,y2;
	float p,x,y,dx,dy;

	printf("Enter the values of x1 and y1");
	scanf("%f%f",&x1,&y1);
	printf("Enter the values of x2 and y2");
	scanf("%f%f",&x2,&y2);

	dx=x2-x1;
	dy=y2-y1;
	x=x1;y=y1;
		
	p=2*dx-dy;
	
	for(float i=1;i<=dy;i++){
		if(p<0){
			p=p+2*dx;
			y++;
		}else{
			p=p+2*dx-2*dy;
			x++;y++;
		}
		putpixel(x,y,7);
	}
	
	getch();
	closegraph();
}
*/
