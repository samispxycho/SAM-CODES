//opposite side of the circle should be same

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
	
	int r;
	int xc,yc,x,y;
	float p;
	
	printf("Enter the radius value: ");
	scanf("%d",&r);
	printf("Enter the values of xc and yc: ");
	scanf("%d%d",&xc,&yc);
	
	p=(5/4)-r;
	x=0;
	y=r;	

	do{
	
		putpixel(x+xc,y+yc,RED);
		putpixel(x+xc,-y+yc,BLUE);
		putpixel(-x+xc,y+yc,BLUE);
		putpixel(-x+xc,-y+yc,RED);
		putpixel(y+xc,x+yc,GREEN);
		putpixel(y+xc,-x+yc,WHITE);
		putpixel(-y+xc,x+yc,WHITE);
		putpixel(-y+xc,-x+yc,GREEN);	

		if(p<0){
			x++;
			p=p+(2*x)+1;
		}else{
			x++;
			y--;
			p=p+(2*x)-(2*y)+1;
		}

	}while(x<y);

getch();
closegraph();
}
*/