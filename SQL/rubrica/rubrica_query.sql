#insert new utente
INSERT INTO utente  (id,name, surname, age, telephone, smart) VALUE
				 (null, 'Flavia', 'Rossa', 19, 789468, 6);

#select on user information and telephone numbers
SELECT U. id, U.name, U.surname, U.age, U.telephone, S.name as Model FROM utente as U
 INNER JOIN smartphone AS S on U.smart=S.id;
 
 
#update name and smartphone of user with id=6 
 Update Utente 
	Set name='Filippo', smart=2
    where id=6;
    
#visualize all telephone
select S.name as Smartphone, B.name as Brand, C.name as Country from smartphone as S
	Inner join Brand as B on S.brand=B.id
    Inner join Country as C on B.country=C.code;
    
#select users with more than one iphone
SELECT count(U.id) as count, S.name  from Utente as U
	Inner join smartphone as S on u.smart=s.id
	Group by smart having count>=2;
    