"""Problem:
Given a string:
•	Reverse only vowels 
•	Convert consonants to uppercase 
•	Remove all digits 
Return the transformed string.

"""

def transform_string(input_string):
    vowels = 'AEIOUaeiou'
    vowel_list = [char for char in input_string if char in vowels]
    
    transformed_string = ''
    for char in input_string:
        if char.isdigit():
            continue  # Skip digits
        elif char in vowels:
            transformed_string += vowel_list.pop()  # Reverse vowels
        else:
            transformed_string += char.upper()  # Convert consonants to uppercase
    
    return transformed_string

# Example usage 
input_str = "Hello World! 123"
result = transform_string(input_str)
print(f"Transformed string: {result}")  