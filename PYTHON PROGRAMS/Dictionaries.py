thisd={"brand":"Ford","model":1964}
print(type(thisd))
print(thisd)

print(thisd["model"])
print(thisd.get("brand"))

print(len(thisd))

print(thisd.keys())
print(thisd.values())
print(thisd.items())

thisd["brand"]="Tesla"
thisd.update({"model":2023})
print(thisd)

thisd["color"]="white"
print(thisd)

for i in thisd:
    print(i)
for i in thisd:
    print(thisd[i])

myd=thisd.copy()
myd2=dict(myd)
print(myd)
print(myd2)

myfamily = {
  "child1" : {
    "name" : "Emil",
    "year" : 2004
  },
  "child2" : {
    "name" : "Tobias",
    "year" : 2007
  },
  "child3" : {
    "name" : "Linus",
    "year" : 2011
  }
}