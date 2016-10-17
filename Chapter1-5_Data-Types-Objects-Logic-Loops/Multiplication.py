# Multiplication

def Multiplication():
    for i in range(1,11):
        for j in range(1,11):
            print "{x:>5}".format(x = str(i*j)),
        print

Multiplication()