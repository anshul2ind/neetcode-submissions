class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ''
        for val in strs:
            result += str(len(val)) + 't' + val
        return result



    def decode(self, s: str) -> List[str]:
        result = []
        print(s)
        while len(s) > 0:
            print(s)
            delimeterIndex = s.index('t')
            charCount = int(s[:delimeterIndex])
            end = delimeterIndex + charCount + 1
            result.append(s[delimeterIndex+1:end])
            s = s[end:]
        return result
