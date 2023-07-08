import numpy as np

"""
myarr=np.array([[10,20,30],[40,50,60],[60,70,80]])
print(myarr.ndim) #Specifies the dimension of array
print(myarr.shape) #Number of rows and columns

myarr2=np.array([[10,20,30],[40,50,60]])
print(myarr2.ndim) 
print(myarr2.shape)
"""

"""
myarr=np.zeros(5)   #Creating array with elements as 0
print(myarr)
myarr2=np.zeros([2,3])
print(myarr2)
"""

"""
myarr=np.ones(5)    #Creating array with elements as 1
print(myarr)
myarr2=np.ones([2,3])
print(myarr2)
"""

"""
myarr=np.eye(3) #All diagonal elements with 1 rest with 0
print(myarr)
myarr2=np.eye(3,4)
print(myarr2)
"""

"""
myarr=np.diag([3,4,5])  #Diagonal ele with val rest with 0
print(myarr)
myarr2=np.diag([4])
print(myarr2)
print(np.diag(myarr))   #Prints all the diagonal elements
print(np.diag(myarr2))
"""

"""
myarr=np.random.randint(1,10,3) #3 rand values between 1-10(10 not inclu)
print(myarr)
"""

"""
myarr=np.random.random(5)   #5 Random values between 0 and 1
print(myarr)
myarr2=np.random.rand(2,3)  #For 2D array
print(myarr2)
"""

arr=np.random.randint(10,100,12)
arr2=arr.reshape(4,3)
print(arr2)
