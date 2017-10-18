#select all smartphones in database
select * from Smartphone;

#select all smartphones with projection:name, rame size and cpu
select name, ram, size, cpu from Smartphone;

#select name of smartphone with display resolution equal to 1080x1920
select name from Smartphone 
	where displayResolution = "1080x1920";
    
#select name of smartphones with display resolution equal to 1080x1920 and 3Gb ram    
select name from Smartphone 
	where displayResolution = "1080x1920" AND ram = "3Gb" ;
    
#select all Galaxy Smartphone
select * from Smartphone    
	where name like "Galaxy%";
    
#select all Galaxy Smartphone with dual-core cpu
 select * from Smartphone    
	where name like "Galaxy%" and cpu like "%ual-core%";
 
 #select all smartphones with weight greater than or equals 150 grams
 select * from Smartphone
   where (weight>= 150);
   
#select all smartphones with weight greater than or equals 150 grams
 select * from Smartphone
   where (weight< 150);
      
#select all smartphones sorted by displayPpi
select * from Smartphone
		order by displayPpi;
        
#select all smartphones sorted by displayPpi    
select * from Smartphone
		order by displayPpi desc;  
        
#select name and brand of all smartphones in database
select S.name, B.name from smartphone as S
		inner join brand as B on B.id=S.brand;
        
#select name and opsys of all smartphones in the database sorted by opsys, name        
 select S.name, O.description from Smartphone as S
	Inner join opsys as O on O.id=S.opsys
    order by O.description, S.name;
    
#select name and opsys of all Android in the database descentant sorted by weight  
 select S.name, O.description, s.weight from Smartphone as S
	Inner join opsys as O on O.id=S.opsys
    where O.description= "android"
    order by s.weight desc; 
    
#select name, brand, country of all smartphones in the database sorted by country, brand, name 
select S.name as Smartphone, B.name as Brand, C.name as Country from smartphone as S
	Inner join Brand as B on S.brand=B.id
    Inner join Country as C on B.country=C.code
    order by C.name , B.name,S.name;
    
    
#select count of smartphones for each opSys in the database 
select count(s.id) as count from smartphone as s
	Inner join opsys as o on s.opsys=o.id
    group by o.description;


#select count of smartphones for each country in the database 
select count(s.id) as count, c.name from smartphone as s
	Inner join Brand as b on s.brand=b.id
    inner join country as c on b.country=c.code
    group by c.name;
   