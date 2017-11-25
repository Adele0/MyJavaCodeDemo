-- 查询所有表数据,尽量加分号
SELECT * FROM employee;
-- 查询表中多个数据，用逗号分开
SELECT emp_name,emp_id FROM employee;
-- 查询不同数据
SELECT DISTINCT salary FROM employee;
-- 运算：日工资,年工资（as可要可不要） 取有空格的别名时，应该用单引号括起来
SELECT emp_name,salary/30 as 日薪 FROM employee;
SELECT emp_name,salary*12 年薪 FROM employee;
SELECT emp_name,(salary*12-10000)*0.04 'salary investment' FROM employee;
-- 设置拼接格式（不写工资概括的话，第一行显示为：Contact(emp_name,....)）
SELECT CONCAT(emp_name,'的月工资是：',salary) 工资概括 FROM employee;
