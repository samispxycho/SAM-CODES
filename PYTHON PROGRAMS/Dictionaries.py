dict={1:"apple",2:"mango",3:"banana",4:"Kiwi",5:"orange"}

#accessing elements
print(dict[3])
print(dict.get(4))
print(dict.keys())
print(dict.values())
print(dict.items())

#updating items
dict[3]="anaar"
dict.update({4:"dragon fruit"})
print(dict)

#adding items
dict[6]="banana"
dict.update({7:"Kiwi"})
print(dict)

#deleting items
dict.pop(6)
del dict[7]
print(dict)

#accessing through loops
for x in dict:        #for keys
    print(x)
for i in dict:        #for values
    print(dict[i])
for j in dict:        #for both
    print(j,dict[j])

dict2=dict.copy()
print(dict2)
dict2.clear()
print(dict2)
