def sieve(pp):
    num_pp=2
    while num_pp*pp <= max :
        for i in range(0, len(arr)):
            if arr[i] == num_pp*pp :
                arr[i] = -1
                break
        num_pp+=1

    for i in arr:
        if i>pp : 
            pp = i
            break   
    
    if 2*pp <= max :  
        sieve(pp)

print("Enter to upper limit: ")
n = input()
arr = []
p=2
max = 0

for i in range(2, n+1) :
    arr.append(i)

max = arr[len(arr)-1]
print(arr)
sieve(p)
print(arr)

