num=int(input("Enter a number "))
temp=num
count=0
sum=0
while temp>0:
    count=count+1
    temp=temp//10
temp=num
while temp>0:
    d=temp%10
    sum=sum+(d**count)
    temp=temp//10
if sum==num:
    print("Armstrong number")
else:
    print("Not armstrong")