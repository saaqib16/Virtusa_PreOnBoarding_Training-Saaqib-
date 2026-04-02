
#Getting input via STDIN
userInput = list(map(int,input().split()))
if sum(userInput)%2==0:
    print("even")
else:
    print("odd")

#print("The Input Provided is: " + userInput)