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


create table policyDetails(PolicyNumber number ,QuestionId varchar2(15),Answer varchar2(30));


create table Policy(
    PolicyNumber numeric(10) ,
    PolicyPremium decimal(8,3),
    AccountNumber numeric(10),
    primary key (PolicyNumber)
   );
