-- Write your query below
SELECT u.name, sum(CASE WHEN r.distance > 0 THEN r.distance ELSE 0 END) as travelled_distance
FROM users u
LEFT JOIN rides r ON r.user_id = u.id
GROUP BY u.name
ORDER BY travelled_distance desc, u.name