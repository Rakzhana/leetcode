# Last updated: 17/07/2026, 15:10:11
class Solution(object):
    def checkGoodInteger(self, n):
        digitSum = 0
        squareSum = 0
        while n > 0:
            digit = n % 10
            digitSum += digit
            squareSum += digit * digit
            n //= 10

        return squareSum - digitSum >= 50