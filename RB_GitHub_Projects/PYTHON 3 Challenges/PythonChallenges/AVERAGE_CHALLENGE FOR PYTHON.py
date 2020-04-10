import statistics

#Goal, write an average calculator that will take a list of numbers, and compute averages of the following:
#->Mean, Median, and Mode and do this using very few lines of code
#---->#Non-Computable Mode will pop an error, but will display all other average types

listhere = []
RUNIF = 0
#I could control the loop mechanism by bringing me the sum of the list itself
while RUNIF != 1:
    add_to_list = float(input('enter'))
    done_Adding_to_list = input("Are you done entering? Y, else enter something else")

    listhere.append(add_to_list)

    print(listhere)

    if done_Adding_to_list == "Y":
        RUNIF = 1

#Displays the mean, median, and mode ranges
print("Sum of the list of numbers is   ", sum(listhere))
#add a print of the average here
print("Median of the list of numbers is   ", statistics.median(listhere))
print("Mean of the list of numbers is   ", statistics.mean(listhere))
print("Mode of the list of numbers is   ", statistics.mode(listhere))


