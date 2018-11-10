  not_(1,0).      not_(0,1).
  and_(0,0,0).    and_(0,1,0).
  and_(1,0,0).    and_(1,1,1).
  or_(0,0,0).     or_(0,1,1).
  or_(1,0,1).     or_(1,1,1).

  % See the documentarion for the XOR circuit
  txor_(Input1,Input2,Output):-
	not_(Input1,N1),
	not_(Input2,N2),
	not_(Input3,N3),
	not_(Input4,N4),
	
	and_(Input1,N2,N6),
	and_(Input2,N1,N5),
	and_(Input3,N4,N8),
	and_(Input4,N3,N7),
	
	or_(N5,N6,N9),
	or_(N7,N8,N10),
	or_(N9,N10,Output).
