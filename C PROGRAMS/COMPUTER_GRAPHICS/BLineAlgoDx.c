//Bresenham's Line algo for condition dx>dy or |m|<1

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
		
	p=2*(dy-dx);
	
	for(float i=1;i<=dx;i++){
		if(p<0){
			p=p+2*dy;
			x++;
		}else{
			p=p+2*dy-2*dx;
			x++;y++;
		}
		putpixel(x,y,7);
	}
	
	getch();
	closegraph();
}
*/