b=[[5,10,19],[2,6,7],[12,13,14]]
print(n)
j=0
k=0
for x in range(3):
    if x == 2:
        break
    else:
        for y in range(3):
            if j == 2 and y == 2:
                break
            print(b[x][y], end=" ")
            if y == 2:
                for x in range(1,3):
                    print(n[x][y], end=" ")
                    j=x
                    if x==2:
                        for y in range(y-1,-1,-1):
                            print(b[x][y], end=" ")