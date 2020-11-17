# cg-mp-team2
Team-2 PLP

create table claim(claimNumber number PRIMARY KEY, 
	              claimReason varchar2(30), 
	              accidentLocationStreet varchar2(40),
	              accidentCity varchar2(15), 
	              accidentState varchar2(15), 
	              accidentZip number, 
	              claimType varchar2(30), 
	               policyNumber number );
