set1={"apple","banana","orange","lemon","kiwi"}
set2={"samsung","redmi","apple"}

#accessing items
print(set1)
for x in set1:
    print(x)

#add items
set1.add("dragonfruit")
set1.update(set2)
print(set1)

#removing items
set1.remove("banana")
set1.discard("lemon")
print(set1)

#set operations
set3={"dog","cat","tiger","lion","bear"}
set4={"parrot","piegion","crow","lion","cat"}

set5=set3.union(set4)
set3.intersection_update(set4)
print(set3)