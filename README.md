#coding solutions
for codevita tcs logic pyramid



x,y=6,22
size = 5
for i in range(0, size):
    for j in range(0,(size-i)*3):
        print(end=" ")
    for j in range(0, i+1):
        print(format(x, '05'), end=" ")
        x = x + y;
        y = y + 16;

    print(end='\n')


