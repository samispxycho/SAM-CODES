//DDA Line Algo..Program saved using .cpp file in turbo

/*
#include<stdio.h>
#include<graphics.h>
#include<conio.h>

void main(){
	int gd=DETECT;
	int gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\bgi");
	
	float x1,y1,x2,y2;
	float dx,dy;

	float steps,x,y,xinc,yinc;
	
	printf("Enter the values of x1 and y1");
	scanf("%f%f",&x1,&y1);

	printf("Enter the values of x2 and y2");
	scanf("%f%f",&x2,&y2);

	dx=x2-x1;
	dy=y2-y1;

	if(dx>dy){
		steps=dx;
	}else{
		steps=dy;
	}
	
	xinc=dx/steps;
	yinc=dy/steps;
	x=x1;y=y1;
	putpixel(x,y,7);

	for(int i=1;i<=steps;i++){
		x+=xinc;
		y+=yinc;
		putpixel(x,y,7);
	}
	
	getch();
	closegraph();
}
*/