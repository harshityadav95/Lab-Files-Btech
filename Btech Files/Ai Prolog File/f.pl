go:-
 write("enter the no."),nl,
readint(A),
 B=1,
 fact(A,B).
 fact(A,B):-
 A<>1,
 Y=A-1,
 Z=A*B,
 fact(Y,Z).
 fact(1,B):-
 write("factorial is",B).
