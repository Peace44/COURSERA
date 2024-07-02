class JosephusList:
    def __init__(self, rebels):
        self.rebels = rebels
        self.next_eliminator = rebels[0] 
    
    def __len__(self):
        return len(self.rebels)

    def __iter__(self):
        pass

    def __getitem__(self, id):
        if id < 0 or id >= len(self):
            raise IndexError("Index out of range")
        return self.rebels[(self.next_eliminator + id) % len(self)]

    def __repr__(self):
        return str(self.rebels)
    
    def eliminate(self, k):
        next_eliminator_index = self.rebels.index(self.next_eliminator)
        next_rebel_to_eliminate_index = (next_eliminator_index + k - 1) % len(self)
        self.rebels.pop(next_rebel_to_eliminate_index)
        self.next_eliminator = self.rebels[(self.rebels.index(self.next_eliminator) + 1) % len(self)]
    
    def get_survivor(self, k):
        while len(self) > 1:
            self.eliminate(k)
        return self.next_eliminator



def greedy_josephus(n, k):
    rebels = JosephusList([i for i in range(n)])
    return rebels.get_survivor(k)


if __name__ == "__main__":
    n, k = map(int, input().split())
    print(greedy_josephus(n, k))