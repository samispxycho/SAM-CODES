thiss={"apple","banana","orange"}
thiss2={"cherry","grapes"}
print(thiss)
print(type(thiss))

for i in thiss:
    print(i)

thiss.add("Orange")
print(thiss)
thiss.update(thiss2)
print(thiss)

thiss.remove("Orange")
thiss.discard("Kiwi")
print(thiss)
thiss.pop()
print(thiss)

thiss.clear()
print(thiss)
del thiss
