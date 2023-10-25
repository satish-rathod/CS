def solve(self, A):
    # Just write your code below to complete the function. Required input is available to you as the function arguments.
    # Do not print the result or any output. Just return the result via this function.

    maxeven = 0

    for i in A:
        if(i%2==0):
            maxeven = i
            break
        
    minodd = 0

    for i in A:
        if(i%2==1):
            minodd = i
                 break

    for i in A:
        if(i%2==0 and i>maxeven):
            maxeven = i
        
        if(i%2==1 and i<minodd):
            minodd = i
            
    return maxeven - minodd 