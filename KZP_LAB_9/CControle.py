from Conditioner import Conditioner
class CControle(Conditioner):
    def __init__(self, brand, model, _temp, power_status, wifi, air_quality, ESM):
        # конструктор батьківського класу
        super().__init__(brand, model, _temp, power_status)
        self.wifi = wifi
        self._air_quality = air_quality
        self.ESM = ESM

    # геттер метод додаткових параметрів

    def get_wifi(self):
        return self.wifi

    def get_air_quality(self):
        return self._air_quality

    def get_ESM(self):
        return self.ESM

    # сеттер метод додаткових параметрів
    def set_wifi(self, wifi):
        self.wifi = wifi

    def set_air_quality(self, air_quality):
        self._air_quality = air_quality

    def set_ESM(self, ESM):
        self.ESM = ESM

    # оверрайд getinfo method для додаткової інформації
    def get_info(self):
        # виклик гет методу батьківського класу
        super().get_info()
        print("Чи ввімкнений Wi-Fi:", self.wifi)
        print("Сенсор якості повітря:", self._air_quality)
        print("Енергозберігаючий режим:", self.ESM)
