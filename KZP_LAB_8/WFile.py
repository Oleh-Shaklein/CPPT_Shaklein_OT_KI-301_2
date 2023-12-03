import struct
class WFile:
    def __init__(self, name):
        self.name = name

    def writeResTxt(self, value):
        try:
            with open(f"{self.name}.txt", "w") as file:
                file.write(f"{value}\n")
        except Exception as e:
            print("Вийняток під час введення в файл", str(e))

    def readResTxt(self):
        try:
            with open(f"{self.name}.txt", "r") as file:
                result = float(file.readline())
                return result
        except FileNotFoundError:
            print(f"Файл {self.name}.txt не знайдено")
        except Exception as e:
            print("Вийняток під час читання файлу", str(e))
        return None
    def writeResBin(self,value):
        try:
            with open(f"{self.name}.bin", "wb") as file:
                file.write(value.encode('utf-8'))
        except Exception as e:
            print("Вийняток під час введення в бінарний файл", str(e))

    def readResBin(self):
        try:
            with open(f"{self.name}.bin", "rb") as file:
                result = file.read(8)
                return result.decode('utf-8')
        except FileNotFoundError:
            print(f"Файл {self.name}.bin не знайдено")
        except Exception as e:
            print("Вийняток під час читання файлу", str(e))
        return None
