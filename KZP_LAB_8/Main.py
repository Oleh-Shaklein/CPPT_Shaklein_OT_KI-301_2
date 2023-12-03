from Equations import Equations
from WFile import WFile
def main():
    file_name = input("Введіть ім'я файлу куди буде зберігатись результат: ")
    try:
        x = float(input("Введіть X: "))
        equations=Equations()
        result =equations.calculate(x)
        wfile=WFile(file_name)
        wfile.writeResTxt(str(result))
        wfile.writeResBin(str(result))
        read_result = wfile.readResBin()
        read_result1 = wfile.readResTxt()
        print("Результат з файлу:", read_result)
        print("Результат з файлу:", read_result1)
    except ValueError:
        print("Помилка: Введенне значення X має бути числом")
    except IOError:
        print("Помилка: не вдалося зчитати значення з файлу")
if __name__ == "__main__":
    main()
