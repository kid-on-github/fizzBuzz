'''
This is a program that plays Fizz Buzz.
Count to 100; replace numbers devisable by three with the word fizz.
Replace numbers devisable by five with the word buzz.
Numbers divisible by both become fizz buzz.
'''

for num in range(1,101):
    toPrint = ''

    if num % 3 == 0:    toPrint += 'fizz '
    if num % 5 == 0:    toPrint += 'buzz '
    if toPrint == '':   toPrint = f'{num}'

    print(toPrint.rstrip())
