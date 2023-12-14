class Conditioner:
    def __init__(self, brand, model, _temp, power_status):
        self._brand = brand
        self._model = model
        self._temp = _temp
        self._power_status = power_status

    # геттери
    def get_brand(self):
        return self._brand

    def get_model(self):
        return self._model

    def get_temp(self):
        return self._temp

    def get_power_status(self):
        return self._power_status

    # сеттери
    def set_brand(self, brand):
        self._brand = brand

    def set_model(self, model):
        self._model = model

    def set_temp(self, _temp):
        self._temp = _temp

    def set_power_status(self, power_status):
        self._power_status = power_status
        
    def get_info(self):
        print(f"Бренд : {self._brand}")
        print(f"Модель : {self._model}")
        print(f"Температура : {self._temp}")
        print(f"Чи ввімкнений : {self._power_status}")
