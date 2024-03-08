import threading
import time

from matrix import generate_matrix, max, min
import sys


def min_matrix_value(matrix): 
    print(f'Min value: {min(matrix)}')

def max_matrix_value(matrix):
    print(f'Max value: {max(matrix)}')



if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Use: python3 find.py <size>")
        sys.exit(1)

    try:
        size = int(sys.argv[1])
    except ValueError:
        print("The size of the matrix must be an integer.")
        sys.exit(1)
    
    matrix = generate_matrix(size)
    
    thread_max_value = threading.Thread(target=max_matrix_value, args=(matrix,))
    thread_min_value = threading.Thread(target=min_matrix_value, args=(matrix,))

    thread_max_value.start()
    thread_min_value.start()
