waterjug(X,Y):-
X=0,
Y=0,
write("4l jug empty & 3l jug empty"),nl,
Z=0,
A=3,
waterjug(Z,A).
waterjug(X,Y):-
X=0,
Y=3,
write("4l jug empty & 3ljug 3l water"),nl,
Z=3,
A=0,
waterjug(Z,A).
waterjug(X,Y):-
X=3,
Y=0,
write(" 4l jug 3l water & 3l jug empty"),nl,
Z=3,
A=3,
waterjug(Z,A).
waterjug(X,Y):-
Z=3,
A=3,
write("4l jug 3l water& 3l jug 3l water"),nl,
Z=4,
A=2,
waterjug(Z,A).
waterjug(X,Y):-
X=4,
Y=2,
write("4l jugh 4l water & 3l jug 2l water"),nl,
Z=0,
A=2,
waterjug(Z,A).
waterjug(X,A):-
X=0,
Y=2,
write("4l jug empty & 3l jug 2l water"),nl,
Z=2,
A=0,
waterjug(Z,A).
waterjug(X,Y):-
X=2,
Y=0,
write("Goal Achieved").
