# What number is this!?
import random
print("Hello and welcome to 'What number is this!?'\n")

score = 0
a = random.randint(1, 10)
b = random.randint(1, 10)

while True:

    print(f"If the number {a} is the number {b}, then what is the number {random.randint(1, 10)}!? ")
    guess = input()

    if guess == str(a):

        print(f"Correct... Your score is {score} points.")
        break

    else:

        print("Wrong...")
        score -= random.randint(5, 10)

    b = a
    a = random.randint(1, 10)
