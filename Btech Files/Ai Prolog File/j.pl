pop([Head|Tail],S1,X):-
X=Head,
S1=Tail.
append([],LIST1,LIST1).
append([X|LIST1],LIST2,[X|LIST3]):-
append(LIST1,LIST2,LIST3).
checkbfs([]):-
write("STACK NULL").
checkbfs(STACK):-
write("checkbfs"),nl,
pop(STACK,STACK2,X),
test(X,STACK2,S3),
write(S3),nl,
checkbfs(S3).
test(A,STACK2,S3):-
A=5,nl,
write(A,"goal found"),
S3=[].
test(A,STACK2,S3):-
write(A),nl,
S3=STACK2.
go:-
A=[10],B=[7],C=[6],D=[5],E=[12],F=[11],G=[15],
H=[16],I=[17],J=[20],
append(I,J,R1),
append(G,H,R2),
append(E,F,R3),
append(R2,R1,R4),
append(R3,R4,R5),
append(C,D,R6),
append(B,R6,R7),
append(R7,R5,R8),
append(A,R8,R9),
ROOT=R9,
write("Starting Program\n"),nl,
checkbfs(ROOT).
