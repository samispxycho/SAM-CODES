#Pattern solving questions

#Always nested loops are used, the main i loop is used for the number of rows and the inner j loop is used for printing the pattern

"""

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

i=1
while i<=5:
    j=1
    while j<=5:
        print("*", end=" ")
        j+=1
    print()
    i+=1
"""

"""
*   
* *
* * *
* * * *
* * * * *

i=1
while i<=5:
    j=1
    while j<=i:
        print("* ",end=" ")
        j+=1
    print()
    i+=1  
"""

"""
* * * * *
* * * * 
* * * 
* * 
* 

i=1
while i<=5:
    j=5
    while j>=i:
        print("* ",end=" ")
        j-=1
    print()
    i+=1   
"""

"""

        *
      * *
    * * *
  * * * *
* * * * *

i=1
while i<=5:
    j=5
    while j>i:
        print(" ", end=" ")
        j-=1
    j=1
    while j<=i:
        print("*", end=" ")
        j+=1
    print()
    i+=1 
"""
"""
* * * * *
  * * * *
    * * *
      * *
        *

i=1
while i<=5:
    j=2
    while j<=i:
        print(" ",end=" ")
        j+=1
    j=5
    while j>=i:
        print("*",end=" ")
        j-=1
    print()
    i+=1

"""
"""
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *        

i=1
while i<=5:
    j=5
    while j>i:
        print(" ",end=" ")
        j-=1
    j=1
    while j<=i:
        print("*",end=" ")
        j+=1
    j=2
    while j<=i:
        print("*",end=" ")
        j+=1
    print()
    i+=1
"""

"""
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

i=1
while i<=5:
    j=2
    while j<=i:
        print(" ",end=" ")
        j+=1
    j=5
    while j>=i:
        print("*",end=" ")
        j-=1
    j=4
    while j>=i:
        print("*",end=" ")
        j-=1
    print()
    i+=1
"""
"""
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
        
i=1
while i<=4:
    j=4
    while j>=i:
        print(" ",end=" ")
        j-=1
    j=1
    while j<=i:
        print("*",end=" ")
        j+=1
    j=2
    while j<=i:
        print("*",end=" ")
        j+=1
    print()
    i+=1
i=1
while i<=5:
    j=2
    while j<=i:
        print(" ",end=" ")
        j+=1
    j=5
    while j>=i:
        print("*",end=" ")
        j-=1
    j=4
    while j>=i:
        print("*",end=" ")
        j-=1
    print()
    i+=1

"""


"""
*   
* *
* * *
* * * *
* * * * *


for i in range(1,7):
    for j in range(1,i):
        print("* ", end="")
    print()
"""