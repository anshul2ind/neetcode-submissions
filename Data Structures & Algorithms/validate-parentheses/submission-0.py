class Solution:
  def isValid(self, s: str) -> bool:
    stack = []
    for char in s:
        match char:
            case '(' | '{' | '[':
                stack.append(char)
            case ')' | '}' | ']':
                if(not stack):
                    return False;
                poped = stack.pop(-1)
                if(not ((char == ')' and poped == '(') or (char == ']' and poped == '[') or (char == '}' and poped == '{'))):
                    return False
    return not stack
        