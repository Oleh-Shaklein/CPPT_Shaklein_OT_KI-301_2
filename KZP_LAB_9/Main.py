from CControle import CControle, Conditioner
if __name__ == '__main__':
   conditioner=Conditioner(
       "Samsung",
       "SMS-AC-001",
       26,
       False
   )
   conditioner.get_info()
   print("--------------------------------------------------")
   conditioner.set_power_status(True)
   conditioner.set_model("LG")
   conditioner.get_info()
   print("--------------------------------------------------")

   climate_control=CControle(
       "Panasonic",
       "AC-201",
       20,
       True,
       True,
       1000,
       True
   )
   climate_control.get_info()
   print("--------------------------------------------------")

   climate_control.set_temp(30)
   climate_control.set_wifi(False)
   climate_control.set_brand("Sumsung")
   climate_control.get_info()
   print("--------------------------------------------------")
