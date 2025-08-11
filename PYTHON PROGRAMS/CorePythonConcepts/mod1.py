def fact(num):
    if num == 0:
        return 1
    else:
        return num * fact(num-1)
    
def sumof(num):
    if num == 1:
        return 1
    else:
        return num + sumof(num-1)
    
