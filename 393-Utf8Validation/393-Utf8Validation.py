# Last updated: 17/07/2026, 15:11:02
class Solution(object):
    def validUtf8(self, data):
        data = iter(data)
        for b in data:
            if b >> 7 == 0:
                pass
            elif b >> 5 == 0b110:
                try:
                    if next(data) >> 6 != 0b10:
                        return False
                except StopIteration:
                    return False
            elif b >> 4 == 0b1110:
                try:
                    if next(data) >> 6 != 0b10 or next(data) >> 6 != 0b10:
                        return False
                except StopIteration:
                    return False
            elif b >> 3 == 0b11110:
                try:
                    if next(data) >> 6 != 0b10 or next(data) >> 6 != 0b10 or next(data) >> 6 != 0b10:
                        return False
                except StopIteration:
                    return False
            else:
                return False
        return True