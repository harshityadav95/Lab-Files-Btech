solve() :-
	constraints(Colours,Drinks,Nationalities,Cigarettes,Pets),
	candidate(Colours,Drinks,Nationalities,Cigarettes,Pets),
	member(h(water,WaterHouse), Drinks),member(h(WaterColour,WaterHouse), Colours),
	member(h(zebra,ZebraHouse), Pets),member(h(ZebraColour,ZebraHouse), Colours),
	write("They drink water in the ",WaterColour," house\n"),
	write("The zebra live in the ",ZebraColour," house\n").

candidate(L1, L2, L3, L4, L5) :-
	perm(L1),perm(L2),perm(L3),perm(L4),perm(L5).

perm([h(_,A),h(_,B),h(_,C),h(_,D),h(_,E)]) :-
	permutation([A,B,C,D,E],[1,2,3,4,5]). 

constraints(Colours, Drinks, Nationalities, Cigarettes, Pets)  :- 
	% The Englishman lives in the red house
	member(h(englishman,H1), Nationalities),
	member(h(red,H1), Colours),
	% The Spaniard owns the dog
	member(h(spaniard,H2), Nationalities),
	member(h(dog,H2), Pets),
	% The Norwegian lives in the first house on the lleft
	member(h(norwegian,1), Nationalities),
	% Kools are smoked in the yellow house.
	member(h(kools,H3), Cigarettes),
	member(h(yellow,H3), Colours),
	% The man who smokes Chesterfields lives in the house
	% next to the man with the fox.
	member(h(chesterfields,H4), Cigarettes),
	next(H4, H5),
	member(h(fox,H5), Pets),
	% The Norwegian lives next to the blue house
	member(h(norwegian,H6), Nationalities),
	next(H6, H7),
	member(h(blue,H7), Colours),
	% The Winston smoker owns snails.
	member(h(winston,H8), Cigarettes),
	member(h(snails,H8), Pets),
	% The lucky strike smoker drinks orange juice
	member(h(lucky_strike,H9), Cigarettes),
	member(h(orange_juice,H9), Drinks),
	% The Ukrainian drinks tea
	member(h(ukrainian,H10), Nationalities),
	member(h(tea,H10), Drinks),
	% The Japanese smokes parliaments
	member(h(japanese,H11), Nationalities),
	member(h(parliaments,H11), Cigarettes),
	% Kools are smoked in the house next to the house where the horse is kept.
	member(h(kools,H12), Cigarettes),
	next(H12, H13),
	member(h(horse,H13), Pets),
	% Coffee is drunk in the green house
	member(h(coffee,H14), Drinks),
	member(h(green,H14), Colours),
	% The green house is immediately to the right (your right) of the ivory house
	member(h(green,H15), Colours),
	lleft(H16, H15),
	member(h(ivory,H16), Colours),
	% Milk is drunk in the middle house.
	member(h(milk,3), Drinks).

permutation([],[]).
permutation([A|X],Y) :- delete(A,Y,Y1), permutation(X,Y1).

delete(A,[A|X],X).
delete(A,[B|X],[B|Y]) :- delete(A,X,Y).

member(A,[A|_]) :- !.
member(A,[_|X]) :- member(A,X).

next(X,Y) :- lleft(X,Y).
next(X,Y) :- lleft(Y,X).

lleft(1,2).
lleft(2,3).
lleft(3,4).
lleft(4,5).
