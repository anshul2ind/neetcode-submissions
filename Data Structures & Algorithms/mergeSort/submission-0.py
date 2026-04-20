# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def mergeSort(self, pairs: List[Pair]) -> List[Pair]:
        return self.sort(pairs,0,len(pairs)-1)
    
    def sort(self, pairs: List[Pair], start, end) -> List[Pair]:

        if(end-start + 1 <= 1):
            return pairs
        
        m = (end + start) // 2
        self.sort(pairs, start, m)
        self.sort(pairs, m + 1, end)
        # print(pairs,start,m,end)
        self.mergeArr(pairs, start, m, end)

        return pairs
    
    def mergeArr(self, pairs: List[Pair], start, m, end)-> None:
        l = pairs[start:m+1]
        r = pairs[m+1:end+1]

        i = j = 0 
        k = start

        while i < len(l) and j < len(r):
            if l[i].key <= r[j].key:
                pairs[k] = l[i]
                i += 1
            else:
                pairs[k] = r[j]
                j += 1
            k += 1
        while i < len(l):
            pairs[k] = l[i]
            i += 1
            k += 1

        while j < len(r):
            pairs[k] = r[j]
            j += 1
            k += 1



