a = input()
b = input()

if a[0] == '0':
    print(int(a,2))
else:
    numList = []
    lengthA = len(a)
    for i in range(1, lengthA):
        check = list(a)
        if check[i] == '0':
            check[i] = '1'
        else:
            check[i] = '0'
        numList.append(int(''.join(check),2))

    lengthB = len(b)
    for i in range(lengthB):
        check = list(b)
        if check[i] != '0':
            check[i] = '0'
            num = int(''.join(check),3)
            if num in numList:
                print(num)
                break
        if check[i] != '1':
            check[i] = '1'
            num = int(''.join(check),3)
            if num in numList:
                print(num)
                break
        if check[i] != '2':
            check[i] = '2'
            num = int(''.join(check),3)
            if num in numList:
                print(num)
                break