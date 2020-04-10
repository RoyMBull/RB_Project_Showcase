def Calculate_Area_With_Radius(r):
    print("Given radius is ", r)
    print("...Calculating")
    Area_with_R = 3.14 * (r * r)
    print("...Area for circle with radius ", r, " is... ")
    print(Area_with_R, "cm^2")

def Calculate_Area_With_Diameter(d):
    print("Given Diameter is ", d)
    print(".... Calculating the radius")
    rad = d/2
    print("radis is ", rad)
    print(".... Calculating Area")
    Area_with_D = 3.14 * (rad * rad)
    print("....Area for circle with diameter ", d, " is.... ")
    print(Area_with_D, "in^2")


def Calculate_Area_With_Circumference(c):

    print("Given circumference is ", c)
    print ("..... Calculating circumference value", c)
    convert_c = c * c
    pi_val = 3.14
    print ("circumference is ", convert_c)
    print ("calculating c^2/4pi")
    div_convert_c = convert_c//4
    div_pi = pi_val
    print ("....Calculating the Area")

    Div_C_and_Div_Pi = div_convert_c/div_pi * 1.0

    print(Div_C_and_Div_Pi, "cm^2")


print("How Would you like to calculate the area of a circle?")
print("type 'r', for radius")
print("type 'd', for diameter")
print("or type 'c', for circumference")

Choice = input("Enter Here")

if Choice == "r":
    Set_Radius_Val = int(input("Set the radius value here"))
    Calculate_Area_With_Radius(Set_Radius_Val)

if Choice == "d":
    Set_Diameter_Val = int(input("Set the diameter value here"))
    Calculate_Area_With_Diameter(Set_Diameter_Val)

if Choice == "c":
    Set_Circumference_Val = int(input("Set the circumference value here"))
    Calculate_Area_With_Circumference(Set_Circumference_Val)