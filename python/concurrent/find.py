import threading
import time

from matrix import generate_matrix, max, min
import sys


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
    
    threads = [] 

    for threads in threads: 
        t1 = threading.Thread(target=max, args=matrix)
        t2 = threading.Thread(target=min, args=matrix)
        threads.append(t1)
        threads.append(t2)
        t1.start()
        t2.start()
    print(f'Max value: {max(matrix)}')
    print(f'Min value: {min(matrix)}')
    
