# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def quickSort(self, pairs: List[Pair]) -> List[Pair]:
        return self.quickSortHelper(pairs, 0 , len(pairs) - 1)
    
    def quickSortHelper(self, pairs: List[Pair], s: int, e: int) -> List[Pair]:
        if (e - s + 1) <= 1:
            return pairs
        
        pivot = pairs[e].key
        right = s

        for i in range(s, e,):
            if pairs[i].key < pivot:
                pairs[i], pairs[right] = pairs[right], pairs[i]
                right += 1

        pairs[right], pairs[e] =  pairs[e], pairs[right]

        self.quickSortHelper(pairs, s , right -1)
        self.quickSortHelper(pairs, right +1, e)
        return pairs

