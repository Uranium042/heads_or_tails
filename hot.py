import random

def toss():
    return random.choice(["Heads", "Tails"])

def main():
    heads = 0
    tails = 0

    print("Who are you?")
    name = input("> ")
    print(f"Hello, {name}!")

    print("Tossing a coin...")
    for i in range(1, 4):
        result = toss()
        if result == "Heads":
            heads += 1
        else:
            tails += 1
        print(f"Round {i}: {result}")

    print(f"Heads: {heads}, Tails: {tails}")

if __name__ == "__main__":
    main()
