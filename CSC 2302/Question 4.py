import random

def readRandom(text):
    infile = open(text).read().splitlines()
    return random.choice(infile)

print(readRandom('text.txt'))