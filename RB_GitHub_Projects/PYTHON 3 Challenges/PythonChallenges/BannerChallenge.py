# Goal: Create a lovely banner, who's lenght is adjusted depending on the amount of character in it
print("Welcome to RB_Banner_Printer")

Banner_Entry = input("Please Enter in text for a banner")


def RB_Banner_Printer(text):
    Banner_Entry = text
    Space_Banner = "  " + Banner_Entry + "  "  # blank spaces add up to 8

    # Blank_Space = "   " + " " + "   "
    print("The length of entry " + Banner_Entry + " is ")
    entry = int(len(Space_Banner))
    # som = entry * '/'
    print(entry)
    set_param = entry * 2

    numer = entry * 2


    if numer == entry * 2:
        Blank_Space_Up_Top = "" * set_param
        Up_Top_Banner = "  " + str(Blank_Space_Up_Top) + "  "
        Blank_Count_Up_Top = entry * 2

    if numer == entry * 2:
        Blank_Space_Below = "" * set_param
        Below_Banner = "  " + str(Blank_Space_Below) + "  "
        Blank_Count_Below = entry * 2
    # I might have to do conditionals to set the length of the text for the above and lower half's of the banner

    # Now we take the len of the string for centering purposes
    print("Printing Banner Now")
    print("                    ", Blank_Space_Up_Top.center(Blank_Count_Up_Top, '~'))
    print("                    ", Space_Banner.center(numer, '/'))
    print("                    ", Blank_Space_Below.center(Blank_Count_Below, '~'))


  # I'm Going to overload the function only with the text entry

RB_Banner_Printer(Banner_Entry)




