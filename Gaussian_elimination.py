print('Gaussian Elimination Method')
array = [[1.0, 3.0, -5.0, 2.0], [3.0, 11.0, -9.0, 4.0], [-1.0, 1.0, 6.0, 3.0]]


def display_matrix(arr):
    for i in range(3):
        for j in range(4):
            print(str(arr[i][j]) + '  \t', end='')
            if j == 2:
                print('| \t', end='')
        print()

print('Initial value: ')
display_matrix(array)

first = array[1][0]
second = array[2][0]
for j in range(4):
    array[1][j] = array[1][j] - (array[0][j] / array[0][0]) * first
    array[2][j] = array[2][j] - (array[0][j] / array[0][0]) * second

print('\n\nFirst step: ')
display_matrix(array)

third = array[2][1]
for i in range(1, 4):
    array[2][i] = array[2][i] - ((array[1][i] / array[1][1]) * third)

print('\n\nSecond step: ')
display_matrix(array)
