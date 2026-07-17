# Last updated: 17/07/2026, 15:17:00
class Solution(object):
    def isValid(self, s):
        stack=[]        
        for ch in s:
            if ch=="(":
                stack.append(")")
            elif ch=="{":
                stack.append("}")
            elif ch=="[":
                stack.append("]")
            else:
                if not stack or stack.pop()!=ch:
                    return False
        return not stack