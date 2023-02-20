#declaring a list in python
mylist=["apple","banana","Kiwi","Mango","Orange"];

#to print
print(mylist)

#acessing the items of a list
print(mylist[0]) #indexing starts from 0
print(mylist[-1]) #-1 points to the last item of the list

#to provide a range
print(mylist[2:5]) #5 will not be included
print(mylist[-3:-1]) #negative indexing range)
print(mylist[:])    #empty range..will print every data
print(mylist[3:])   #3 to last
print(mylist[:4])   #first to third

#changing the value of a list
mylist[1]="peach";
print(mylist);

#Currently list is [apple peach watermelon guava orange]

#to change item values using a range
mylist[2:4]="watermelon","guava";   #4 will not get including so only 2 values will change
print(mylist)

#if we insert more items than specified
mylist[2:3]="grapes","pineapple","dragonfruit";
print(mylist)

#instead of changing, we can insert new values using .insert
mylist.insert(2,"Anaar")
print(mylist)

#to check for an item using in operator
if "apple" in mylist:
    print("Yes");

#to add an item at the last
mylist.append("Cheeku")
print(mylist)

#to extend a list
list1=[10,20];
list2=[30,40];
list1.extend(list2);
print(list1)

#to remove items
mylist.remove("apple")
print(mylist)

#using pop method
mylist.pop(4)
print(mylist)

#using del method
del mylist[5]
print(mylist)

#truncate list
mylist.clear()
print(mylist)

#delete list
del mylist

li=["apple","mango","orange","grapes","blueberry"];
li.sort()
li.sort(reverse=True)
print(li)

#to count the occurence of an item
print(li.count('apple'))

#to calculate the index
print(li.index("grapes"))

print(len(li))
