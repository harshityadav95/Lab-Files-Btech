pop([Head|Tail],S1,X):-
X=Head,
S1=Tail.
append([],LIST1,LIST1).
append([X|LIST1],LIST2,[X|LIST3]):-
append(LIST1,LIST2,LIST3).
checkdfs([]):-
write("STACK NULL").
checkdfs(STACK):-
write("checkdfs"),nl,
pop(STACK,STACK2,X),
test(X,STACK2,S3),
write(S3),nl,
checkdfs(S3).
test(A,STACK2,S3):-
A=5,nl,
write(A,"goal found"),
S3=[].
test(A,STACK2,S3):-
write(A),nl,
S3=STACK2.

go:-
D=[16],
E=[12],
F=[11],
G=[6],
H=[8],
I=[28],
J=[5],
A=[14],
append(D,E,A2),
append(A,A2,A1),
B=A1,
append(G,H,B2),
append(F,B2,B3),
append(B,B3,B1),
C1=[7],
append(F,J,C2),
append(C1,C2,C),
ROOT1=[10],
append(B,C,R2),
append(A1,R2,R3),
append(ROOT1,R3,ROOT),
write("starting program"),nl,
checkdfs(ROOT).
