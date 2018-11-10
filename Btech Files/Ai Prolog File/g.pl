logon :-
                getinput(Name,Password),

	user(Name,Password),
		write("You are now logged on."),nl.
	logon :-
		write("Sorry, you are not permitted access."),
		write("Please try again."),nl,
		logon.

	getinput(Name,Password) :-
		write("Please Enter Your Name:"),
		readln(Name),nl,
		write("Please Enter Password:"),
			
		readln(Password),nl.
		user(bill,bigfoot).

	user(john,superman).
	user(sue,happy).
	

