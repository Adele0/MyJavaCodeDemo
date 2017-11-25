/*执行顺序 FROM --> WHERE --> SELECT --> ORDER BY
可以给表取别名，然后使用该别名。 例如：SELECT e.emp_name FROM employee e WHERE e.salary >= 6000;
*/

-- 查询表中满足工资大于6000的所有信息
SELECT * FROM employee WHERE salary >= 6000;

-- 查询表中满足工资在指定区间的方法（between and是闭区间）
SELECT emp_name,salary FROM employee WHERE salary >= 6000 AND salary<=12000;
SELECT emp_name,salary FROM employee WHERE salary NOT BETWEEN 6000 AND 12000;

-- 查询表中同时满足工资大于6000和指定ID的
SELECT emp_name,salary FROM employee WHERE salary>=6000 && emp_id<>2 ;

-- AND 和&& 都可以    不等于用!= 或者<>表示  或者OR（返回true）
SELECT emp_name,salary FROM employee WHERE salary>=6000 AND emp_id !=2 ;

-- 集合查询 IN 一般用于ID主键 或者 外键
SELECT id,emp_name,salary FROM employee WHERE emp_id in(2,4,6,8,10);
SELECT id,emp_name,salary FROM employee WHERE emp_id not in(2,4,6,8,10);

-- 模糊查询 LIKE ''   通配符% 表示0到多个字符 而通配符_表示一个字符
SELECT emp_name,salary FROM employee WHERE emp_name LIKE '%e_';
SELECT emp_name,salary FROM employee WHERE emp_name LIKE '%e_'AND salary>5000;
