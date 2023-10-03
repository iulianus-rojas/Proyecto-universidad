from datetime import datetime

def calcular_edad():
    fecha_nacimiento = input("Ingrese la fecha de nacimiento (AAAA-MM-DD): ")
    fecha_actual = input("Ingrese la fecha actual (AAAA-MM-DD): ")
    
    fecha_nacimiento = datetime.strptime(fecha_nacimiento, "%Y-%m-%d")
    fecha_actual = datetime.strptime(fecha_actual, "%Y-%m-%d")
    
    edad = fecha_actual.year - fecha_nacimiento.year
    
    mes_actual = fecha_actual.month
    dia_actual = fecha_actual.day
    
    mes_nacimiento = fecha_nacimiento.month
    dia_nacimiento = fecha_nacimiento.day
    
    # Restar un año si la fecha actual es anterior al día y mes de nacimiento
    if mes_actual < mes_nacimiento or (mes_actual == mes_nacimiento and dia_actual < dia_nacimiento):
        edad -= 1
    
    print("Edad actual:", edad, "años")

# Llamar a la función para calcular la edad
calcular_edad()
