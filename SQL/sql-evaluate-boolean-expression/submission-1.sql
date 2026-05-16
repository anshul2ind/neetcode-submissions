-- Write your query below
select e."left_operand", e.operator, e."right_operand",
( 
    CASE e.operator
    WHEN '>' then lv."value" > rv."value"
    WHEN '<' then lv."value" < rv."value"
    WHEN '=' then lv."value" = rv."value"
    END
) as "value" from expressions e
JOIN variables lv ON lv.name = e.left_operand
JOIN variables rv ON rv.name = e.right_operand