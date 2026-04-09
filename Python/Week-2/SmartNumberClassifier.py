"""
Problem:
Given an integer n, classify it based on the following rules:
•	If divisible by both 3 and 5 → "FizzBuzz" 
•	If divisible by 3 → "Fizz" 
•	If divisible by 5 → "Buzz" 
•	If prime → "Prime" 
•	Otherwise → "Composite" 
Return the classification.
"""

def classify_number(n):
    if n % 3 == 0 and n % 5 == 0:
        return "FizzBuzz"
    elif n % 3 == 0:
        return "Fizz"
    elif n % 5 == 0:
        return "Buzz"
    elif is_prime(n):
        return "Prime"
    else:
        return "Composite"
def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True 


n = int(input("Enter an integer: "))
classification = classify_number(n)
print(f"The number {n} is classified as: {classification}")     