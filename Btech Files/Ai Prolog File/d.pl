Tower(1,A,C,B):-
write("move from",A,"to",C),nl.
Tower(N,A,C,B):-
Z=N-1,
Tower(Z,A,B,C),
write("move from",A,"to",C),nl,
Tower(Z,B,C,A).
