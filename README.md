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
		      
		    
insert into claim values(100, 'Damage', 'St-12' ,'Hyderabad', 'Telangana', 500017, 'Restaurant', 200);

		      
		      
		      
		      
-------------------------------------------------------------------------------------------------------------------------------- 


create table Accounts(AccountNumber number(10) primary key,InsuredName varchar2(30) not null,
InsuredStreet varchar2(40),
InsuredCity varchar2(15) not null,
InsuredState varchar2(15) not null,
InsuredZip number(5) not null,
BusinessSegment varchar2(30),
UserName varchar2(20),
constraint User_fk foreign key(UserName) references UserRole(UserName));


