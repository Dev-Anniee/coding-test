SELECT department, COUNT(id) AS employee_count, ROUND(AVG(salary),1) AS avg_salary
FROM employees
GROUP BY department
HAVING COUNT(id)>=2
ORDER BY department;