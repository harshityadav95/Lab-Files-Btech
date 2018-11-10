cust_names([jitander,preeti,veena,avinash,jyeshtha],green).
cust_names([arvind,poonam,abhijeet],white).
cust_names([daya,bhanu,anuradha,anju],red).
model(red,[hyundai_accent,ford_monedo,indgo]).
model(white,[maruti_esteem,maruti_baleno]).
model(green,[toyota_avalon,lotus_elise]).
model(green,[toyta_avalon,lotus_elise]).
price(red,450000).
price(white,350000).
price(green,430000).
cost(green):-
cust_names(A,green),nl,
write(A),nl,
price(green,X),nl,
write("the price of green color car is ",X),nl,
model(green,Y),nl,
write("the model available in green color ",Y),nl.
cost(white):-
cust_names(A,white),nl,
write(A),nl,
price (white,X),nl,
write("the price of white color car is ",X),nl,
model(blue,Y),nl,
write(" the models available in white color ",Y),nl.
