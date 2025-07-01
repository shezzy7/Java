class Node:
    def __init__(self, val=None):
        self.val = val
        self.left = None
        self.right = None

def inOrederTrav(node):
    if node is None:
        return ''
    
    left = inOrederTrav(node.left)
    if node.val:
        val=node.val
    else:
        val=''
        
    right = inOrederTrav(node.right)
    
    return left + val + right  

def BuildTree(binaryForm):
    root = Node()
    current = root
    for bit in binaryForm:
        if bit == '0':
            current.left = Node(bit)
            current = current.left
        else:
            current.right = Node(bit)
            current = current.right
            
    return root

def convertToBin(num):
    binary = ''
    if num == 0:
        return '0'
    while num > 0:
        binary = str(num % 2) + binary
        num = num // 2
        
    return binary


def convertToDec(binaryStr):
    result = 0
    for bit in binaryStr:
        result = result * 2 + int(bit)
    return result

def Problem3():
    import sys
    num1 = int(sys.stdin.readline().strip())
    
    binaryForm = convertToBin(num1)
    root = BuildTree(binaryForm)
    result_of_traversal = inOrederTrav(root)
    decimalForm = convertToDec(result_of_traversal)
    print(decimalForm)
    
Problem3()