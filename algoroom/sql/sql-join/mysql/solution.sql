SELECT c.id, c.name 
FROM customers c
LEFT JOIN orders o on o.customer_id = c.id
WHERE o.id is NULL
ORDER BY c.id, c.name ;