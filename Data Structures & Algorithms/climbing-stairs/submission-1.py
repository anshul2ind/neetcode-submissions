class Solution:
    result =  {}
    def climbStairs(self, n: int) -> int:
        return self.calculate(0,n)
    
    def calculate(self, currentStep, n) -> int:
        if currentStep == n:
            return 1
        elif currentStep > n:
            return 0
        oneStep = currentStep + 1
        twoStep = currentStep + 2

        if(oneStep in self.result):
            oneStepResult = self.result[oneStep]
        else:    
            oneStepResult = self.calculate(oneStep, n)

        if(twoStep in self.result):
            twoStepResult = self.result[twoStep]
        else:    
            twoStepResult = self.calculate(twoStep, n)
            
        return oneStepResult + twoStepResult