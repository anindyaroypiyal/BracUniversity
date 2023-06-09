keywords = ['auto', 'break', 'case', 'char', 'const', 'continue', 'default', 'do', 'double', 'else', 'enum', 'extern', 'float', 'for', 'goto', 'if', 'int', 'long', 'register', 'return', 'short', 'signed', 'sizeof', 'static', 'struct', 'switch', 'typedef', 'union', 'unsigned', 'void', 'volatile', 'while']
m_o = ['+', '-', '*', '/', '=', '%', '++', '--']
operator = ['==', '!=', '>', '<', '>=', '<=', '&&', '||', '!']
other_o = [',', ';', '(', ')', '{', '}']

unique = []
key = []
iden = []
math_op = []
logical_op = []
numeric = []
other = []

def isNumber(n):
    try:
        float(n)
        return True
    except ValueError:
        return False

filename = '../input.txt'
with open(filename) as file_object:
    content = file_object.read()
    word = content.split()

    for x in word:
        if x in keywords:
            if x not in unique:
                unique.append(x)
                key.append(x)
        elif x in m_o:
            if x not in unique:
                unique.append(x)
                math_op.append(x)
        elif x in operator:
            if x not in unique:
                unique.append(x)
                logical_op.append(x)
        elif x in other_o:
            if x not in unique:
                unique.append(x)
                other.append(x)
        elif isNumber(x):
            if x not in unique:
                unique.append(x)
                numeric.append(x)
        else:
            if x not in unique:
                unique.append(x)
                iden.append(x)

print("Keywords: ", end=' ')
print(*key, sep=', ')
print("Identifiers: ", end=' ')
print(*iden, sep=', ')
print("Math Operators: ", end=' ')
print(*math_op, sep=', ')
print("Logical Operators: ", end=' ')
print(*logical_op, sep=', ')
print("Numerical Values: ", end=' ')
print(*numeric, sep=', ')
print("Others: ", end=' ')
print(*other)
