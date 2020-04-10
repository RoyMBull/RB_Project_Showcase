from turtle import Turtle

zelda = Turtle()

for x in range(1, 360):
    zelda.forward(1)
    zelda.left(1)

zelda.getscreen().mainloop()