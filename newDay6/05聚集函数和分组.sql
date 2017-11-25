-- 执行顺序 FROM --> WHERE --> SELECT --> ORDER BY
-- AVG平均值
SELECT AVG(salary) FROM employee;

-- 总记录数（注意在java中必须使用long接收）
SELECT COUNT(*)FROM employee;
SELECT COUNT(id)FROM employee;
SELECT COUNT(id)FROM employee WHERE salary=7000;

-- MAX(最大) MIN(最小) SUM(总和)
SELECT MAX(salary)最高工资,MIN(salary)最低工资 FROM employee;

-- 分组 GROUP BY  可以在HAVING中使用 不能在WHERE使用
SELECT dep_id 部门编号,MAX(salary)该部门最高工资 FROM employee GROUP BY dep_id;
SELECT dep_id 部门编号,AVG(salary)该部门平均工资 FROM employee GROUP BY dep_id;
SELECT dep_id 部门编号,COUNT(id)该部门员工数 FROM employee GROUP BY dep_id;
SELECT dep_id 部门编号,COUNT(id)该部门工资大于6K的员工数 FROM employee WHERE salary > 6000 GROUP BY dep_id;
-- 错误写法：SELECT dep_id 部门编号,COUNT(id)该部门工资大于6K的员工数 FROM employee GROUP BY dep_id HAVING salary > 6000;
SELECT dep_id 部门编号,SUM(salary)部门工资薪水之和2W以上 FROM employee GROUP BY dep_id HAVING SUM(salary)>20000;

-- 了解 1=1
SELECT * FROM employee WHERE 1=1;
SELECT * FROM employee WHERE 1=1 and emp_id='1';