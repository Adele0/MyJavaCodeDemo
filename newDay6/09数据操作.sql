/*操作数据DML（data manipulation language）
	1.插入完整数据 insert into table_name VALUES(value1,value2,value3..)
	2.插入部分数据 insert into table_name（column1,column2,column3）VALUES(value1,value2,value3..)
	3.插入多条数据（MySQL特有）insert into table_name（column1,column2,column3）
*/

-- 1.插入完整数据（要加入列的编号+内容）
INSERT INTO student VALUES(6,'小牛',13,3);
INSERT INTO student VALUES(7,'小狗',14,2);
-- 2.插入部分数据（不用加id，因为id是自动增长的）
INSERT INTO student(s_name,age,clazz) VALUES('小黑',15,1);-- 最后执行的这句
-- 3.插入多条数据(MySQ 批量添加)
INSERT INTO student(s_name,age,clazz)
	VALUES
		('小白',13,3),
		('小绿',15,2),
		('小张',14,2);
-- 了解（复制指定内容）
INSERT INTO student(s_name,age,clazz)
	(
		SELECT s.s_name,s.age,s.clazz FROM student s WHERE s.id=10
	)

-- 更新 UPDATE table_name SET columnName = VALUE[, columnName = VALUE]...[WHERE CONDITION]
UPDATE student SET s_name='小不张' WHERE id=12;

-- 将售价大于900元的，售价上调0.2倍（先查询后update）
SELECT * FROM category WHERE sale_price>900;
UPDATE category SET sale_price=sale_price*1.2 WHERE sale_price>900;

-- 将售价大于1000元的无线鼠标，售价上调0.1倍（先查询后update）
SELECT * FROM category c,mouse m 
	WHERE c.category_id=m.id 
	AND m.category_name='无线鼠标'
	AND c.sale_price>1000;

UPDATE category c, mouse m SET c.sale_price=c.sale_price*1.1 
	WHERE c.category_id=m.id 
	AND m.category_name='无线鼠标'
	AND c.sale_price>1000;

-- 删除数据 DELETE FROM table_name[WHERE CONDITION]
DELETE FROM student WHERE id=12;