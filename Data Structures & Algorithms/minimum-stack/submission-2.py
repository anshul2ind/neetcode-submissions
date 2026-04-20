class MinStack:

    def __init__(self):
        self.stack = []
        self.minByTop = []
        self.topPointer = -1
        self.currentMin = -1

    def push(self, val: int) -> None:
        if(self.topPointer == -1):
            self.currentMin = val
        self.topPointer += 1
        self.stack.append(val);
        if(val < self.currentMin):
            self.currentMin = val
        self.minByTop.append(self.currentMin)
    
    def pop(self) -> None:
        if(self.topPointer > -1):
            self.stack.pop(self.topPointer)
            self.minByTop.pop(self.topPointer)
            self.topPointer -= 1
            self.currentMin = self.minByTop[-1] if len(self.minByTop) > 0 else -1

    def top(self) -> int:
        return self.stack[self.topPointer]

    def getMin(self) -> int:
        return self.minByTop[self.topPointer]
