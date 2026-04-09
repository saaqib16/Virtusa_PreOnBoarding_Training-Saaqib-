"""
Problem:
Given a nested list of integers, return:
•	Sum of each sublist 
•	Maximum value among all sublists 
•	Flattened list without duplicates 

"""
def analyze_nested_list(nested_list):
    sum_of_sublists = [sum(sublist) for sublist in nested_list]
    max_value = max(max(sublist) for sublist in nested_list)
    flattened_list = list(set(num for sublist in nested_list for num in sublist))
    
    return sum_of_sublists, max_value, flattened_list
# Example usage
nested_list = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]
sums, max_val, flattened = analyze_nested_list(nested_list)
print(f"Sum of each sublist: {sums}")
print(f"Maximum value among all sublists: {max_val}")
print(f"Flattened list without duplicates: {flattened}")