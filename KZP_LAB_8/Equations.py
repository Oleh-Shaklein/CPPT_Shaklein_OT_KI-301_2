import math

class Equations:
    def calculate(self,x):
        rad = x * math.pi / 180.0
        try:
        # y=1/sin(x)
            y = 1/math.sin(x)
            if rad == math.pi or rad == (math.pi * 2):
                raise Exception
        except Exception as e:
            print("Вийняток ",str(e))
            return 0
        return y
